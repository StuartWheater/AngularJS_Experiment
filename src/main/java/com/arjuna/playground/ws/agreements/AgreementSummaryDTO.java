/*
 * Copyright (c) 2015, Arjuna Technologies Limited, Newcastle-upon-Tyne, England. All rights reserved.
 */

package com.arjuna.playground.ws.agreements;

import java.io.Serializable;
import java.util.Date;

public class AgreementSummaryDTO implements Serializable
{
    private static final long serialVersionUID = -283230959738414113L;

    public AgreementSummaryDTO()
    {
    }

    public AgreementSummaryDTO(String id, String name, String comment, Date createddate, String detailsurl)
    {
        _id          = id;
        _name        = name;
        _comment     = comment;
        _createddate = createddate;
        _detailsurl  = detailsurl;
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

    public String getComment()
    {
        return _comment;
    }

    public void setComment(String comment)
    {
        _comment = comment;
    }

    public Date getCreateddate()
    {
        return _createddate;
    }

    public void setCreateddate(Date createddate)
    {
        _createddate = createddate;
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
    private String _comment;
    private Date   _createddate;
    private String _detailsurl;
}