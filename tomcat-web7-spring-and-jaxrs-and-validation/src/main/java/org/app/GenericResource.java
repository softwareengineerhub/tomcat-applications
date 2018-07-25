/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.app;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.app.model.DataContent;
import org.app.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * REST Web Service
 *
 * @author denys.prokopiuk
 */
@Path("generic")
public class GenericResource {

    //@Autowired
    //@Qualifier(value = "bpA")
    //private BusinessProcessor businessProcessorA;

    @GET
    @Produces(value = MediaType.APPLICATION_JSON)
    public DataContent getXml() {
        DataContent dataContent = new DataContent();
        dataContent.setVersion("v1");
        Person person = new Person();
        person.setAge(1);
        person.setName("Name1");        
        return dataContent;
    }

}
