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

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto.
 */
@javax.annotation.Generated(value = "hybris", date = "Wed Apr 29 11:47:03 CEST 2015")
@XmlRootElement
public class Detail
{

	private java.lang.String _field;

	@javax.validation.constraints.Pattern(regexp="[a-z]+[a-z_]*[a-z]+")
	@javax.validation.constraints.NotNull
	private java.lang.String _type;

	private java.lang.String _message;

	private java.net.URI _moreInfo;
	
	public java.lang.String getField()
	{
		return _field;
	}
	
	public java.lang.String getType()
	{
		return _type;
	}
	
	public java.lang.String getMessage()
	{
		return _message;
	}
	
	public java.net.URI getMoreInfo()
	{
		return _moreInfo;
	}



	public void setField(final java.lang.String _field)
	{
		this._field = _field;
	}

	public void setType(final java.lang.String _type)
	{
		this._type = _type;
	}

	public void setMessage(final java.lang.String _message)
	{
		this._message = _message;
	}

	public void setMoreInfo(final java.net.URI _moreInfo)
	{
		this._moreInfo = _moreInfo;
	}





}
