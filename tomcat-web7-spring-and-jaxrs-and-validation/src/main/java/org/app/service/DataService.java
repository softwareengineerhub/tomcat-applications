/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.app.service;

import org.app.model.DataContent;

/**
 *
 * @author denys.prokopiuk
 */
public interface DataService {

    public DataContent getDataContent();

    public void putDataContent(DataContent dataContent);

}
