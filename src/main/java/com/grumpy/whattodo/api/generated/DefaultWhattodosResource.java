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

import javax.inject.Singleton;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;

/**
* Resource class containing the custom logic. Please put your logic here!
*/
@Component("apiWhattodosResource")
@Singleton
public class DefaultWhattodosResource implements com.grumpy.whattodo.api.generated.WhattodosResource
{
	@javax.ws.rs.core.Context
	private javax.ws.rs.core.UriInfo uriInfo;

	/* GET / */
	@Override
	public Response get(final PagedParameters paged, final YaasAwareParameters yaasAware)
	{
		// place some logic here
		return Response.ok()
			.entity(new java.util.ArrayList<>()).build();
	}

	/* POST / */
	@Override
	public Response post(final YaasAwareParameters yaasAware, final Whattodo whattodo)
	{
		// place some logic here
		return Response.created(uriInfo.getAbsolutePath())
			.build();
	}

	/* GET /{whattodoid} */
	@Override
	public Response getByWhattodoid(final YaasAwareParameters yaasAware, final java.lang.String whattodoid)
	{
		// place some logic here
		return Response.ok()
			.entity(new Whattodo()).build();
	}

	/* PUT /{whattodoid} */
	@Override
	public Response putByWhattodoid(final YaasAwareParameters yaasAware, final java.lang.String whattodoid, final Whattodo whattodo)
	{
		// place some logic here
		return Response.ok()
			.build();
	}

	/* DELETE /{whattodoid} */
	@Override
	public Response deleteByWhattodoid(final YaasAwareParameters yaasAware, final java.lang.String whattodoid)
	{
		// place some logic here
		return Response.noContent()
			.build();
	}

	/* GET /{whattodoid}/uservotes */
	@Override
	public Response getByWhattodoidUservotes(final YaasAwareParameters yaasAware, final java.lang.String whattodoid)
	{
		// place some logic here
		return Response.ok()
			.entity(new java.util.ArrayList<>()).build();
	}

	/* POST /{whattodoid}/uservotes */
	@Override
	public Response postByWhattodoidUservotes(final YaasAwareParameters yaasAware, final java.lang.String whattodoid, final Uservote uservote)
	{
		// place some logic here
		return Response.created(uriInfo.getAbsolutePath())
			.build();
	}

	/* POST /{whattodoid}/uservotes/{uservoteid} */
	@Override
	public Response postByWhattodoidUservotesByUservoteid(final YaasAwareParameters yaasAware, final java.lang.String whattodoid, final java.lang.String uservoteid, final java.lang.String string)
	{
		// place some logic here
		return Response.created(uriInfo.getAbsolutePath())
			.build();
	}

	/* GET /{whattodoid}/uservotes/{uservoteid} */
	@Override
	public Response getByWhattodoidUservotesByUservoteid(final YaasAwareParameters yaasAware, final java.lang.String whattodoid, final java.lang.String uservoteid)
	{
		// place some logic here
		return Response.ok()
			.entity(new Uservote()).build();
	}

	/* PUT /{whattodoid}/uservotes/{uservoteid} */
	@Override
	public Response putByWhattodoidUservotesByUservoteid(final java.lang.String whattodoid, final java.lang.String uservoteid, final Uservote uservote)
	{
		// place some logic here
		return Response.ok()
			.build();
	}

	/* DELETE /{whattodoid}/uservotes/{uservoteid} */
	@Override
	public Response deleteByWhattodoidUservotesByUservoteid(final java.lang.String whattodoid, final java.lang.String uservoteid)
	{
		// place some logic here
		return Response.noContent()
			.build();
	}

}
