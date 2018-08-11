package com.app;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.annotation.WebListener;
import javax.servlet.ServletContextAttributeListener;

@WebListener
public class MyAttributesListener implements  ServletContextAttributeListener {

    @Override
    public void attributeAdded(ServletContextAttributeEvent servletContextAttributeEvent) {
        //servletContextAttributeEvent.getValue();
        System.out.println("Attribute added:"+servletContextAttributeEvent.getValue());
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent servletContextAttributeEvent) {
        System.out.println("Attribute removed:"+servletContextAttributeEvent.getValue());
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent servletContextAttributeEvent) {
        System.out.println("Attribute replaced:"+servletContextAttributeEvent.getValue());
    }
}
