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

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.glassfish.jersey.server.ResourceConfig;
import org.junit.Assert;
import org.junit.Test;


public final class DefaultWhattodosResourceTest extends com.grumpy.whattodo.api.generated.AbstractResourceTest
{
	/**
	 * Server side root resource /whattodos,
	 * evaluated with some default value(s).
	 */
	private static final String ROOT_RESOURCE_PATH = "/whattodos";

	/* get() /whattodos */
	@Test
	public void testGet()
	{
		final WebTarget target = getRootTarget(ROOT_RESOURCE_PATH).path("");

		final Response response = target.request().get();

		Assert.assertNotNull("Response must not be null", response);
		Assert.assertEquals("Response does not have expected response code", Status.OK.getStatusCode(), response.getStatus());
	}

	/* post(entity) /whattodos */
	@Test
	public void testPostWithWhattodo()
	{
		final WebTarget target = getRootTarget(ROOT_RESOURCE_PATH).path("");
		final com.grumpy.whattodo.api.generated.Whattodo entityBody =
		new com.grumpy.whattodo.api.generated.Whattodo();
		final javax.ws.rs.client.Entity<com.grumpy.whattodo.api.generated.Whattodo> entity =
		javax.ws.rs.client.Entity.entity(entityBody,"application/json");

		final Response response = target.request().post(entity);

		Assert.assertNotNull("Response must not be null", response);
		Assert.assertEquals("Response does not have expected response code", Status.CREATED.getStatusCode(), response.getStatus());
	}

	/* get() /whattodos/whattodoid */
	@Test
	public void testGetByWhattodoid()
	{
		final WebTarget target = getRootTarget(ROOT_RESOURCE_PATH).path("/whattodoid");

		final Response response = target.request().get();

		Assert.assertNotNull("Response must not be null", response);
		Assert.assertEquals("Response does not have expected response code", Status.OK.getStatusCode(), response.getStatus());
	}

	/* put(entity) /whattodos/whattodoid */
	@Test
	public void testPutByWhattodoidWithWhattodo()
	{
		final WebTarget target = getRootTarget(ROOT_RESOURCE_PATH).path("/whattodoid");
		final com.grumpy.whattodo.api.generated.Whattodo entityBody =
		new com.grumpy.whattodo.api.generated.Whattodo();
		final javax.ws.rs.client.Entity<com.grumpy.whattodo.api.generated.Whattodo> entity =
		javax.ws.rs.client.Entity.entity(entityBody,"application/json");

		final Response response = target.request().put(entity);

		Assert.assertNotNull("Response must not be null", response);
		Assert.assertEquals("Response does not have expected response code", Status.OK.getStatusCode(), response.getStatus());
	}

	/* delete() /whattodos/whattodoid */
	@Test
	public void testDeleteByWhattodoid()
	{
		final WebTarget target = getRootTarget(ROOT_RESOURCE_PATH).path("/whattodoid");

		final Response response = target.request().delete();

		Assert.assertNotNull("Response must not be null", response);
		Assert.assertEquals("Response does not have expected response code", Status.NO_CONTENT.getStatusCode(), response.getStatus());
	}

	/* get() /whattodos/whattodoid/uservotes */
	@Test
	public void testGetByWhattodoidUservotes()
	{
		final WebTarget target = getRootTarget(ROOT_RESOURCE_PATH).path("/whattodoid/uservotes");

		final Response response = target.request().get();

		Assert.assertNotNull("Response must not be null", response);
		Assert.assertEquals("Response does not have expected response code", Status.OK.getStatusCode(), response.getStatus());
	}

	/* post(entity) /whattodos/whattodoid/uservotes */
	@Test
	public void testPostByWhattodoidUservotesWithUservote()
	{
		final WebTarget target = getRootTarget(ROOT_RESOURCE_PATH).path("/whattodoid/uservotes");
		final com.grumpy.whattodo.api.generated.Uservote entityBody =
		new com.grumpy.whattodo.api.generated.Uservote();
		final javax.ws.rs.client.Entity<com.grumpy.whattodo.api.generated.Uservote> entity =
		javax.ws.rs.client.Entity.entity(entityBody,"application/json");

		final Response response = target.request().post(entity);

		Assert.assertNotNull("Response must not be null", response);
		Assert.assertEquals("Response does not have expected response code", Status.CREATED.getStatusCode(), response.getStatus());
	}

	/* post(entity) /whattodos/whattodoid/uservotes/uservoteid */
	@Test
	public void testPostByWhattodoidUservotesByUservoteidWithString()
	{
		final WebTarget target = getRootTarget(ROOT_RESOURCE_PATH).path("/whattodoid/uservotes/uservoteid");
		final java.lang.String entityBody = "test";
		final javax.ws.rs.client.Entity<java.lang.String> entity =
		javax.ws.rs.client.Entity.entity(entityBody,"application/json");

		final Response response = target.request().post(entity);

		Assert.assertNotNull("Response must not be null", response);
		Assert.assertEquals("Response does not have expected response code", Status.CREATED.getStatusCode(), response.getStatus());
	}

	/* get() /whattodos/whattodoid/uservotes/uservoteid */
	@Test
	public void testGetByWhattodoidUservotesByUservoteid()
	{
		final WebTarget target = getRootTarget(ROOT_RESOURCE_PATH).path("/whattodoid/uservotes/uservoteid");

		final Response response = target.request().get();

		Assert.assertNotNull("Response must not be null", response);
		Assert.assertEquals("Response does not have expected response code", Status.OK.getStatusCode(), response.getStatus());
	}

	/* put(entity) /whattodos/whattodoid/uservotes/uservoteid */
	@Test
	public void testPutByWhattodoidUservotesByUservoteidWithUservote()
	{
		final WebTarget target = getRootTarget(ROOT_RESOURCE_PATH).path("/whattodoid/uservotes/uservoteid");
		final com.grumpy.whattodo.api.generated.Uservote entityBody =
		new com.grumpy.whattodo.api.generated.Uservote();
		final javax.ws.rs.client.Entity<com.grumpy.whattodo.api.generated.Uservote> entity =
		javax.ws.rs.client.Entity.entity(entityBody,"application/json");

		final Response response = target.request().put(entity);

		Assert.assertNotNull("Response must not be null", response);
		Assert.assertEquals("Response does not have expected response code", Status.OK.getStatusCode(), response.getStatus());
	}

	/* delete() /whattodos/whattodoid/uservotes/uservoteid */
	@Test
	public void testDeleteByWhattodoidUservotesByUservoteid()
	{
		final WebTarget target = getRootTarget(ROOT_RESOURCE_PATH).path("/whattodoid/uservotes/uservoteid");

		final Response response = target.request().delete();

		Assert.assertNotNull("Response must not be null", response);
		Assert.assertEquals("Response does not have expected response code", Status.NO_CONTENT.getStatusCode(), response.getStatus());
	}

	@Override
	protected ResourceConfig configureApplication()
	{
		final ResourceConfig application = new ResourceConfig();
		application.register(DefaultWhattodosResource.class);
		return application;
	}
}
