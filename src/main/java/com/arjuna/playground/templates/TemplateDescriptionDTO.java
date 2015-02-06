/*
 * Copyright (c) 2015, Arjuna Technologies Limited, Newcastle-upon-Tyne, England. All rights reserved.
 */

package com.arjuna.playground.templates;

import java.io.Serializable;

public class TemplateDescriptionDTO implements Serializable
{
	private static final long serialVersionUID = -8748474429953548487L;

	public TemplateDescriptionDTO()
    {
    }

    public TemplateDescriptionDTO(String url, String name, String purpose)
    {
        _url     = url;
        _name    = name;
        _purpose = purpose;
    }

    public String getURL()
    {
        return _url;
    }

    public void setURL(String url)
    {
    	_url = url;
    }

    public String getName()
    {
        return _name;
    }

    public void setName(String name)
    {
    	_name = name;
    }

    public String getPurpose()
    {
        return _purpose;
    }

    public void setPurpose(String purpose)
    {
        _purpose = purpose;
    }

    private String _url;
    private String _name;
    private String _purpose;
}