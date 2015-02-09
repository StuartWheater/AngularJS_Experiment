/*
 * Copyright (c) 2015, Arjuna Technologies Limited, Newcastle-upon-Tyne, England. All rights reserved.
 */

package com.arjuna.playground.agreements;

import java.io.Serializable;
import java.util.List;

public class GetAgreementSummariesResponse implements Serializable
{
    private static final long serialVersionUID = 8268745810130542059L;

    public GetAgreementSummariesResponse()
    {
    }

    public GetAgreementSummariesResponse(String name, List<AgreementSummaryDTO> summaries)
    {
        _summaries = summaries;
    }

    public List<AgreementSummaryDTO> getSummaries()
    {
        return _summaries;
    }

    public void setSummaries(List<AgreementSummaryDTO> summaries)
    {
        _summaries = summaries;
    }

    private List<AgreementSummaryDTO> _summaries;
}