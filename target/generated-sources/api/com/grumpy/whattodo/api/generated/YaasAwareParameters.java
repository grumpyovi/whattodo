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

/**
 * Generated parameter dto.
 */
@javax.annotation.Generated(value = "hybris", date = "Wed Apr 29 14:23:18 CEST 2015")
public class YaasAwareParameters
{
	@javax.validation.constraints.Pattern(regexp="^[a-z][a-z0-9]{2,15}[.][a-z][a-z0-9-]{0,30}[a-z0-9]$")
	@javax.validation.constraints.Size(min=6,max=49)
	@javax.ws.rs.HeaderParam("hybris-client")
	private java.lang.String hybrisClient;

	@javax.validation.constraints.Pattern(regexp="^[a-z][a-z0-9]+$")
	@javax.validation.constraints.Size(min=3,max=16)
	@javax.ws.rs.HeaderParam("hybris-tenant")
	private java.lang.String hybrisTenant;

	@javax.ws.rs.HeaderParam("hybris-user")
	private java.lang.String hybrisUser;

	@javax.validation.constraints.Pattern(regexp="^([a-zA-Z0-9._=]{1,32}( [a-zA-Z0-9._=]{1,32})*)?$")
	@javax.ws.rs.HeaderParam("hybris-scopes")
	private java.lang.String hybrisScopes;

	@javax.ws.rs.HeaderParam("hybris-request-id")
	private java.lang.String hybrisRequestId;

	@javax.validation.constraints.DecimalMin(value="1")
	@javax.ws.rs.HeaderParam("hybris-hop")
	private java.lang.Integer hybrisHop;

	public java.lang.String getHybrisClient()
	{
		return hybrisClient;
	}

	public java.lang.String getHybrisTenant()
	{
		return hybrisTenant;
	}

	public java.lang.String getHybrisUser()
	{
		return hybrisUser;
	}

	public java.lang.String getHybrisScopes()
	{
		return hybrisScopes;
	}

	public java.lang.String getHybrisRequestId()
	{
		return hybrisRequestId;
	}

	public java.lang.Integer getHybrisHop()
	{
		return hybrisHop;
	}

	public void setHybrisClient(final java.lang.String hybrisClient)
	{
		this.hybrisClient = hybrisClient;
	}

	public void setHybrisTenant(final java.lang.String hybrisTenant)
	{
		this.hybrisTenant = hybrisTenant;
	}

	public void setHybrisUser(final java.lang.String hybrisUser)
	{
		this.hybrisUser = hybrisUser;
	}

	public void setHybrisScopes(final java.lang.String hybrisScopes)
	{
		this.hybrisScopes = hybrisScopes;
	}

	public void setHybrisRequestId(final java.lang.String hybrisRequestId)
	{
		this.hybrisRequestId = hybrisRequestId;
	}

	public void setHybrisHop(final java.lang.Integer hybrisHop)
	{
		this.hybrisHop = hybrisHop;
	}

}
