package com.app;

import java.util.List;

public interface DAO {

    public MyData read(int id);

    public List<MyData> readAll();

    public void save(MyData myData);

}
