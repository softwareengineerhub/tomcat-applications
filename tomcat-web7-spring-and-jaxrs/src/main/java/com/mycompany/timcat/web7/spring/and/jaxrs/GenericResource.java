/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.timcat.web7.spring.and.jaxrs;

import com.mycompany.timcat.web7.spring.and.jaxrs.processor.BusinessProcessor;
import javax.annotation.Resource;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * REST Web Service
 *
 * @author denys.prokopiuk
 */
@Path("generic")
public class GenericResource {

    @Autowired
    @Qualifier(value = "bpA")
    private BusinessProcessor businessProcessorA;

    @Autowired
    @Qualifier(value = "bpB")
    private BusinessProcessor businessProcessorB;

    @Autowired
    @Qualifier(value = "bpC")
    private BusinessProcessor businessProcessorC;

    @Autowired
    @Qualifier(value = "defaultDP")
    private BusinessProcessor businessProcessorD;

    @GET
    public String getXml() {
        businessProcessorA.process();
        businessProcessorB.process();
        businessProcessorC.process();
        businessProcessorD.process();
        return "Test!!!";
    }

}
