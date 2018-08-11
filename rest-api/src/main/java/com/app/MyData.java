package com.app;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MyData {
    @Size(min = 2, max = 10)
    private String name;
    private String secondName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    @Override
    public String toString() {
        return "MyData{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }
}
