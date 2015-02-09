/*
 * Copyright (c) 2015, Arjuna Technologies Limited, Newcastle-upon-Tyne, England. All rights reserved.
 */

package com.arjuna.playground.agreements;

import java.io.Serializable;

public class AgreementSummaryDTO implements Serializable
{
	private static final long serialVersionUID = -283230959738414113L;

	public AgreementSummaryDTO()
    {
    }

    public AgreementSummaryDTO(String name, String comment, String statefieldname, String detailsurl)
    {
        _name           = name;
        _comment        = comment;
        _statefieldname = statefieldname;
        _detailsurl     = detailsurl;
    }

    public String getName()
    {
        return _name;
    }

    public void setName(String name)
    {
    	_name = name;
    }

    public String getComment()
    {
        return _comment;
    }

    public void setComment(String comment)
    {
    	_comment = comment;
    }

    public String getStatefieldname()
    {
        return _statefieldname;
    }

    public void setStatefieldname(String statefieldname)
    {
    	_statefieldname = statefieldname;
    }

    public String getDetailsurl()
    {
        return _detailsurl;
    }

    public void setDetailsurl(String detailsurl)
    {
    	_detailsurl = detailsurl;
    }

    private String _name;
    private String _comment;
    private String _statefieldname;
    private String _detailsurl;
}