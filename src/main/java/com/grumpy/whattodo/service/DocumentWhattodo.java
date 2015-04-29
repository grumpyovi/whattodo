package com.grumpy.whattodo.service;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.grumpy.whattodo.api.generated.Whattodo;


public class DocumentWhattodo extends Whattodo
{
	@javax.validation.constraints.Pattern(regexp = "^.+")
	@javax.validation.constraints.NotNull
	@JsonIgnore
	private DocumentMetaData _metaData;

	public DocumentMetaData getMetadata()
	{
		return _metaData;
	}

	public void setMetadata(final DocumentMetaData _metaData)
	{
		this._metaData = _metaData;
	}
}
