package com.app;


import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.List;

@Singleton
public class InMemoryDAOImpl implements DAO {
    private List<MyData> data = new ArrayList<>();

    @Override
    public MyData read(int id) {
        return data.get(id);
    }

    @Override
    public List<MyData> readAll() {
        return data;
    }

    @Override
    public void save(MyData myData) {
        data.add(myData);
    }
}
