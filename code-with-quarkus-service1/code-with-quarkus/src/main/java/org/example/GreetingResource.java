package org.example;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RestClient;


@Path("/hello")
public class GreetingResource {

    @RestClient
    Service2Client service2Client;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from Quarkus service 1";
    }

    @GET
    @Path("/callB")
    @Produces(MediaType.TEXT_PLAIN)
    public String callB() {
        return service2Client.methodB();
    }
}
