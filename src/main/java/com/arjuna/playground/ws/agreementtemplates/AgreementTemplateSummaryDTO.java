/*
 * Copyright (c) 2015, Arjuna Technologies Limited, Newcastle-upon-Tyne, England. All rights reserved.
 */

package com.arjuna.playground.ws.agreementtemplates;

import java.io.Serializable;

public class AgreementTemplateSummaryDTO implements Serializable
{
    private static final long serialVersionUID = -8748474429953548487L;

    public AgreementTemplateSummaryDTO()
    {
    }

    public AgreementTemplateSummaryDTO(String id, String name, String purpose, String detailsurl)
    {
        _id         = id;
        _name       = name;
        _purpose    = purpose;
        _detailsurl = detailsurl;
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

    public String getDetailsurl()
    {
        return _detailsurl;
    }

    public void setDetailsurl(String detailsurl)
    {
        _detailsurl = detailsurl;
    }

    private String _id;
    private String _name;
    private String _purpose;
    private String _detailsurl;
}