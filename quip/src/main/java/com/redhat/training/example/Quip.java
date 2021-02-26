package com.redhat.training.example;

import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import java.net.InetAddress;


@Path("/")
public class Quip {

@GET
@Produces("text/plain")
public Response index() throws Exception {
    String host = InetAddress.getLocalHost().getHostName();
<<<<<<< HEAD
    return Response.ok("I came, I saw, I conquered...\n").build();
=======
>>>>>>> f5a6e62639b17ec9f8a0c27e6ef4ba2b26b31209
  }

@GET
@Path("/ready")
@Produces("text/plain")
public Response ready() throws Exception {
    return Response.ok("OK\n").build();
  }

}

