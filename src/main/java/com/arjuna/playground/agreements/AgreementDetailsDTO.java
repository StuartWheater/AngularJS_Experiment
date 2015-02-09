/*
 * Copyright (c) 2015, Arjuna Technologies Limited, Newcastle-upon-Tyne, England. All rights reserved.
 */

package com.arjuna.playground.agreements;

import java.io.Serializable;
import java.util.List;

public class AgreementDetailsDTO implements Serializable
{
    private static final long serialVersionUID = 9151184769468182277L;

    public AgreementDetailsDTO()
    {
    }

    public AgreementDetailsDTO(String name, String comment, List<AgreementFieldDetailsDTO> fieldsDetails)
    {
        _name          = name;
        _comment       = comment;
        _fieldsDetails = fieldsDetails;
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

    public List<AgreementFieldDetailsDTO> getFieldsDetails()
    {
        return _fieldsDetails;
    }

    public void setFieldsDetails(List<AgreementFieldDetailsDTO> fieldsDetails)
    {
        _fieldsDetails = fieldsDetails;
    }

    private String                         _name;
    private String                         _comment;
    private List<AgreementFieldDetailsDTO> _fieldsDetails;
}