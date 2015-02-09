/*
 * Copyright (c) 2015, Arjuna Technologies Limited, Newcastle-upon-Tyne, England. All rights reserved.
 */

package com.arjuna.playground.agreementtemplates;

import java.io.Serializable;

public class AgreementTemplateFieldValidationDTO implements Serializable
{
	private static final long serialVersionUID = 7951533570770333991L;

	public AgreementTemplateFieldValidationDTO()
    {
    }

    public AgreementTemplateFieldValidationDTO(String regex, String errorMessage)
    {
        _regex        = regex;
        _errorMessage = errorMessage;
    }

    public String getRegex()
    {
        return _regex;
    }

    public void setRegex(String regex)
    {
    	_regex = regex;
    }

    public String getErrorMessage()
    {
        return _errorMessage;
    }

    public void setErrorMessage(String errorMessage)
    {
    	_errorMessage = errorMessage;
    }

    private String _regex;
    private String _errorMessage;
}