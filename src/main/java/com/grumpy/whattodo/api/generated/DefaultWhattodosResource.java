/*
 * [y] hybris Platform
 * 
 * Copyright (c) 2000-2015 hybris AG
 * All rights reserved.
 * 
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 */
package com.grumpy.whattodo.api.generated;

import java.net.URI;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;

import com.grumpy.whattodo.service.UservoteService;
import com.grumpy.whattodo.service.WhattodoService;


/**
 * Resource class containing the custom logic. Please put your logic here!
 */
@Component("apiWhattodosResource")
@Singleton
public class DefaultWhattodosResource implements com.grumpy.whattodo.api.generated.WhattodosResource
{
	@javax.ws.rs.core.Context
	private javax.ws.rs.core.UriInfo uriInfo;

	@Inject
	private WhattodoService whattodoService;

	@Inject
	private UservoteService uservoteService;

	/* GET / */
	@Override
	public Response get(final PagedParameters paged, final YaasAwareParameters yaasAware)
	{
		final List<Whattodo> whattodos = whattodoService.get(yaasAware);
		return Response.ok()
				.entity(whattodos).build();
	}

	/* GET /{whattodoid} */
	@Override
	public Response getByWhattodoid(final YaasAwareParameters yaasAware, final java.lang.String whattodoid)
	{
		final Whattodo whattodo = whattodoService.getByWhattodoId(yaasAware, whattodoid);

		return Response.ok(whattodo).build();
	}

	/* GET /{whattodoid}/uservotes */
	@Override
	public Response getByWhattodoidUservotes(final YaasAwareParameters yaasAware, final java.lang.String whattodoid)
	{
		final List<Uservote> uservotes = uservoteService.getByWhattodoId(yaasAware, whattodoid);

		return Response.ok()
				.entity(uservotes).build();
	}

	/* GET /{whattodoid}/uservotes/{uservoteid} */
	@Override
	public Response getByWhattodoidUservotesByUservoteid(final YaasAwareParameters yaasAware, final java.lang.String whattodoid,
			final java.lang.String uservoteid)
	{
		final Uservote uservote = uservoteService.getByUservoteId(yaasAware, uservoteid);

		return Response.ok()
				.entity(uservote).build();
	}

	/* POST / */
	@Override
	public Response post(final YaasAwareParameters yaasAware, final Whattodo whattodo)
	{
		final URI createdLocation = whattodoService.post(yaasAware, uriInfo, whattodo);

		return Response.created(createdLocation).build();
	}

	/* POST /{whattodoid}/uservotes */
	@Override
	public Response postByWhattodoidUservotes(final YaasAwareParameters yaasAware, final java.lang.String whattodoid,
			final Uservote uservote)
	{

		final URI createdLocation = uservoteService.post(yaasAware, uriInfo, uservote, whattodoid);

		return Response.created(createdLocation).build();
	}

	/*
	 * POST /{whattodoid}/uservotes/{uservoteid}
	 * 
	 * @Override
	 * public Response postByWhattodoidUservotesByUservoteid(final YaasAwareParameters yaasAware, final java.lang.String
	 * whattodoid,
	 * final java.lang.String uservoteid, final java.lang.String string)
	 * {
	 * // TODO
	 * final URI createdLocation = uservoteService.postByWhattodoidUservotesByUservoteid(yaasAware, uriInfo, whattodoid,
	 * uservoteid, string);
	 * 
	 * return Response.created(createdLocation).build();
	 * }
	 */


	// /////////////////////////////////////////////////////////////////////////////////////
	// // NOT NEEDED AT THE MOMENT, NO DELETION, UPDATE POSSIBILITY
	// /////////////////////////////////////////////////////////////////////////////////////

	/* PUT /{whattodoid} */
	@Override
	public Response putByWhattodoid(final YaasAwareParameters yaasAware, final java.lang.String whattodoid, final Whattodo whattodo)
	{
		return whattodoService.putByWhattodoId(yaasAware, whattodoid, whattodo);
	}

	/* DELETE /{whattodoid} */
	@Override
	public Response deleteByWhattodoid(final YaasAwareParameters yaasAware, final java.lang.String whattodoid)
	{

		return whattodoService.deleteByWhattodoId(yaasAware, whattodoid);
	}

	/*
	 * PUT /{whattodoid}/uservotes/{uservoteid}
	 * 
	 * @Override
	 * public Response putByWhattodoidUservotesByUservoteid(final java.lang.String whattodoid, final java.lang.String
	 * uservoteid,
	 * final Uservote uservote)
	 * {
	 * final URI createdLocation = uservoteService.postByWhattodoidUservotesByUservoteid(yaasAware, uriInfo, whattodoid,
	 * uservoteid, string);
	 * // place some logic here
	 * return Response.ok()
	 * .build();
	 * }
	 */

	/* DELETE /{whattodoid}/uservotes/{uservoteid} */
	@Override
	public Response deleteByWhattodoidUservotesByUservoteid(final java.lang.String whattodoid, final java.lang.String uservoteid)
	{
		// place some logic here
		return Response.noContent()
				.build();
	}

	@Override
	public Response putByWhattodoidUservotesByUservoteid(final YaasAwareParameters yaasAware, final String whattodoid,
			final String uservoteid,
			final Uservote uservote)
	{
		// YTODO Auto-generated method stub
		return null;
	}

}
