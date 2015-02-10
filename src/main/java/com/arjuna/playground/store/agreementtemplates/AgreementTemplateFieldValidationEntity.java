/*
 * Copyright (c) 2015, Arjuna Technologies Limited, Newcastle-upon-Tyne, England. All rights reserved.
 */

package com.arjuna.playground.store.agreementtemplates;

import java.io.Serializable;
import javax.persistence.Entity;

@Entity
public class AgreementTemplateFieldValidationEntity implements Serializable
{
    private static final long serialVersionUID = 351053677909126758L;

    public AgreementTemplateFieldValidationEntity()
    {
    }

    public AgreementTemplateFieldValidationEntity(String id, String regex, String errormessage)
    {
        _id           = id;
        _regex        = regex;
        _errormessage = errormessage;
    }

    public String getId()
    {
        return _id;
    }

    public void setId(String id)
    {
        _id = id;
    }

    public String getRegex()
    {
        return _regex;
    }

    public void setRegex(String regex)
    {
        _regex = regex;
    }

    public String getErrormessage()
    {
        return _errormessage;
    }

    public void setErrormessage(String errormessage)
    {
        _errormessage = errormessage;
    }

    private String _id;
    private String _regex;
    private String _errormessage;
}