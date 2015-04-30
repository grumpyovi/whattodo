package com.grumpy.whattodo.service;

import com.grumpy.whattodo.api.generated.Uservote;


public class DocumentUservote extends Uservote
{
	/*
	 * @javax.validation.constraints.Pattern(regexp = "^.+")
	 * 
	 * @javax.validation.constraints.NotNull
	 * 
	 * @JsonIgnore
	 */
	private DocumentMetaData _metaData;

	private String whatToDoFk;
	private String documentId;

	/**
	 * @return the documentId
	 */
	public String getDocumentId()
	{
		return documentId;
	}

	/**
	 * @param documentId the documentId to set
	 */
	public void setDocumentId(final String documentId)
	{
		this.documentId = documentId;
	}

	public String getWhatToDoFk()
	{
		return whatToDoFk;
	}

	public void setWhatToDoFk(final String whatToDoFk)
	{
		this.whatToDoFk = whatToDoFk;
	}

	/*
	 * public DocumentMetaData getMetadata()
	 * {
	 * return _metaData;
	 * }
	 * 
	 * public void setMetadata(final DocumentMetaData _metaData)
	 * {
	 * this._metaData = _metaData;
	 * }
	 */
}
