package org.example;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RegisterRestClient(configKey = "service2")
@Path("/hello")
public interface Service2Client {

    @GET
    @Path("/methodB")
    @Produces(MediaType.TEXT_PLAIN)
    String methodB();
}
