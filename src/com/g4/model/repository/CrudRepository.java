package com.g4.model.repository;

import com.g4.model.entity.MyDoublyLinkedList;
import javax.swing.table.DefaultTableModel;

public interface CrudRepository<T> {
    boolean register(T t);
    void read();
    void findById(T t);
    boolean update(T t);
    boolean delete(T t);
}