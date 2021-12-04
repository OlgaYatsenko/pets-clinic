package com.example.petsclinic.data.service;

import java.util.Set;



public interface GrudService<T,ID> {
    void delete(T t);
    void deleteById(ID id);
    T findById(ID id);
    T save(T t);
    Set<T> findAll();


}
