/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tomcat.web7.jaxrs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * REST Web Service
 *
 * @author denys.prokopiuk
 */
@Path("generic")
public class GenericResource {

    @GET
    public String get(){
        return "GET";
    }
   
}
