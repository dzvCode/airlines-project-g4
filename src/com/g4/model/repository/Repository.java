/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.g4.model.repository;

import java.util.List;

/**
 *
 * @author diego
 */
public interface Repository<T> {
    List<T> findAll();
    T porId(Long id);
    void guardar(T t);
}
