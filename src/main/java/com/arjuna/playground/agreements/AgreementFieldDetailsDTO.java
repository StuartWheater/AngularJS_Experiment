/*
 * Copyright (c) 2015, Arjuna Technologies Limited, Newcastle-upon-Tyne, England. All rights reserved.
 */

package com.arjuna.playground.agreements;

import java.io.Serializable;
import java.util.List;

public class AgreementFieldDetailsDTO implements Serializable
{
    private static final long serialVersionUID = 3221227096290747895L;

    public AgreementFieldDetailsDTO()
    {
    }

    public AgreementFieldDetailsDTO(String name, String type, String label, String purpose, String value, Boolean mutable, List<AgreementFieldValidationDTO> validations, List<AgreementFieldOptionValueDTO> optionvalues, Boolean required)
    {
        _name         = name;
        _type         = type;
        _label        = label;
        _purpose      = purpose;
        _value        = value;
        _mutable      = mutable;
        _validations  = validations;
        _optionvalues = optionvalues;
        _required     = required;
    }

    public String getName()
    {
        return _name;
    }

    public void setName(String name)
    {
        _name = name;
    }

    public String getType()
    {
        return _type;
    }

    public void setType(String type)
    {
        _type = type;
    }

    public String getLabel()
    {
        return _label;
    }

    public void setLabel(String label)
    {
        _label = label;
    }

    public String getValue()
    {
        return _value;
    }

    public void setValue(String value)
    {
       _value = value;
    }

    public Boolean getMutable()
    {
        return _mutable;
    }

    public void setMutable(Boolean mutable)
    {
        _mutable = mutable;
    }

    public String getPurpose()
    {
        return _purpose;
    }

    public void setPurpose(String purpose)
    {
        _purpose = purpose;
    }

    public List<AgreementFieldValidationDTO> getValidations()
    {
        return _validations;
    }

    public void setValidations(List<AgreementFieldValidationDTO> validations)
    {
        _validations = validations;
    }

    public List<AgreementFieldOptionValueDTO> getOptionvalues()
    {
        return _optionvalues;
    }

    public void setOptionvalues(List<AgreementFieldOptionValueDTO> optionvalues)
    {
        _optionvalues = optionvalues;
    }

    public Boolean getRequired()
    {
        return _required;
    }

    public void setRequired(Boolean required)
    {
        _required = required;
    }

    private String                             _name;
    private String                             _type;
    private String                             _label;
    private String                             _purpose;
    private String                             _value;
    private Boolean                            _mutable;
    private List<AgreementFieldValidationDTO>  _validations;
    private List<AgreementFieldOptionValueDTO> _optionvalues;
    private Boolean                            _required;
}