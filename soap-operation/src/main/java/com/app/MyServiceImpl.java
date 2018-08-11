package com.app;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;


@WebService
public class MyServiceImpl implements MyService {

    private List<MyData> data = new ArrayList<>();


    @WebMethod
    @Override
    public List<MyData> getAll() {
        return data;
    }

    @WebMethod
    @Override
    public MyData get(int id) {
        return data.get(id);
    }

    @WebMethod
    @Override
    public void save(MyData myData) {
        data.add(myData);
    }
}
