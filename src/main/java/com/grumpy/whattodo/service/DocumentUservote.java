package com.grumpy.whattodo.service;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.grumpy.whattodo.api.generated.Uservote;


public class DocumentUservote extends Uservote
{

	// @javax.validation.constraints.Pattern(regexp = "^.+")

	// @javax.validation.constraints.NotNull
	@JsonIgnore
	private DocumentMetaData _metaData;

	private String _whatToDoFk;
	private String _documentId;
	private String _id;


	public String getId()
	{
		return _id;
	}

	public void setId(final String id)
	{
		this._id = id;
	}

	/**
	 * @return the documentId
	 */
	public String getDocumentId()
	{
		return _documentId;
	}

	/**
	 * @param documentId the documentId to set
	 */
	public void setDocumentId(final String documentId)
	{
		this._documentId = documentId;
	}

	public String getWhatToDoFk()
	{
		return _whatToDoFk;
	}

	public void setWhatToDoFk(final String whatToDoFk)
	{
		this._whatToDoFk = whatToDoFk;
	}


	public DocumentMetaData getMetadata()
	{
		return _metaData;
	}

	public void setMetadata(final DocumentMetaData _metaData)
	{
		this._metaData = _metaData;
	}

}
