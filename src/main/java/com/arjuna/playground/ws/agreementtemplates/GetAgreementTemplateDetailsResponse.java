/*
 * Copyright (c) 2015, Arjuna Technologies Limited, Newcastle-upon-Tyne, England. All rights reserved.
 */

package com.arjuna.playground.ws.agreementtemplates;

import java.io.Serializable;
import java.util.List;

public class GetAgreementTemplateDetailsResponse implements Serializable
{
    private static final long serialVersionUID = 6674234214010832766L;

    public GetAgreementTemplateDetailsResponse()
    {
    }

    public GetAgreementTemplateDetailsResponse(String name, String purpose, List<AgreementTemplateFieldDetailsDTO> fieldsdetails)
    {
        _name          = name;
        _purpose       = purpose;
        _fieldsdetails = fieldsdetails;
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

    public List<AgreementTemplateFieldDetailsDTO> getFieldsdetails()
    {
        return _fieldsdetails;
    }

    public void setFieldsdetails(List<AgreementTemplateFieldDetailsDTO> fieldsdetails)
    {
        _fieldsdetails = fieldsdetails;
    }

    private String                                 _name;
    private String                                 _purpose;
    private List<AgreementTemplateFieldDetailsDTO> _fieldsdetails;
}