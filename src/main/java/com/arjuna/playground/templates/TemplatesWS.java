/*
 * Copyright (c) 2015, Arjuna Technologies Limited, Newcastle-upon-Tyne, England. All rights reserved.
 */

package com.arjuna.playground.templates;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
@Stateless
public class TemplatesWS
{
    private static final Logger logger = Logger.getLogger(TemplatesWS.class.getName());

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public List<TemplateDescriptionDTO> getTemplateDescriptions()
    {
        logger.log(Level.FINE, "TemplatesWS.getTemplateDescriptions");
        try
        {
        	List<TemplateDescriptionDTO> templateDescriptions = new LinkedList<TemplateDescriptionDTO>();

        	return templateDescriptions;
        }
        catch (Throwable throwable)
        {
            logger.log(Level.WARNING, "getTemplateDescriptions: Unable get template descriptions", throwable);

            return Collections.emptyList();
        }
    }

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public List<TemplateFieldDescriptionDTO> getTemplateFieldDescriptions(@PathParam("id") String id)
    {
        logger.log(Level.FINE, "TemplatesWS.getTemplateFieldDescriptions: [" + id + "]");
        try
        {
        	List<TemplateFieldDescriptionDTO> templateFieldDescriptions = new LinkedList<TemplateFieldDescriptionDTO>();

        	return templateFieldDescriptions;
        }
        catch (Throwable throwable)
        {
            logger.log(Level.WARNING, "getTemplateFieldDescriptions: Unable get template field descriptions", throwable);

            return Collections.emptyList();
        }
    }
}
