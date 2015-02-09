/*
 * Copyright (c) 2015, Arjuna Technologies Limited, Newcastle-upon-Tyne, England. All rights reserved.
 */

package com.arjuna.playground.agreements;

import java.io.Serializable;
import java.util.List;

public class GetAgreementDetailsResponse implements Serializable
{
    private static final long serialVersionUID = -4389007794387245776L;

    public GetAgreementDetailsResponse()
    {
    }

    public GetAgreementDetailsResponse(String name, String comment, String statefieldname, List<AgreementFieldDetailsDTO> fieldsdetails)
    {
        _name           = name;
        _comment        = comment;
        _statefieldname = statefieldname;
        _fieldsdetails  = fieldsdetails;
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

    public List<AgreementFieldDetailsDTO> getFieldsDetails()
    {
        return _fieldsdetails;
    }

    public void setFieldsDetails(List<AgreementFieldDetailsDTO> fieldsDetails)
    {
        _fieldsdetails = fieldsDetails;
    }

    private String                         _name;
    private String                         _comment;
    private String                         _statefieldname;
    private List<AgreementFieldDetailsDTO> _fieldsdetails;
}