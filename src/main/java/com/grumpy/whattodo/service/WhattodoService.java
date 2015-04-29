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
	public Response get(final AppAwareParameters appAware)
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

		final DocumentWishlist[] responseData = response.readEntity(DocumentWishlist[].class);
		final ArrayList<Whattodo> wishlists = new ArrayList<Whattodo>();
		for (final DocumentWishlist documentWishlist : responseData)
		{

			wishlists.add(mapDocumentData(documentWishlist));
		}

		return Response.ok().entity(wishlists).build();
	}

	/* POST / */
	public Response post(final AppAwareParameters appAware, final UriInfo uriInfo, final Wishlist wishlist)
	{
		final String wishlistId = wishlist.getId();

		final String authorization = oAuth2Client.requestAccessToken(appAware.getHybrisTenant());

		final DocumentRepositoryClient client = new DocumentRepositoryClient(DocumentRepositoryClient.DEFAULT_BASE_URI);
		Response response = null;
		try
		{
			response = client.tenant(appAware.getHybrisTenant())
					.clientData(this.clientId)
					.type(WHATTODO_PATH)
					.dataId(wishlistId)
					.preparePost()
					.withHeader("Authorization", authorization)
					.withPayload(Entity.json(wishlist))
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
	public Response getByWishlistId(final AppAwareParameters appAware, final java.lang.String wishlistId)
	{
		final String authorization = oAuth2Client.requestAccessToken(appAware.getHybrisTenant());

		final DocumentRepositoryClient client = new DocumentRepositoryClient(DocumentRepositoryClient.DEFAULT_BASE_URI);
		Response response = null;
		try
		{
			response = client.tenant(appAware.getHybrisTenant())
					.clientData(this.clientId)
					.type(WHATTODO_PATH)
					.dataId(wishlistId)
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

		final DocumentWishlist data = response.readEntity(DocumentWishlist.class);
		return Response.ok(mapDocumentData(data)).build();

	}

	/* PUT //{wishlistId} */
	public Response putByWishlistId(final AppAwareParameters appAware, final java.lang.String wishlistId,
			final Wishlist wishlist)
	{
		final String authorization = oAuth2Client.requestAccessToken(appAware.getHybrisTenant());

		final DocumentRepositoryClient client = new DocumentRepositoryClient(DocumentRepositoryClient.DEFAULT_BASE_URI);
		Response response = null;
		try
		{
			response = client.tenant(appAware.getHybrisTenant())
					.clientData(this.clientId)
					.type(WHATTODO_PATH)
					.dataId(wishlistId)
					.preparePut()
					.withHeader("Authorization", authorization)
					.withPayload(Entity.json(wishlist))
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
	public Response deleteByWishlistId(final AppAwareParameters appAware, final java.lang.String wishlistId)
	{
		final String authorization = oAuth2Client.requestAccessToken(appAware.getHybrisTenant());

		final DocumentRepositoryClient client = new DocumentRepositoryClient(DocumentRepositoryClient.DEFAULT_BASE_URI);
		Response response = null;
		try
		{
			response = client.tenant(appAware.getHybrisTenant())

					.clientData(this.clientId)
					.type(WHATTODO_PATH)
					.dataId(wishlistId)
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

	private Wishlist mapDocumentData(final DocumentWishlist data)
	{
		final Wishlist result = new Wishlist();
		result.setId(data.getId());
		final String descriptption = data.getDescription();
		result.setDescription(descriptption);
		result.setItems(data.getItems());
		result.setOwner(data.getOwner());
		result.setTitle(data.getTitle());
		result.setUrl(data.getUrl());
		result.setCreatedAt(data.getCreatedAt());

		return result;
	}
}
