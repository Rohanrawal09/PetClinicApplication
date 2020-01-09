package com.rouge.petclinic.services.map;

import com.rouge.petclinic.model.BaseEntity;

import java.util.*;

/**
 * Created By Rohan Rawal On 1/8/2020
 */
public abstract class AbstractMapService <T extends BaseEntity, Id extends Long>{

    protected Map<Long,T> map = new HashMap<>();

    T findById(Id id){
        return map.get(id);
    }

    T save(T object){

        if (object != null) {
            if (object.getId() == null) {
                object.setId(getNextId());
            }
            map.put(object.getId(),object);
        }
        else {
            throw new RuntimeException("Object Cannot Be Null");
        }
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

    private Long getNextId(){
        Long nextId = null;
        try{
            nextId = Collections.max(map.keySet()) +1;
        } catch (NoSuchElementException e){
            nextId = 1L;
        }
        return nextId;
    }
}