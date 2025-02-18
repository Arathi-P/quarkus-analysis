package org.example;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from Quarkus REST service 2";
    }

    @GET
    @Path("/methodB")  // Changed this to GET instead of POST
    @Produces(MediaType.TEXT_PLAIN)
    public String methodB() {
        return "Hello from Method B service 2 from service 1";
    }
}
