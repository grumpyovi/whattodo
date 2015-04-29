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
@javax.annotation.Generated(value = "hybris", date = "Wed Apr 29 13:23:19 CEST 2015")
@XmlRootElement
public class WishlistItem
{

	@javax.validation.constraints.Pattern(regexp="^.+")
	@javax.validation.constraints.NotNull
	private java.lang.String _product;

	@javax.validation.constraints.DecimalMin(value="1")
	@javax.validation.constraints.NotNull
	private java.lang.Integer _amount;

	private java.lang.String _note;

	private java.util.Date _createdAt;
	
	public java.lang.String getProduct()
	{
		return _product;
	}
	
	public java.lang.Integer getAmount()
	{
		return _amount;
	}
	
	public java.lang.String getNote()
	{
		return _note;
	}
	
	public java.util.Date getCreatedAt()
	{
		return _createdAt;
	}



	public void setProduct(final java.lang.String _product)
	{
		this._product = _product;
	}

	public void setAmount(final java.lang.Integer _amount)
	{
		this._amount = _amount;
	}

	public void setNote(final java.lang.String _note)
	{
		this._note = _note;
	}

	public void setCreatedAt(final java.util.Date _createdAt)
	{
		this._createdAt = _createdAt;
	}





}
