package com.rouge.petclinic.services.map;

import com.rouge.petclinic.model.Owner;
import com.rouge.petclinic.services.CrudService;

import java.util.Set;

/**
 * Created By Rohan Rawal On 1/8/2020
 */
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner,Long> {

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(),object);
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }
}