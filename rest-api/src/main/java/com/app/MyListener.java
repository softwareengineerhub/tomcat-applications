package com.app;

import javax.enterprise.event.Observes;

public class MyListener {

    public void onMessage(@Observes String message){
        System.out.println(message);
    }
}
