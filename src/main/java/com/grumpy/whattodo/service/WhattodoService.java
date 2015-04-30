package com.grumpy.whattodo.service;

import com.hybris.patterns.schemas.ResourceLocation;
import com.hybris.repository.client.DocumentRepositoryClient;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.ManagedBean;
import javax.inject.Inject;
import javax.ws.rs.InternalServerErrorException;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriInfo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.HttpClientErrorException;

import com.grumpy.whattodo.api.generated.Uservote;
import com.grumpy.whattodo.api.generated.Whattodo;
import com.grumpy.whattodo.api.generated.YaasAwareParameters;
import com.grumpy.whattodo.utility.ErrorHandler;


@ManagedBean
public class WhattodoService
{

	public static final String WHATTODO_PATH = "whattodo";

	@Inject
	private com.grumpy.whattodo.client.OAuth2ServiceClient oAuth2Client;

	@Inject
	private UservoteService uservoteService;


	private String clientId;

	@Value("${YAAS_CLIENT_ID}")
	public void setClientId(final String clientId)
	{
		this.clientId = clientId;
	}

	/* GET / */
	public List<Whattodo> get(final YaasAwareParameters yassAware)
	{
		final String authorization = oAuth2Client.requestAccessToken(yassAware.getHybrisTenant());

		final DocumentRepositoryClient client = new DocumentRepositoryClient(DocumentRepositoryClient.DEFAULT_BASE_URI);
		Response response = null;
		try
		{
			response = client.tenant(yassAware.getHybrisTenant())
					.clientData(this.clientId)
					.type(WHATTODO_PATH)
					.prepareGet()
					.withHeader("Authorization", authorization)
					.execute();
		}
		catch (final HttpClientErrorException e)
		{
			ErrorHandler.handleResponseStatusCode(e);
		}

		if (response.getStatus() != Status.OK.getStatusCode())
		{
			throw new InternalServerErrorException();
		}

		final DocumentWhattodo[] responseData = response.readEntity(DocumentWhattodo[].class);
		final ArrayList<Whattodo> whattodos = new ArrayList<Whattodo>();
		for (final DocumentWhattodo documentWhattodo : responseData)
		{

			final Whattodo whattodo = mapDocumentData(documentWhattodo);
			final List<Uservote> uservotes = uservoteService.getByWhattodoId(yassAware, whattodo.getId());
			whattodo.setCurrentPositiveVoteState(getCountVotes(true, uservotes)); // getPositive
			whattodo.setCurrentNegativeVoteState(getCountVotes(false, uservotes)); // getNegative
			whattodos.add(whattodo);
		}

		return whattodos;
	}

	/* POST / */
	public URI post(final YaasAwareParameters yassAware, final UriInfo uriInfo, final Whattodo whattodo)
	{
		// final String whattodoId = whattodo.getId();

		final String authorization = oAuth2Client.requestAccessToken(yassAware.getHybrisTenant());

		final DocumentRepositoryClient client = new DocumentRepositoryClient(DocumentRepositoryClient.DEFAULT_BASE_URI);
		Response response = null;
		try
		{
			response = client.tenant(yassAware.getHybrisTenant())
					.clientData(this.clientId)
					.type(WHATTODO_PATH)
					// .dataId()
					// .dataId(whattodoId)
					.preparePost()
					.withHeader("Authorization", authorization)
					.withPayload(Entity.json(whattodo))
					.execute();
		}
		catch (final HttpClientErrorException e)
		{
			ErrorHandler.handleResponseStatusCode(e);
		}

		if (response.getStatus() != Status.CREATED.getStatusCode())
		{
			throw new InternalServerErrorException();
		}

		final ResourceLocation location = response.readEntity(ResourceLocation.class);
		final URI createdLocation = uriInfo.getRequestUriBuilder().path("/" + location.getId()).build();
		System.out.println("ID: " + location.getId());
		return createdLocation;
	}

	/* GET //{whattodoId} */
	public Whattodo getByWhattodoId(final YaasAwareParameters yassAware, final java.lang.String whattodoId)
	{
		final String authorization = oAuth2Client.requestAccessToken(yassAware.getHybrisTenant());

		final DocumentRepositoryClient client = new DocumentRepositoryClient(DocumentRepositoryClient.DEFAULT_BASE_URI);
		Response response = null;
		try
		{
			response = client.tenant(yassAware.getHybrisTenant())
					.clientData(this.clientId)
					.type(WHATTODO_PATH)
					.dataId(whattodoId)
					.prepareGet()
					.withHeader("Authorization", authorization)
					.execute();
		}
		catch (final HttpClientErrorException e)
		{
			ErrorHandler.handleResponseStatusCode(e);
		}

		if (response.getStatus() != Status.OK.getStatusCode())
		{
			throw new InternalServerErrorException();
		}

		final DocumentWhattodo data = response.readEntity(DocumentWhattodo.class);
		final Whattodo whattodo = mapDocumentData(data);

		final List<Uservote> uservotes = uservoteService.getByWhattodoId(yassAware, whattodo.getId());

		whattodo.setItems(uservotes);

		whattodo.setCurrentPositiveVoteState(getCountVotes(true, uservotes)); // getPositive
		whattodo.setCurrentNegativeVoteState(getCountVotes(false, uservotes)); // getNegative

		System.out.println("uservotes: " + uservotes);

		return data;

	}

	/* PUT //{whattodoId} */
	public Response putByWhattodoId(final YaasAwareParameters yassAware, final java.lang.String whattodoId,
			final Whattodo whattodo)
	{
		final String authorization = oAuth2Client.requestAccessToken(yassAware.getHybrisTenant());

		final DocumentRepositoryClient client = new DocumentRepositoryClient(DocumentRepositoryClient.DEFAULT_BASE_URI);
		Response response = null;
		try
		{
			response = client.tenant(yassAware.getHybrisTenant())
					.clientData(this.clientId)
					.type(WHATTODO_PATH)
					.dataId(whattodoId)
					.preparePut()
					.withHeader("Authorization", authorization)
					.withPayload(Entity.json(whattodo))
					.execute();
		}
		catch (final HttpClientErrorException e)
		{
			ErrorHandler.handleResponseStatusCode(e);
		}

		if (response.getStatus() != Status.OK.getStatusCode())
		{
			throw new InternalServerErrorException();
		}

		return Response.ok().build();
	}

	/* DELETE //{whattodoId} */
	public Response deleteByWhattodoId(final YaasAwareParameters yassAware, final java.lang.String whattodoId)
	{
		final String authorization = oAuth2Client.requestAccessToken(yassAware.getHybrisTenant());

		final DocumentRepositoryClient client = new DocumentRepositoryClient(DocumentRepositoryClient.DEFAULT_BASE_URI);
		Response response = null;
		try
		{
			response = client.tenant(yassAware.getHybrisTenant())

					.clientData(this.clientId)
					.type(WHATTODO_PATH)
					.dataId(whattodoId)
					.prepareDelete()
					.withHeader("Authorization", authorization)
					.execute();
		}
		catch (final HttpClientErrorException e)
		{
			ErrorHandler.handleResponseStatusCode(e);
		}

		if (response.getStatus() != Status.NO_CONTENT.getStatusCode())
		{
			throw new InternalServerErrorException();
		}

		return Response.noContent().build();
	}

	public String getCountVotes(final Boolean isPositive, final List<Uservote> uservotesList)
	{

		Integer pCount = 0;
		Integer nCount = 0;
		for (final Uservote userVote : uservotesList)
		{
			if (isPositive && userVote.isVote())
			{
				pCount++;
			}
			if (!isPositive && !userVote.isVote())
			{
				nCount++;
			}
		}

		return isPositive.equals(true) ? String.valueOf(pCount) : String.valueOf(nCount);
	}

	private Whattodo mapDocumentData(final DocumentWhattodo data)
	{
		final Whattodo result = new Whattodo();
		result.setId(data.getId());
		final String descriptption = data.getDescription();
		result.setDescription(descriptption);
		result.setItems(data.getItems());
		result.setOwner(data.getOwner());
		result.setContent(data.getContent());
		result.setChannel(data.getChannel());
		result.setCreatedAt(data.getCreatedAt());
		result.setCurrentNegativeVoteState(data.getCurrentNegativeVoteState());
		result.setCurrentPositiveVoteState(data.getCurrentPositiveVoteState());
		result.setTimeframe(data.getTimeframe());
		result.setTypeContent(data.getTypeContent());
		return result;
	}
}
