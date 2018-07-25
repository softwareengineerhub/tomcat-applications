/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.app;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.app.model.DataContent;
import org.app.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * REST Web Service
 *
 * @author denys.prokopiuk
 */
@Path("generic")
public class GenericEndpoint {

    @Autowired
    @Qualifier(value = "dataServiceImpl")
    private DataService dataService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public DataContent get() {
        System.out.println("get().dataService=" + dataService);
        DataContent dataContent = dataService.getDataContent();
        dataContent.setVersion("1234567");
        System.out.println("\t\tdataContent=+" + dataContent);
        return dataContent;
    }

    @PUT
    @Consumes(value = MediaType.APPLICATION_JSON)
    public void put(@Valid DataContent dataContent) {
        System.out.println("put().dataService=" + dataService);
        dataService.putDataContent(dataContent);
    }
    
    
    @POST
    //@Consumes(value = MediaType.APPLICATION_JSON)
    //@Valid
    public void post(DataContent dataContent) {
        System.out.println("post().dataService=" + dataService);
        //dataService.putDataContent(dataContent);
    }

}
