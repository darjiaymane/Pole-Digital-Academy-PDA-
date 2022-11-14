package com.example.poledigitalacademypda.Dao;


public interface Dao<T> {
    public T find(int id);
    public T[] findAll();
    public boolean delete(int id);
    public T save(T t);
    public T update(T t);
}
