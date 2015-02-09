/*
 * Copyright (c) 2015, Arjuna Technologies Limited, Newcastle-upon-Tyne, England. All rights reserved.
 */

package com.arjuna.playground.agreementtemplates;

import java.io.Serializable;
import java.util.List;

public class GetAgreementTemplateSummariesResponse implements Serializable
{
    private static final long serialVersionUID = 1337181268252578682L;

    public GetAgreementTemplateSummariesResponse()
    {
    }

    public GetAgreementTemplateSummariesResponse(String name, List<AgreementTemplateSummaryDTO> summaries)
    {
        _summaries = summaries;
    }

    public List<AgreementTemplateSummaryDTO> getSummaries()
    {
        return _summaries;
    }

    public void setSummaries(List<AgreementTemplateSummaryDTO> summaries)
    {
        _summaries = summaries;
    }

    private List<AgreementTemplateSummaryDTO> _summaries;
}