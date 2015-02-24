/*
 * Copyright (c) 2015, Arjuna Technologies Limited, Newcastle-upon-Tyne, England. All rights reserved.
 */

package com.arjuna.playground.store.agreementtemplates;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import org.hibernate.annotations.Type;

@Entity
public class AgreementTemplateEntity implements Serializable
{
    private static final long serialVersionUID = 1299468716449684026L;

    public AgreementTemplateEntity()
    {
    }

    public AgreementTemplateEntity(String id, String name, String purpose, List<AgreementTemplateField> fieldsDetails)
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

    public List<AgreementTemplateField> getFieldsDetails()
    {
        return _fieldsDetails;
    }

    public void setFieldsDetails(List<AgreementTemplateField> fieldsDetails)
    {
        _fieldsDetails = fieldsDetails;
    }

    @Id
    @Column(name = "id")
    protected String                             _id;
    @Column(name = "name")
    protected String                             _name;
    @Column(name = "purpose")
    protected String                             _purpose;
    @Type(type = "serializable")
    @Column(name = "fieldsDetails")
    protected List<AgreementTemplateField> _fieldsDetails;
}