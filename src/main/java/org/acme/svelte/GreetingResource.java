package org.acme.svelte;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.annotations.jaxrs.PathParam;


@Path("/hello")
public class GreetingResource {

    @Inject
    private GreetingService greeter;
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/{name}")
    public String hello(@PathParam String name) {
        return greeter.greets(name);
    }
}