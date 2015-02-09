/*
 * Copyright (c) 2015, Arjuna Technologies Limited, Newcastle-upon-Tyne, England. All rights reserved.
 */

package com.arjuna.playground.agreementtemplates;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
@Stateless
public class AgreementTemplatesWS
{
    private static final Logger logger = Logger.getLogger(AgreementTemplatesWS.class.getName());

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public GetAgreementTemplateSummariesResponse getAgreementTemplateSummaries()
    {
        logger.log(Level.FINE, "AgreementTemplatesWS.getAgreementTemplateSummaries");
        try
        {
            GetAgreementTemplateSummariesResponse response = new GetAgreementTemplateSummariesResponse();

            response.setSummaries(createAgreementTemplateSummaries());

            return response;
        }
        catch (Throwable throwable)
        {
            logger.log(Level.WARNING, "AgreementTemplatesWS.getAgreementTemplateSummaries: Unable get agreement template summaries", throwable);

            throw new WebApplicationException("Unexpected problem: " + throwable.getMessage(), Response.Status.INTERNAL_SERVER_ERROR);
        }
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public GetAgreementTemplateDetailsResponse getAgreementTemplateDetails(@PathParam("id") String id)
    {
        logger.log(Level.FINE, "AgreementTemplatesWS.getAgreementTemplateDetails: [" + id + "]");
        try
        {
            AgreementTemplateDetailsDTO agreementTemplateDetails = createAgreementTemplateDetailsMap().get(id);
            if (agreementTemplateDetails != null)
            {
                GetAgreementTemplateDetailsResponse response = new GetAgreementTemplateDetailsResponse();

                response.setName(agreementTemplateDetails.getName());
                response.setPurpose(agreementTemplateDetails.getPurpose());
                response.setFieldsdetails(agreementTemplateDetails.getFieldsDetails());

                return response;
            }
            else
                throw new WebApplicationException("", Response.Status.NOT_FOUND);
        }
        catch (Throwable throwable)
        {
            logger.log(Level.WARNING, "AgreementTemplatesWS.getAgreementTemplateDetails: Unable get agreement template field details", throwable);

            throw new WebApplicationException("Unexpected problem: " + throwable.getMessage(), Response.Status.INTERNAL_SERVER_ERROR);
        }
    }

    private List<AgreementTemplateSummaryDTO> createAgreementTemplateSummaries()
    {
        List<AgreementTemplateSummaryDTO> agreementTemplateSummaries = new LinkedList<>();

        String requestURL = _request.getRequestURL().toString();
        if (! requestURL.endsWith("/"))
            requestURL = requestURL + "/";

        AgreementTemplateSummaryDTO agreementTemplateSummary01 = new AgreementTemplateSummaryDTO();
        agreementTemplateSummary01.setName("XML Real-time internal agreement");
        agreementTemplateSummary01.setPurpose("Create an agreement with an internal party to supply real-time XML data.");
        agreementTemplateSummary01.setDetailsurl(requestURL + "3f7e5ba2-1e03-4641-b477-36d3ecb18de8");
        agreementTemplateSummaries.add(agreementTemplateSummary01);

        AgreementTemplateSummaryDTO agreementTemplateSummary02 = new AgreementTemplateSummaryDTO();
        agreementTemplateSummary02.setName("JSON Real-time external agreement");
        agreementTemplateSummary02.setPurpose("Create an agreement with an external party to supply real-time JSON data.");
        agreementTemplateSummary02.setDetailsurl(requestURL + "6e5747ef-41da-4344-a15e-e386695605f4");
        agreementTemplateSummaries.add(agreementTemplateSummary02);

        AgreementTemplateSummaryDTO agreementTemplateSummary03 = new AgreementTemplateSummaryDTO();
        agreementTemplateSummary03.setName("XML Real-time internal agreement");
        agreementTemplateSummary03.setPurpose("Create an agreement with an internal party to supply real-time XML data.");
        agreementTemplateSummary03.setDetailsurl(requestURL + "8693f1cd-8a77-4bca-87b0-46b3568657d4");
        agreementTemplateSummaries.add(agreementTemplateSummary03);

        AgreementTemplateSummaryDTO agreementTemplateSummary04 = new AgreementTemplateSummaryDTO();
        agreementTemplateSummary04.setName("JSON Real-time external agreement");
        agreementTemplateSummary04.setPurpose("Create an agreement with an external party to supply real-time JSON data.");
        agreementTemplateSummary04.setDetailsurl(requestURL + "15bdb060-e2f3-4665-a231-fc325fb23e2b");
        agreementTemplateSummaries.add(agreementTemplateSummary04);

        return agreementTemplateSummaries;
    }

    private Map<String, AgreementTemplateDetailsDTO> createAgreementTemplateDetailsMap()
    {
        Map<String, AgreementTemplateDetailsDTO> agreementTemplateDetailsMap = new HashMap<String, AgreementTemplateDetailsDTO>();

        AgreementTemplateDetailsDTO agreementTemplateDetails01 = new AgreementTemplateDetailsDTO();
        agreementTemplateDetails01.setName("XML Real-time internal agreement");
        agreementTemplateDetails01.setPurpose("Create an agreement with an internal party to supply real-time XML data.");
        List<AgreementTemplateFieldDetailsDTO> agreementTemplateFieldDetails01 = new LinkedList<AgreementTemplateFieldDetailsDTO>();
        agreementTemplateDetails01.setFieldsDetails(agreementTemplateFieldDetails01);
        agreementTemplateDetailsMap.put("3f7e5ba2-1e03-4641-b477-36d3ecb18de8", agreementTemplateDetails01);

        AgreementTemplateDetailsDTO agreementTemplateDetails02 = new AgreementTemplateDetailsDTO();
        agreementTemplateDetails02.setName("JSON Real-time external agreement");
        agreementTemplateDetails02.setPurpose("Create an agreement with an external party to supply real-time JSON data.");
        List<AgreementTemplateFieldDetailsDTO> agreementTemplateFieldDetails02 = new LinkedList<AgreementTemplateFieldDetailsDTO>();
        agreementTemplateDetails02.setFieldsDetails(agreementTemplateFieldDetails02);
        agreementTemplateDetailsMap.put("6e5747ef-41da-4344-a15e-e386695605f4", agreementTemplateDetails02);

        AgreementTemplateDetailsDTO agreementTemplateDetails03 = new AgreementTemplateDetailsDTO();
        agreementTemplateDetails03.setName("XML Real-time internal agreement");
        agreementTemplateDetails03.setPurpose("Create an agreement with an internal party to supply real-time XML data.");
        List<AgreementTemplateFieldDetailsDTO> agreementTemplateFieldDetails03 = new LinkedList<AgreementTemplateFieldDetailsDTO>();
        agreementTemplateDetails03.setFieldsDetails(agreementTemplateFieldDetails03);
        agreementTemplateDetailsMap.put("8693f1cd-8a77-4bca-87b0-46b3568657d4", agreementTemplateDetails03);

        AgreementTemplateDetailsDTO agreementTemplateDetails04 = new AgreementTemplateDetailsDTO();
        agreementTemplateDetails04.setName("JSON Real-time external agreement");
        agreementTemplateDetails04.setPurpose("Create an agreement with an external party to supply real-time JSON data.");
        List<AgreementTemplateFieldDetailsDTO> agreementTemplateFieldDetails04 = new LinkedList<AgreementTemplateFieldDetailsDTO>();
        agreementTemplateDetails04.setFieldsDetails(agreementTemplateFieldDetails04);
        agreementTemplateDetailsMap.put("15bdb060-e2f3-4665-a231-fc325fb23e2b", agreementTemplateDetails04);

        return agreementTemplateDetailsMap;
    }
    
    @Context
    private HttpServletRequest _request;
}
