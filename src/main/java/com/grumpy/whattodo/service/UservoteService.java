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
import com.grumpy.whattodo.api.generated.YaasAwareParameters;
import com.grumpy.whattodo.utility.ErrorHandler;


@ManagedBean
public class UservoteService
{

	public static final String USERVOTE_PATH = "uservote";

	@Inject
	private com.grumpy.whattodo.client.OAuth2ServiceClient oAuth2Client;

	private String clientId;

	@Value("${YAAS_CLIENT_ID}")
	public void setClientId(final String clientId)
	{
		this.clientId = clientId;
	}

	/**
	 * GET /
	 * 
	 * Get all Uservotes
	 * 
	 * */
	public List<Uservote> get(final YaasAwareParameters appAware)
	{
		final String authorization = oAuth2Client.requestAccessToken(appAware.getHybrisTenant());

		final DocumentRepositoryClient client = new DocumentRepositoryClient(DocumentRepositoryClient.DEFAULT_BASE_URI);
		Response response = null;
		try
		{
			response = client.tenant(appAware.getHybrisTenant())
					.clientData(this.clientId)
					.type(USERVOTE_PATH)
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

		final DocumentUservote[] responseData = response.readEntity(DocumentUservote[].class);
		final ArrayList<Uservote> uservotes = new ArrayList<Uservote>();
		for (final DocumentUservote documentuservote : responseData)
		{

			uservotes.add(mapDocumentData(documentuservote));
		}

		return uservotes;
	}

	/**
	 * Get all uservotes for whattodo item
	 * 
	 * @param appAware
	 * @param whattodoId
	 * @return
	 */
	public List<Uservote> getByWhattodoId(final YaasAwareParameters appAware, final String whattodoId)
	{

		final String authorization = oAuth2Client.requestAccessToken(appAware.getHybrisTenant());

		final DocumentRepositoryClient client = new DocumentRepositoryClient(DocumentRepositoryClient.DEFAULT_BASE_URI);
		Response response = null;
		try
		{

			response = client.tenant(appAware.getHybrisTenant())
					.clientData(this.clientId)
					.type(USERVOTE_PATH)
					.prepareGet()
					.withHeader("Authorization", authorization)
					.withQ("whatToDoFk:\"" + whattodoId + "\"")
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

		// final Object[] responseDataObj = response.readEntity(Object[].class);
		// responseDataObj.toString();
		final DocumentUservote[] responseData = response.readEntity(DocumentUservote[].class);
		final ArrayList<Uservote> uservotes = new ArrayList<Uservote>();
		for (final DocumentUservote documentuservote : responseData)
		{

			uservotes.add(mapDocumentData(documentuservote));
		}

		return uservotes;
	}

	/**
	 * Create new uservote for a whattodo item
	 * 
	 * @param appAware
	 * @param uriInfo
	 * @param userVote - user who vote for item
	 * @param whattodoId - id of whattodo item
	 * @return
	 */
	public URI post(final YaasAwareParameters appAware, final UriInfo uriInfo, final Uservote userVote,
			final String whattodoId)
	{
		final String uservoteId = userVote.getUserid();
		final String documentId = whattodoId + "|" + uservoteId;

		final DocumentUservote documentUserVote = new DocumentUservote();
		documentUserVote.setDocumentId(documentId);
		documentUserVote.setWhatToDoFk(whattodoId);
		documentUserVote.setUserid(uservoteId);
		documentUserVote.setVote(userVote.isVote());
		documentUserVote.setMetadata(new DocumentMetaData());

		final String authorization = oAuth2Client.requestAccessToken(appAware.getHybrisTenant());

		final DocumentRepositoryClient client = new DocumentRepositoryClient(DocumentRepositoryClient.DEFAULT_BASE_URI);
		Response response = null;
		try
		{
			response = client.tenant(appAware.getHybrisTenant())
					.clientData(this.clientId)
					.type(USERVOTE_PATH)
					.dataId(documentId)
					.preparePost()
					.withHeader("Authorization", authorization)
					.withPayload(Entity.json(documentUserVote))
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
		return createdLocation;
	}

	/* GET //{userVoteId} */
	public Uservote getByUservoteId(final YaasAwareParameters appAware, final java.lang.String userVoteId)
	{
		final String authorization = oAuth2Client.requestAccessToken(appAware.getHybrisTenant());

		final DocumentRepositoryClient client = new DocumentRepositoryClient(DocumentRepositoryClient.DEFAULT_BASE_URI);
		Response response = null;
		try
		{
			response = client.tenant(appAware.getHybrisTenant())
					.clientData(this.clientId)
					.type(USERVOTE_PATH)
					.dataId(userVoteId)
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

		final DocumentUservote data = response.readEntity(DocumentUservote.class);
		return mapDocumentData(data);

	}

	private Uservote mapDocumentData(final DocumentUservote data)
	{
		final Uservote result = new Uservote();
		result.setUserid(data.getUserid());
		result.setVote(data.isVote());

		return result;
	}
}
