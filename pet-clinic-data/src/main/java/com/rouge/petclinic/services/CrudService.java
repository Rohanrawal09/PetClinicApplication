package com.rouge.petclinic.services;

import java.util.Set;

/**
 * Created By Rohan Rawal On 1/8/2020
 */
public interface CrudService <T , Id>{

    T findById(Id id);

    T save(T object);

    Set<T> findAll();

    void delete(T object);

    void deleteById(Id id);
}
