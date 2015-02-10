/*
 * Copyright (c) 2015, Arjuna Technologies Limited, Newcastle-upon-Tyne, England. All rights reserved.
 */

package com.arjuna.playground.store.agreementtemplates;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;

@Entity
public class AgreementTemplateEntity implements Serializable
{
    private static final long serialVersionUID = 1299468716449684026L;

    public AgreementTemplateEntity()
    {
    }

    public AgreementTemplateEntity(String id, String name, String purpose, List<AgreementTemplateFieldEntity> fieldsDetails)
    {
        _id            = id;
        _name          = name;
        _purpose       = purpose;
        _fieldsDetails = fieldsDetails;
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

    public List<AgreementTemplateFieldEntity> getFieldsDetails()
    {
        return _fieldsDetails;
    }

    public void setFieldsDetails(List<AgreementTemplateFieldEntity> fieldsDetails)
    {
        _fieldsDetails = fieldsDetails;
    }

    private String                             _id;
    private String                             _name;
    private String                             _purpose;
    private List<AgreementTemplateFieldEntity> _fieldsDetails;
}