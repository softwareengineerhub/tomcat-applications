/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.app.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author denys.prokopiuk
 */
@XmlRootElement
public class DataContent {

    private String version;
    private Person person;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

}
