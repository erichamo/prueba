package com.example.service;

import java.util.List;

public interface IService<T, V> {

    public T save(T t);
    public boolean delete(V id);
    public T update(T t);
    public List<T> getAll();
    public T getById(V id);
}
