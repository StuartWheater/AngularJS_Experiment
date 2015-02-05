/*
 * Copyright (c) 2013-2015, Arjuna Technologies Limited, Newcastle-upon-Tyne, England. All rights reserved.
 */

package com.arjuna.playground.templates;

import java.io.Serializable;

public class TemplateFieldDescriptionDTO implements Serializable
{
	private static final long serialVersionUID = -8748474429953548487L;

	public TemplateFieldDescriptionDTO()
    {
    }

    public TemplateFieldDescriptionDTO(String id, String name, String purpose)
    {
        _id      = id;
        _name    = name;
        _purpose = purpose;
    }

    public String getId()
    {
        return _id;
    }

    public void setId(String id)
    {
        _id = id;
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

    private String _id;
    private String _name;
    private String _purpose;
}