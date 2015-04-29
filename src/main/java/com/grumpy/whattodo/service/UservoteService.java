package com.grumpy.whattodo.service;

import com.hybris.patterns.schemas.ResourceLocation;
import com.hybris.repository.client.DocumentRepositoryClient;

import java.net.URI;
import java.util.ArrayList;

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

	public static final String WHATTODO_PATH = "whattodo";

	@Inject
	private com.grumpy.whattodo.client.OAuth2ServiceClient oAuth2Client;

	private String clientId;

	@Value("${YAAS_CLIENT_ID}")
	public void setClientId(final String clientId)
	{
		this.clientId = clientId;
	}

	/* GET / */
	public Response get(final YaasAwareParameters appAware)
	{
		final String authorization = oAuth2Client.requestAccessToken(appAware.getHybrisTenant());

		final DocumentRepositoryClient client = new DocumentRepositoryClient(DocumentRepositoryClient.DEFAULT_BASE_URI);
		Response response = null;
		try
		{
			response = client.tenant(appAware.getHybrisTenant())
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

		final DocumentUservote[] responseData = response.readEntity(DocumentUservote[].class);
		final ArrayList<Uservote> uservotes = new ArrayList<Uservote>();
		for (final DocumentUservote documentuservote : responseData)
		{

			uservotes.add(mapDocumentData(documentuservote));
		}

		return Response.ok().entity(uservotes).build();
	}

	/* POST / */
	public Response post(final YaasAwareParameters appAware, final UriInfo uriInfo, final Uservote Uservote)
	{
		final String uservoteId = Uservote.getUserid();

		final String authorization = oAuth2Client.requestAccessToken(appAware.getHybrisTenant());

		final DocumentRepositoryClient client = new DocumentRepositoryClient(DocumentRepositoryClient.DEFAULT_BASE_URI);
		Response response = null;
		try
		{
			response = client.tenant(appAware.getHybrisTenant())
					.clientData(this.clientId)
					.type(WHATTODO_PATH)
					.dataId(uservoteId)
					.preparePost()
					.withHeader("Authorization", authorization)
					.withPayload(Entity.json(Uservote))
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
		return Response.created(createdLocation).build();
	}

	/* GET //{wishlistId} */
	public Response getByUservoteId(final YaasAwareParameters appAware, final java.lang.String userVoteId)
	{
		final String authorization = oAuth2Client.requestAccessToken(appAware.getHybrisTenant());

		final DocumentRepositoryClient client = new DocumentRepositoryClient(DocumentRepositoryClient.DEFAULT_BASE_URI);
		Response response = null;
		try
		{
			response = client.tenant(appAware.getHybrisTenant())
					.clientData(this.clientId)
					.type(WHATTODO_PATH)
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
		return Response.ok(mapDocumentData(data)).build();

	}

	/* PUT //{wishlistId} */
	public Response putByWishlistId(final YaasAwareParameters appAware, final java.lang.String uservoteId,
			final Uservote Uservote)
	{
		final String authorization = oAuth2Client.requestAccessToken(appAware.getHybrisTenant());

		final DocumentRepositoryClient client = new DocumentRepositoryClient(DocumentRepositoryClient.DEFAULT_BASE_URI);
		Response response = null;
		try
		{
			response = client.tenant(appAware.getHybrisTenant())
					.clientData(this.clientId)
					.type(WHATTODO_PATH)
					.dataId(uservoteId)
					.preparePut()
					.withHeader("Authorization", authorization)
					.withPayload(Entity.json(Uservote))
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

	/* DELETE //{wishlistId} */
	public Response deleteByWishlistId(final YaasAwareParameters appAware, final java.lang.String uservoteId)
	{
		final String authorization = oAuth2Client.requestAccessToken(appAware.getHybrisTenant());

		final DocumentRepositoryClient client = new DocumentRepositoryClient(DocumentRepositoryClient.DEFAULT_BASE_URI);
		Response response = null;
		try
		{
			response = client.tenant(appAware.getHybrisTenant())

					.clientData(this.clientId)
					.type(WHATTODO_PATH)
					.dataId(uservoteId)
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

	private Uservote mapDocumentData(final DocumentUservote data)
	{
		final Uservote result = new Uservote();
		result.setUserid(data.getUserid());
		result.setVote(data.isVote());

		return result;
	}
}
