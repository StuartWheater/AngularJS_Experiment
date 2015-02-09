/*
 * Copyright (c) 2015, Arjuna Technologies Limited, Newcastle-upon-Tyne, England. All rights reserved.
 */

package com.arjuna.playground.agreements;

import java.io.Serializable;

public class AgreementFieldOptionValueDTO implements Serializable
{
    private static final long serialVersionUID = -1336149293073696085L;

    public AgreementFieldOptionValueDTO()
    {
    }

    public AgreementFieldOptionValueDTO(String label, String value)
    {
        _label = label;
        _value = value;
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

    private String _label;
    private String _value;
}