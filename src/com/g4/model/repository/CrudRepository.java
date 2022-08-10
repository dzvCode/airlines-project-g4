package com.g4.model.repository;

import java.util.List;
import javax.swing.table.DefaultTableModel;

public interface CrudRepository<T> {
    boolean register(T t);
    void read(DefaultTableModel model);
    //boolean read(T t);
    boolean update(T t);
    boolean delete(T t);
}