package com.rouge.petclinic.services.map;

import com.rouge.petclinic.model.Speciality;
import com.rouge.petclinic.services.SpecialityService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created By Rohan Rawal On 1/10/2020
 */
@Service
public class SpecialityServiceMap extends AbstractMapService<Speciality,Long> implements SpecialityService {

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }
}