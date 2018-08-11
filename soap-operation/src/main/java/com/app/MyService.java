package com.app;


import java.util.List;

public interface MyService {

    public List<MyData> getAll();

    public MyData get(int id);

    public void save(MyData myData);

}
