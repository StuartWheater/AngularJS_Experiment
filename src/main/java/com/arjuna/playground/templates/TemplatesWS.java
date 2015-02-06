/*
 * Copyright (c) 2015, Arjuna Technologies Limited, Newcastle-upon-Tyne, England. All rights reserved.
 */

package com.arjuna.playground.templates;

import java.util.Collections;
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
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

@Path("/")
@Stateless
public class TemplatesWS
{
    private static final Logger logger = Logger.getLogger(TemplatesWS.class.getName());

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<TemplateFieldDescriptionDTO> getTemplateFieldDescriptions(@PathParam("id") String id)
    {
        logger.log(Level.FINE, "TemplatesWS.getTemplateFieldDescriptions: [" + id + "]");
        try
        {
            Map<String, List<TemplateFieldDescriptionDTO>> templateFieldDescriptionsMap = createTemplateFieldDescriptionsMap();

            return templateFieldDescriptionsMap.get(id);
        }
        catch (Throwable throwable)
        {
            logger.log(Level.WARNING, "getTemplateFieldDescriptions: Unable get template field descriptions", throwable);

            return Collections.emptyList();
        }
    }

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public List<TemplateDescriptionDTO> getTemplateDescriptions()
    {
        logger.log(Level.FINE, "TemplatesWS.getTemplateDescriptions");
        try
        {
            List<TemplateDescriptionDTO> templateDescriptions = createTemplateDescriptions();

            return templateDescriptions;
        }
        catch (Throwable throwable)
        {
            logger.log(Level.WARNING, "getTemplateDescriptions: Unable get template descriptions", throwable);

            return Collections.emptyList();
        }
    }

    private List<TemplateDescriptionDTO> createTemplateDescriptions()
    {
        List<TemplateDescriptionDTO> templateDescriptions = new LinkedList<>();

        TemplateDescriptionDTO templateDescription01 = new TemplateDescriptionDTO();
        templateDescription01.setURL(_request.getRequestURI() + "/3f7e5ba2-1e03-4641-b477-36d3ecb18de8");
        templateDescription01.setName("XML Real-time internal agreement");
        templateDescription01.setPurpose("Create an agreement with an internal party to supply real-time XML data.");
        templateDescriptions.add(templateDescription01);

        TemplateDescriptionDTO templateDescription02 = new TemplateDescriptionDTO();
        templateDescription02.setURL(_request.getRequestURI() + "/6e5747ef-41da-4344-a15e-e386695605f4");
        templateDescription02.setName("JSON Real-time external agreement");
        templateDescription02.setPurpose("Create an agreement with an external party to supply real-time JSON data.");
        templateDescriptions.add(templateDescription02);

        TemplateDescriptionDTO templateDescription03 = new TemplateDescriptionDTO();
        templateDescription03.setURL(_request.getRequestURI() + "/8693f1cd-8a77-4bca-87b0-46b3568657d4");
        templateDescription03.setName("XML Real-time internal agreement");
        templateDescription03.setPurpose("Create an agreement with an internal party to supply real-time XML data.");
        templateDescriptions.add(templateDescription03);

        TemplateDescriptionDTO templateDescription04 = new TemplateDescriptionDTO();
        templateDescription04.setURL(_request.getRequestURI() + "/15bdb060-e2f3-4665-a231-fc325fb23e2b");
        templateDescription04.setName("JSON Real-time external agreement");
        templateDescription04.setPurpose("Create an agreement with an external party to supply real-time JSON data.");
        templateDescriptions.add(templateDescription04);

        return templateDescriptions;
    }

    private Map<String, List<TemplateFieldDescriptionDTO>> createTemplateFieldDescriptionsMap()
    {
        Map<String, List<TemplateFieldDescriptionDTO>> templateFieldDescriptionMap = new HashMap<>();

        return templateFieldDescriptionMap;
    }
    
    @Context
    private HttpServletRequest _request;
}
