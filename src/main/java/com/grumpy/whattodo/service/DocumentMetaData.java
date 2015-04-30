package com.grumpy.whattodo.service;

public class DocumentMetaData
{

	private String _createdAt;
	private String _modifiedAt;
	private String _version;

	public String getCreatedAt()
	{
		return _createdAt;
	}

	public void setCreatedAt(final String createdAt)
	{
		this._createdAt = createdAt;
	}

	public String getModifiedAt()
	{
		return _modifiedAt;
	}

	public void setModifiedAt(final String modifiedAt)
	{
		this._modifiedAt = modifiedAt;
	}

	public String getVersion()
	{
		return _version;
	}

	public void setVersion(final String version)
	{
		this._version = version;
	}
}
