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

import com.grumpy.whattodo.api.generated.Whattodo;
import com.grumpy.whattodo.api.generated.YaasAwareParameters;
import com.grumpy.whattodo.utility.ErrorHandler;


@ManagedBean
public class WhattodoService
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
	public Response get(final YaasAwareParameters yassAware)
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

			whattodos.add(mapDocumentData(documentWhattodo));
		}

		return Response.ok().entity(whattodos).build();
	}

	/* POST / */
	public Response post(final YaasAwareParameters yassAware, final UriInfo uriInfo, final Whattodo whattodo)
	{
		final String whattodoId = whattodo.getId();

		final String authorization = oAuth2Client.requestAccessToken(yassAware.getHybrisTenant());

		final DocumentRepositoryClient client = new DocumentRepositoryClient(DocumentRepositoryClient.DEFAULT_BASE_URI);
		Response response = null;
		try
		{
			response = client.tenant(yassAware.getHybrisTenant())
					.clientData(this.clientId)
					.type(WHATTODO_PATH)
					.dataId(whattodoId)
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
		return Response.created(createdLocation).build();
	}

	/* GET //{whattodoId} */
	public Response getByWhattodoId(final YaasAwareParameters yassAware, final java.lang.String whattodoId)
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
		return Response.ok(mapDocumentData(data)).build();

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

	private Whattodo mapDocumentData(final DocumentWhattodo data)
	{
		final Whattodo result = new Whattodo();
		result.setId(data.getId());
		final String descriptption = data.getDescription();
		result.setDescription(descriptption);
		result.setItems(data.getItems());
		result.setOwner(data.getOwner());
		result.setTitle(data.getTitle());
		result.set(data.getUrl());
		result.setCreatedAt(data.getCreatedAt());

		return result;
	}
}