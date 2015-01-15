package com.verne.poc.hello;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 * Created by verne on 1/12/15.
 */
@Path("/speak")
@Produces("application/json")
public class Speak {
    @GET
    @Path("/hello")
    public Greet sayHello() {
        Greet hello = new Greet();
        hello.setName("there!");
        return hello;
    }

    @GET
    @Path("/hello/{name}")
    public Greet saySpecificHello(@PathParam("name") String name) {
        Greet hello = new Greet();
        hello.setName(name);

        return hello;
    }
}
