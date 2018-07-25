/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.timcat.web7.spring.and.jaxrs;

import com.mycompany.timcat.web7.spring.and.jaxrs.processor.BusinessProcessor;
import com.mycompany.timcat.web7.spring.and.jaxrs.processor.BusinessProcessorImplB;
import com.mycompany.timcat.web7.spring.and.jaxrs.processor.BusinessProcessorImplA;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author denys.prokopiuk
 */
//@Configuration
//@ComponentScan({"com.mycompany"})
public class SpringDataConfig {
    
  //  @Bean(name="bpA")
    public BusinessProcessor getCustomerService(){        
        return new BusinessProcessorImplA();
    }
    
    //@Bean(name="bpB")
    public BusinessProcessor getCustomerRepository(){
        return new BusinessProcessorImplB();
    }
    
}
