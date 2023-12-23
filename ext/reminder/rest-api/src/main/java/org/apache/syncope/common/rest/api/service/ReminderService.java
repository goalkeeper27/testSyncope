package org.apache.syncope.common.rest.api.service;

import org.apache.syncope.common.rest.api.service.JAXRSService;

import javax.validation.constraints.NotNull;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("test/rest")
public interface ReminderService extends JAXRSService {
    @GET
    @Produces("application/json")
    public String response();
}