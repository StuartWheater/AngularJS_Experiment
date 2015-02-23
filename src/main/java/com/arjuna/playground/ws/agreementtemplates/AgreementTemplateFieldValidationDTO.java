/*
 * Copyright (c) 2015, Arjuna Technologies Limited, Newcastle-upon-Tyne, England. All rights reserved.
 */

package com.arjuna.playground.ws.agreementtemplates;

import java.io.Serializable;

public class AgreementTemplateFieldValidationDTO implements Serializable
{
    private static final long serialVersionUID = 7951533570770333991L;

    public AgreementTemplateFieldValidationDTO()
    {
    }

    public AgreementTemplateFieldValidationDTO(String regex, String errormessage)
    {
        _regex        = regex;
        _errormessage = errormessage;
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

    private String _regex;
    private String _errormessage;
}