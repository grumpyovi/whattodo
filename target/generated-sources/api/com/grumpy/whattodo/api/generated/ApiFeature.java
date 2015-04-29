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

import javax.ws.rs.core.Feature;
import javax.ws.rs.core.FeatureContext;

/**
 * JAX RS feature which registers the API resources defined in the RAML.
 */
public class ApiFeature implements Feature
{
	@Override
	public boolean configure(final FeatureContext context)
	{
		context.register(DefaultWishlistsResource.class);
		return true;
	}
}
