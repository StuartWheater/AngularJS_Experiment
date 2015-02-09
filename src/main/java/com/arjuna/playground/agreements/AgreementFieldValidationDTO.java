/*
 * Copyright (c) 2015, Arjuna Technologies Limited, Newcastle-upon-Tyne, England. All rights reserved.
 */

package com.arjuna.playground.agreements;

import java.io.Serializable;

public class AgreementFieldValidationDTO implements Serializable
{
    private static final long serialVersionUID = 3503727197652547858L;

    public AgreementFieldValidationDTO()
    {
    }

    public AgreementFieldValidationDTO(String regex, String errormessage)
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