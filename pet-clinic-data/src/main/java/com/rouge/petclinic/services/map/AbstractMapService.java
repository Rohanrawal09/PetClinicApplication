package com.rouge.petclinic.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created By Rohan Rawal On 1/8/2020
 */
public abstract class AbstractMapService <T , Id>{

    protected Map<Id,T> map = new HashMap<>();

    T findById(Id id){
        return map.get(id);
    }

    T save(Id id,T object){
        map.put(id,object);
        return object;
    }

    Set<T> findAll(){
        return new HashSet<>(map.values());
    }

    void delete(T object){
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    void deleteById(Id id){
        map.remove(id);
    }
}