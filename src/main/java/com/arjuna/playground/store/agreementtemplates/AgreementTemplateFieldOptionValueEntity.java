/*
 * Copyright (c) 2015, Arjuna Technologies Limited, Newcastle-upon-Tyne, England. All rights reserved.
 */

package com.arjuna.playground.store.agreementtemplates;

import java.io.Serializable;
import javax.persistence.Entity;

@Entity
public class AgreementTemplateFieldOptionValueEntity implements Serializable
{
    private static final long serialVersionUID = -8046555033747924884L;

    public AgreementTemplateFieldOptionValueEntity()
    {
    }

    public AgreementTemplateFieldOptionValueEntity(String id, String label, String value)
    {
        _id    = id;
        _label = label;
        _value = value;
    }

    public String getId()
    {
        return _id;
    }

    public void setId(String id)
    {
        _id = id;
    }

    public String getLabel()
    {
        return _label;
    }

    public void setLabel(String label)
    {
        _label = label;
    }

    public String getErrorMessage()
    {
        return _value;
    }

    public void setErrorMessage(String value)
    {
        _value = value;
    }

    private String _id;
    private String _label;
    private String _value;
}