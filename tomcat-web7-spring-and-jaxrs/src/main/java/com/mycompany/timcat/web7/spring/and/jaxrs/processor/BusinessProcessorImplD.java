/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.timcat.web7.spring.and.jaxrs.processor;

/**
 *
 * @author denys.prokopiuk
 */
public class BusinessProcessorImplD implements BusinessProcessor {

    @Override
    public void process() {
        System.out.println("Default bp");
    }
    
}
