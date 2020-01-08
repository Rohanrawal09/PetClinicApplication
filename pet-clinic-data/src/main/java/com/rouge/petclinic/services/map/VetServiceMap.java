package com.rouge.petclinic.services.map;

import com.rouge.petclinic.model.Vet;
import com.rouge.petclinic.services.CrudService;

import java.util.Set;

/**
 * Created By Rohan Rawal On 1/8/2020
 */
public class VetServiceMap extends AbstractMapService<Vet,Long>implements CrudService<Vet,Long> {

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(),object);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }
}