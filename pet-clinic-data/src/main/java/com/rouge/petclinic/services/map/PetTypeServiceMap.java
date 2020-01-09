package com.rouge.petclinic.services.map;

import com.rouge.petclinic.model.PetType;
import com.rouge.petclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created By Rohan Rawal On 1/10/2020
 */
@Service
public class PetTypeServiceMap extends AbstractMapService<PetType,Long>implements PetTypeService {

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(PetType object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}