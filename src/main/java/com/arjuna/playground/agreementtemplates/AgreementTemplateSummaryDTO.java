/*
 * Copyright (c) 2015, Arjuna Technologies Limited, Newcastle-upon-Tyne, England. All rights reserved.
 */

package com.arjuna.playground.agreementtemplates;

import java.io.Serializable;

public class AgreementTemplateSummaryDTO implements Serializable
{
	private static final long serialVersionUID = -8748474429953548487L;

	public AgreementTemplateSummaryDTO()
    {
    }

    public AgreementTemplateSummaryDTO(String name, String purpose, String detailsURL)
    {
        _name       = name;
        _purpose    = purpose;
        _detailsURL = detailsURL;
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

    public String getDetailsURL()
    {
        return _detailsURL;
    }

    public void setDetailsURL(String detailsURL)
    {
    	_detailsURL = detailsURL;
    }

    private String _name;
    private String _purpose;
    private String _detailsURL;
}