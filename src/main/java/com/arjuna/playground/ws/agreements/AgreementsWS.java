/*
 * Copyright (c) 2015, Arjuna Technologies Limited, Newcastle-upon-Tyne, England. All rights reserved.
 */

package com.arjuna.playground.ws.agreements;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ejb.Stateless;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/agreements")
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
            logger.log(Level.WARNING, "AgreementsWS.getAgreementSummaries: Unable to get agreement summaries", throwable);

            throw new WebApplicationException("Unexpected problem: " + throwable.getMessage(), Response.Status.INTERNAL_SERVER_ERROR);
        }
    }

    @POST
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public void postCreateAgreement()
    {
        logger.log(Level.FINE, "AgreementsWS.postCreateAgreement");
        try
        {
            throw new UnsupportedOperationException("Not yet implemented");
        }
        catch (Throwable throwable)
        {
            logger.log(Level.WARNING, "AgreementsWS.postCreateAgreement: Unable to create agreement", throwable);

            throw new WebApplicationException("Unexpected problem: " + throwable.getMessage(), Response.Status.INTERNAL_SERVER_ERROR);
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
            Agreement agreementDetails = createAgreementDetailsMap().get(id);
            if (agreementDetails != null)
            {
                GetAgreementDetailsResponse response = new GetAgreementDetailsResponse();

                response.setId(agreementDetails.getId());
                response.setName(agreementDetails.getName());
                response.setComment(agreementDetails.getComment());
                response.setCreateddate(agreementDetails.getCreateddate());
                response.setFieldsdetails(agreementDetails.getFieldsdetails());

                return response;
            }
            else
                throw new WebApplicationException("", Response.Status.NOT_FOUND);
        }
        catch (Throwable throwable)
        {
            logger.log(Level.WARNING, "AgreementsWS.getAgreementDetails: Unable to get agreement details", throwable);

            throw new WebApplicationException("Unexpected problem: " + throwable.getMessage(), Response.Status.INTERNAL_SERVER_ERROR);
        }
    }

    @PUT
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public void putUpdatedAgreement(@PathParam("id") String id)
    {
        logger.log(Level.FINE, "AgreementsWS.putUpdatedAgreement: [" + id + "]");
        try
        {
            throw new UnsupportedOperationException("Not yet implemented");
        }
        catch (Throwable throwable)
        {
            logger.log(Level.WARNING, "AgreementsWS.putUpdatedAgreement: Unable to update agreement", throwable);

            throw new WebApplicationException("Unexpected problem: " + throwable.getMessage(), Response.Status.INTERNAL_SERVER_ERROR);
        }
    }

    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public void deleteTerminateAgreement(@PathParam("id") String id)
    {
        logger.log(Level.FINE, "AgreementsWS.deleteTerminateAgreement: [" + id + "]");
        try
        {
            throw new UnsupportedOperationException("Not yet implemented");
        }
        catch (Throwable throwable)
        {
            logger.log(Level.WARNING, "AgreementsWS.deleteTerminateAgreement: Unable to terminate agreement", throwable);

            throw new WebApplicationException("Unexpected problem: " + throwable.getMessage(), Response.Status.INTERNAL_SERVER_ERROR);
        }
    }

    @OPTIONS
    @Path("/{path:.*}")
    public Response handleCORSRequest(@HeaderParam("Access-Control-Request-Method") String requestMethod, @HeaderParam("Access-Control-Request-Headers") String requestHeaders)
    {
        ResponseBuilder retValue = Response.ok();

        if (requestHeaders != null)
            retValue.header("Access-Control-Allow-Headers", requestHeaders);

        if (requestMethod != null)
            retValue.header("Access-Control-Allow-Methods", requestMethod);

        retValue.header("Access-Control-Allow-Origin", "*");

        return retValue.build();
    }

    private List<AgreementSummaryDTO> createAgreementSummaries()
    {
        List<AgreementSummaryDTO> agreementSummaries = new LinkedList<AgreementSummaryDTO>();

        String requestURL = _request.getRequestURL().toString();
        if (! requestURL.endsWith("/"))
            requestURL = requestURL + "/";

        Date now = new Date();

        AgreementSummaryDTO agreementSummary01 = new AgreementSummaryDTO();
        agreementSummary01.setId("3f7e5ba2-1e03-4641-b477-36d3ecb18de8");
        agreementSummary01.setName("XML Real-time internal agreement");
        agreementSummary01.setComment("Create an agreement with an internal party to supply real-time XML data.");
        agreementSummary01.setCreateddate(now);
        agreementSummary01.setDetailsurl(requestURL + "3f7e5ba2-1e03-4641-b477-36d3ecb18de8");
        agreementSummaries.add(agreementSummary01);

        AgreementSummaryDTO agreementSummary02 = new AgreementSummaryDTO();
        agreementSummary02.setId("6e5747ef-41da-4344-a15e-e386695605f4");
        agreementSummary02.setName("JSON Real-time external agreement");
        agreementSummary02.setComment("Create an agreement with an external party to supply real-time JSON data.");
        agreementSummary02.setCreateddate(now);
        agreementSummary02.setDetailsurl(requestURL + "6e5747ef-41da-4344-a15e-e386695605f4");
        agreementSummaries.add(agreementSummary02);

        AgreementSummaryDTO agreementSummary03 = new AgreementSummaryDTO();
        agreementSummary03.setId("8693f1cd-8a77-4bca-87b0-46b3568657d4");
        agreementSummary03.setName("XML Real-time internal agreement");
        agreementSummary03.setComment("Create an agreement with an internal party to supply real-time XML data.");
        agreementSummary03.setCreateddate(now);
        agreementSummary03.setDetailsurl(requestURL + "8693f1cd-8a77-4bca-87b0-46b3568657d4");
        agreementSummaries.add(agreementSummary03);

        AgreementSummaryDTO agreementSummary04 = new AgreementSummaryDTO();
        agreementSummary04.setId("15bdb060-e2f3-4665-a231-fc325fb23e2b");
        agreementSummary04.setName("JSON Real-time external agreement");
        agreementSummary04.setComment("Create an agreement with an external party to supply real-time JSON data.");
        agreementSummary04.setCreateddate(now);
        agreementSummary04.setDetailsurl(requestURL + "15bdb060-e2f3-4665-a231-fc325fb23e2b");
        agreementSummaries.add(agreementSummary04);

        return agreementSummaries;
    }

    private Map<String, Agreement> createAgreementDetailsMap()
    {
        Map<String, Agreement> agreementDetailsMap = new HashMap<String, Agreement>();

        Date now = new Date();
 
        Agreement agreement01 = new Agreement();
        agreement01.setId("3f7e5ba2-1e03-4641-b477-36d3ecb18de8");
        agreement01.setName("XML Real-time internal agreement");
        agreement01.setComment("Create an agreement with an internal party to supply real-time XML data.");
        agreement01.setStatefieldname("status");
        agreement01.setCreateddate(now);
        List<AgreementFieldDetailsDTO> agreementFieldDetails01 = new LinkedList<AgreementFieldDetailsDTO>();
        AgreementFieldDetailsDTO agreementFieldDetails01of01 = new AgreementFieldDetailsDTO();
        agreementFieldDetails01of01.setName("owner");
        agreementFieldDetails01of01.setType("text");
        agreementFieldDetails01of01.setLabel("Owner");
        agreementFieldDetails01of01.setPurpose("The owner of the Data Source");
        agreementFieldDetails01of01.setValue("Owner");
        agreementFieldDetails01of01.setMutable(true);
        agreementFieldDetails01.add(agreementFieldDetails01of01);
        AgreementFieldDetailsDTO agreementFieldDetails02of01 = new AgreementFieldDetailsDTO();
        agreementFieldDetails02of01.setName("status");
        agreementFieldDetails02of01.setType("text");
        agreementFieldDetails02of01.setLabel("Status");
        agreementFieldDetails02of01.setPurpose("Status of agreement");
        agreementFieldDetails02of01.setValue("Active");
        agreementFieldDetails02of01.setMutable(false);
        agreementFieldDetails01.add(agreementFieldDetails02of01);
        AgreementFieldDetailsDTO agreementFieldDetails03of01 = new AgreementFieldDetailsDTO();
        agreementFieldDetails03of01.setName("datasourceurl");
        agreementFieldDetails03of01.setType("text");
        agreementFieldDetails03of01.setLabel("Data Source URL");
        agreementFieldDetails03of01.setPurpose("The location of Data Source");
        agreementFieldDetails03of01.setValue("http://example.org/datasoource/01");
        agreementFieldDetails03of01.setMutable(true);
        agreementFieldDetails01.add(agreementFieldDetails03of01);
        agreement01.setFieldsdetails(agreementFieldDetails01);
        agreementDetailsMap.put("3f7e5ba2-1e03-4641-b477-36d3ecb18de8", agreement01);

        Agreement agreementDetails02 = new Agreement();
        agreementDetails02.setId("6e5747ef-41da-4344-a15e-e386695605f4");
        agreementDetails02.setName("JSON Real-time external agreement");
        agreementDetails02.setComment("Create an agreement with an external party to supply real-time JSON data.");
        agreementDetails02.setCreateddate(now);
        List<AgreementFieldDetailsDTO> agreementFieldDetails02 = new LinkedList<AgreementFieldDetailsDTO>();
        agreementDetails02.setFieldsdetails(agreementFieldDetails02);
        agreementDetailsMap.put("6e5747ef-41da-4344-a15e-e386695605f4", agreementDetails02);

        Agreement agreementDetails03 = new Agreement();
        agreementDetails03.setId("8693f1cd-8a77-4bca-87b0-46b3568657d4");
        agreementDetails03.setName("XML Real-time internal agreement");
        agreementDetails03.setComment("Create an agreement with an internal party to supply real-time XML data.");
        agreementDetails03.setCreateddate(now);
        List<AgreementFieldDetailsDTO> agreementFieldDetails03 = new LinkedList<AgreementFieldDetailsDTO>();
        agreementDetails03.setFieldsdetails(agreementFieldDetails03);
        agreementDetailsMap.put("8693f1cd-8a77-4bca-87b0-46b3568657d4", agreementDetails03);

        Agreement agreementDetails04 = new Agreement();
        agreementDetails04.setId("15bdb060-e2f3-4665-a231-fc325fb23e2b");
        agreementDetails04.setName("JSON Real-time external agreement");
        agreementDetails04.setComment("Create an agreement with an external party to supply real-time JSON data.");
        agreementDetails04.setCreateddate(now);
        List<AgreementFieldDetailsDTO> agreementFieldDetails04 = new LinkedList<AgreementFieldDetailsDTO>();
        agreementDetails04.setFieldsdetails(agreementFieldDetails04);
        agreementDetailsMap.put("15bdb060-e2f3-4665-a231-fc325fb23e2b", agreementDetails04);

        return agreementDetailsMap;
    }    
    
    @Context
    private HttpServletRequest _request;
}
