package com.g4.model.repository;

import java.util.List;

public interface CrudRepository<T> {
    public boolean create(T t);
    public List<T> read();
    public boolean update(T t);
    public boolean delete(T t);
}