/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.app.service;

import org.app.model.DataContent;
import org.app.model.Person;
import org.springframework.stereotype.Service;

/**
 *
 * @author denys.prokopiuk
 */
@Service(value = "dataServiceImpl")
public class DataServiceImpl implements DataService {

    @Override
    public DataContent getDataContent() {
        DataContent dataContent = new DataContent();
        dataContent.setVersion("v1");
        Person person = new Person();
        person.setAge(1);
        person.setName("Name1");
        dataContent.setPerson(person);
        return dataContent;
    }

    @Override
    public void putDataContent(DataContent dataContent) {
        System.out.println("Data was saved: " + dataContent);
    }

}
