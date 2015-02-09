/*
 * Copyright (c) 2015, Arjuna Technologies Limited, Newcastle-upon-Tyne, England. All rights reserved.
 */

package com.arjuna.playground.agreementtemplates;

import java.io.Serializable;
import java.util.List;

public class GetAgreementTemplateDetailsResponse implements Serializable
{
	private static final long serialVersionUID = 6674234214010832766L;

	public GetAgreementTemplateDetailsResponse()
    {
    }

    public GetAgreementTemplateDetailsResponse(String name, String purpose, List<AgreementTemplateFieldDetailsDTO> fieldsDetails)
    {
    	_name          = name;
    	_purpose       = purpose;
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

    public String getPurpose()
    {
        return _purpose;
    }

    public void setPurpose(String purpose)
    {
    	_purpose = purpose;
    }

    public List<AgreementTemplateFieldDetailsDTO> getFieldsDetails()
    {
        return _fieldsDetails;
    }

    public void setFieldsDetails(List<AgreementTemplateFieldDetailsDTO> fieldsDetails)
    {
    	_fieldsDetails = fieldsDetails;
    }

    private String                                 _name;
    private String                                 _purpose;
    private List<AgreementTemplateFieldDetailsDTO> _fieldsDetails;
}