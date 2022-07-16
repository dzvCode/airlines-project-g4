package com.g4.model.repository;

import java.util.List;

public interface CrudRepository<T> {
    boolean register(T t);
    //List<T> read();
    boolean read(T t);
    boolean update(T t);
    boolean delete(T t);
}