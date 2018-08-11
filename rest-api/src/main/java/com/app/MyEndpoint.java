package com.app;

import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.inject.Named;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/mydata")
public class MyEndpoint {

    @Inject
    private DAO dao;
    @Inject
    private Event<String> textEvent;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<MyData> getAll() {
        textEvent.fire("getAll()");
        return dao.readAll();
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public MyData get(@PathParam("id") int id)
    {
        textEvent.fire("ge(id)");
        return dao.read(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void save(MyData myData)
    {
        textEvent.fire("save(myData)");
        dao.save(myData);
    }

}
