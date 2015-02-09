/*
 * Copyright (c) 2015, Arjuna Technologies Limited, Newcastle-upon-Tyne, England. All rights reserved.
 */

package com.arjuna.playground.agreements;

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
public class AgreementsWS
{
    private static final Logger logger = Logger.getLogger(AgreementsWS.class.getName());

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public GetAgreementSummariesResponse getAgreementSummaries()
    {
        logger.log(Level.FINE, "AgreementsWS.getAgreementSummaries");
        try
        {
            GetAgreementSummariesResponse response = new GetAgreementSummariesResponse();

            response.setSummaries(createAgreementSummaries());

            return response;
        }
        catch (Throwable throwable)
        {
            logger.log(Level.WARNING, "AgreementsWS.getAgreementSummaries: Unable get agreement summaries", throwable);

            throw new WebApplicationException("", Response.Status.INTERNAL_SERVER_ERROR);
        }
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public GetAgreementDetailsResponse getAgreementDetails(@PathParam("id") String id)
    {
        logger.log(Level.FINE, "AgreementsWS.getAgreementDetails: [" + id + "]");
        try
        {
            AgreementDetailsDTO agreementDetails = createAgreementDetailsMap().get(id);
            if (agreementDetails != null)
            {
                GetAgreementDetailsResponse response = new GetAgreementDetailsResponse();

                response.setName(agreementDetails.getName());
                response.setComment(agreementDetails.getComment());
                response.setFieldsDetails(agreementDetails.getFieldsDetails());

                return response;
            }
            else
                throw new WebApplicationException("", Response.Status.NOT_FOUND);
        }
        catch (Throwable throwable)
        {
            logger.log(Level.WARNING, "AgreementsWS.getAgreementDetails: Unable get agreement details", throwable);

            throw new WebApplicationException("Unexpected problem: " + throwable.getMessage(), Response.Status.INTERNAL_SERVER_ERROR);
        }
    }

    private List<AgreementSummaryDTO> createAgreementSummaries()
    {
        List<AgreementSummaryDTO> agreementSummaries = new LinkedList<>();

        String requestURL = _request.getRequestURL().toString();
        if (! requestURL.endsWith("/"))
            requestURL = requestURL + "/";

        AgreementSummaryDTO agreementSummary01 = new AgreementSummaryDTO();
        agreementSummary01.setName("XML Real-time internal agreement");
        agreementSummary01.setComment("Create an agreement with an internal party to supply real-time XML data.");
        agreementSummary01.setDetailsurl(requestURL + "3f7e5ba2-1e03-4641-b477-36d3ecb18de8");
        agreementSummaries.add(agreementSummary01);

        AgreementSummaryDTO agreementSummary02 = new AgreementSummaryDTO();
        agreementSummary02.setName("JSON Real-time external agreement");
        agreementSummary02.setComment("Create an agreement with an external party to supply real-time JSON data.");
        agreementSummary02.setDetailsurl(requestURL + "6e5747ef-41da-4344-a15e-e386695605f4");
        agreementSummaries.add(agreementSummary02);

        AgreementSummaryDTO agreementSummary03 = new AgreementSummaryDTO();
        agreementSummary03.setName("XML Real-time internal agreement");
        agreementSummary03.setComment("Create an agreement with an internal party to supply real-time XML data.");
        agreementSummary03.setDetailsurl(requestURL + "8693f1cd-8a77-4bca-87b0-46b3568657d4");
        agreementSummaries.add(agreementSummary03);

        AgreementSummaryDTO agreementSummary04 = new AgreementSummaryDTO();
        agreementSummary04.setName("JSON Real-time external agreement");
        agreementSummary04.setComment("Create an agreement with an external party to supply real-time JSON data.");
        agreementSummary04.setDetailsurl(requestURL + "15bdb060-e2f3-4665-a231-fc325fb23e2b");
        agreementSummaries.add(agreementSummary04);

        return agreementSummaries;
    }

    private Map<String, AgreementDetailsDTO> createAgreementDetailsMap()
    {
        Map<String, AgreementDetailsDTO> agreementDetailsMap = new HashMap<String, AgreementDetailsDTO>();

        AgreementDetailsDTO agreementDetails01 = new AgreementDetailsDTO();
        agreementDetails01.setName("XML Real-time internal agreement");
        agreementDetails01.setComment("Create an agreement with an internal party to supply real-time XML data.");
        List<AgreementFieldDetailsDTO> agreementFieldDetails01 = new LinkedList<AgreementFieldDetailsDTO>();
        agreementDetails01.setFieldsDetails(agreementFieldDetails01);
        agreementDetailsMap.put("3f7e5ba2-1e03-4641-b477-36d3ecb18de8", agreementDetails01);

        AgreementDetailsDTO agreementDetails02 = new AgreementDetailsDTO();
        agreementDetails02.setName("JSON Real-time external agreement");
        agreementDetails02.setComment("Create an agreement with an external party to supply real-time JSON data.");
        List<AgreementFieldDetailsDTO> agreementFieldDetails02 = new LinkedList<AgreementFieldDetailsDTO>();
        agreementDetails02.setFieldsDetails(agreementFieldDetails02);
        agreementDetailsMap.put("6e5747ef-41da-4344-a15e-e386695605f4", agreementDetails02);

        AgreementDetailsDTO agreementDetails03 = new AgreementDetailsDTO();
        agreementDetails03.setName("XML Real-time internal agreement");
        agreementDetails03.setComment("Create an agreement with an internal party to supply real-time XML data.");
        List<AgreementFieldDetailsDTO> agreementFieldDetails03 = new LinkedList<AgreementFieldDetailsDTO>();
        agreementDetails03.setFieldsDetails(agreementFieldDetails03);
        agreementDetailsMap.put("8693f1cd-8a77-4bca-87b0-46b3568657d4", agreementDetails03);

        AgreementDetailsDTO agreementDetails04 = new AgreementDetailsDTO();
        agreementDetails04.setName("JSON Real-time external agreement");
        agreementDetails04.setComment("Create an agreement with an external party to supply real-time JSON data.");
        List<AgreementFieldDetailsDTO> agreementFieldDetails04 = new LinkedList<AgreementFieldDetailsDTO>();
        agreementDetails04.setFieldsDetails(agreementFieldDetails04);
        agreementDetailsMap.put("15bdb060-e2f3-4665-a231-fc325fb23e2b", agreementDetails04);

        return agreementDetailsMap;
    }
    
    @Context
    private HttpServletRequest _request;
}
