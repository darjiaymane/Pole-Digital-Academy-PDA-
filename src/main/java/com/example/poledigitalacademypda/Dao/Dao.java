package com.example.poledigitalacademypda.Dao;


import java.util.List;

public interface Dao<T> {
    public T find(int id);
    public List<T> findAll();
    public void delete(int id);
    public T save(T t);
    public T update(T t);
}
