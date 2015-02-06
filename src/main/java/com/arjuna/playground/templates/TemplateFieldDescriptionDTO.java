/*
 * Copyright (c) 2015, Arjuna Technologies Limited, Newcastle-upon-Tyne, England. All rights reserved.
 */

package com.arjuna.playground.templates;

import java.io.Serializable;
import java.util.List;

public class TemplateFieldDescriptionDTO implements Serializable
{
	private static final long serialVersionUID = -3713818357435962472L;

	public TemplateFieldDescriptionDTO()
    {
    }

    public TemplateFieldDescriptionDTO(String name, String type, String label, String purpose, List<TemplateFieldValidationDTO> validations, List<TemplateFieldOptionValueDTO> optionvalues, Boolean required)
    {
        _name         = name;
        _type         = type;
        _label        = label;
        _purpose      = purpose;
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

    public String getPurpose()
    {
        return _purpose;
    }

    public void setPurpose(String purpose)
    {
        _purpose = purpose;
    }

    public List<TemplateFieldValidationDTO> getValidations()
    {
        return _validations;
    }

    public void setValidations(List<TemplateFieldValidationDTO> validations)
    {
    	_validations = validations;
    }

    public List<TemplateFieldOptionValueDTO> getOptionvalues()
    {
        return _optionvalues;
    }

    public void setOptionvalues(List<TemplateFieldOptionValueDTO> optionvalues)
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

    private String                            _name;
    private String                            _type;
    private String                            _label;
    private String                            _purpose;
    private List<TemplateFieldValidationDTO>  _validations;
    private List<TemplateFieldOptionValueDTO> _optionvalues;
    private Boolean                           _required;
}