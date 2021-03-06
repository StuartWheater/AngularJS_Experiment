/*
 * Copyright (c) 2015, Arjuna Technologies Limited, Newcastle-upon-Tyne, England. All rights reserved.
 */

package com.arjuna.playground.store.agreementtemplates;

import java.io.Serializable;
import java.util.List;

public class AgreementTemplateField implements Serializable
{
    private static final long serialVersionUID = 4874019303653238725L;

    public AgreementTemplateField()
    {
    }

    public AgreementTemplateField(String id, String name, String type, String label, String purpose, String defaultvalue, List<AgreementTemplateFieldValidation> validations, List<AgreementTemplateFieldOptionValue> optionvalues, Boolean required)
    {
        _id           = id;
        _name         = name;
        _type         = type;
        _label        = label;
        _purpose      = purpose;
        _defaultvalue = defaultvalue;
        _validations  = validations;
        _optionvalues = optionvalues;
        _required     = required;
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

    public String getDefaultvalue()
    {
        return _defaultvalue;
    }

    public void setDefaultvalue(String defaultvalue)
    {
        _defaultvalue = defaultvalue;
    }

    public String getPurpose()
    {
        return _purpose;
    }

    public void setPurpose(String purpose)
    {
        _purpose = purpose;
    }

    public List<AgreementTemplateFieldValidation> getValidations()
    {
        return _validations;
    }

    public void setValidations(List<AgreementTemplateFieldValidation> validations)
    {
        _validations = validations;
    }

    public List<AgreementTemplateFieldOptionValue> getOptionvalues()
    {
        return _optionvalues;
    }

    public void setOptionvalues(List<AgreementTemplateFieldOptionValue> optionvalues)
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

    private String                                  _id;
    private String                                  _name;
    private String                                  _type;
    private String                                  _label;
    private String                                  _purpose;
    private String                                  _defaultvalue;
    private List<AgreementTemplateFieldValidation>  _validations;
    private List<AgreementTemplateFieldOptionValue> _optionvalues;
    private Boolean                                 _required;
}