/*
 * Copyright (c) 2015, Arjuna Technologies Limited, Newcastle-upon-Tyne, England. All rights reserved.
 */

package com.arjuna.playground.ws.agreements;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class GetAgreementDetailsResponse implements Serializable
{
    private static final long serialVersionUID = -4389007794387245776L;

    public GetAgreementDetailsResponse()
    {
    }

    public GetAgreementDetailsResponse(String id, String name, String comment, String statefieldname, Date createddate, List<AgreementFieldDetailsDTO> fieldsdetails)
    {
        _id             = id;
        _name           = name;
        _comment        = comment;
        _statefieldname = statefieldname;
        _createddate    = createddate;
        _fieldsdetails  = fieldsdetails;
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

    public String getStatefieldname()
    {
        return _statefieldname;
    }

    public void setStatefieldname(String statefieldname)
    {
        _statefieldname = statefieldname;
    }

    public Date getCreateddate()
    {
        return _createddate;
    }

    public void setCreateddate(Date createddate)
    {
        _createddate = createddate;
    }

    public List<AgreementFieldDetailsDTO> getFieldsdetails()
    {
        System.err.println("GetAgreementDetailsResponse.getFieldsdetails: " + _fieldsdetails);
        return _fieldsdetails;
    }

    public void setFieldsdetails(List<AgreementFieldDetailsDTO> fieldsdetails)
    {
         System.err.println("GetAgreementDetailsResponse.setFieldsdetails: " + fieldsdetails);
        _fieldsdetails = fieldsdetails;
    }

    private String                         _id;
    private String                         _name;
    private String                         _comment;
    private String                         _statefieldname;
    private Date                           _createddate;
    private List<AgreementFieldDetailsDTO> _fieldsdetails;
}