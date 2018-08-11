package com.app;

import javax.xml.ws.Endpoint;

public class Main {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8082/mydata", new MyServiceImpl());
    }
}
