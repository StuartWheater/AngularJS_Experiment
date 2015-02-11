/*
 * Copyright (c) 2015, Arjuna Technologies Limited, Newcastle-upon-Tyne, England. All rights reserved.
 */

package com.arjuna.playground.ws.agreements;

import java.io.Serializable;
import java.util.List;

public class AgreementDetailsDTO implements Serializable
{
    private static final long serialVersionUID = 9151184769468182277L;

    public AgreementDetailsDTO()
    {
    }

    public AgreementDetailsDTO(String name, String comment, String statefieldname, List<AgreementFieldDetailsDTO> fieldsdetails)
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

    public List<AgreementFieldDetailsDTO> getFieldsdetails()
    {
        return _fieldsdetails;
    }

    public void setFieldsdetails(List<AgreementFieldDetailsDTO> fieldsdetails)
    {
        _fieldsdetails = fieldsdetails;
    }

    private String                         _name;
    private String                         _comment;
    private String                         _statefieldname;
    private List<AgreementFieldDetailsDTO> _fieldsdetails;
}