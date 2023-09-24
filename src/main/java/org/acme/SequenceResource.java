package org.acme;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import model.AlticciSequence;

@Path("/alticci")
public class SequenceResource {

    @Inject
    AlticciService alticciService;

    @Path("{num}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response showSequence(@PathParam("num") long num) {
        if(num<0){
            return Response.status(Response.Status.BAD_REQUEST).entity("The Number Should Be Positive").build();
        }
        else{
            return Response.ok(new AlticciSequence(alticciService, num)).build();
        }
    }
}
