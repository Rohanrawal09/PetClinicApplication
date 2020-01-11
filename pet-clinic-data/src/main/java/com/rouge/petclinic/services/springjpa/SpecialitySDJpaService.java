package com.rouge.petclinic.services.springjpa;

import com.rouge.petclinic.model.Speciality;
import com.rouge.petclinic.repositories.SpecilityRepositories;
import com.rouge.petclinic.services.SpecialityService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created By Rohan Rawal On 1/10/2020
 */
@Service
@Profile("springdatajpa")
public class SpecialitySDJpaService implements SpecialityService {

    private final SpecilityRepositories specilityRepositories;

    public SpecialitySDJpaService(SpecilityRepositories specilityRepositories) {
        this.specilityRepositories = specilityRepositories;
    }


    @Override
    public Speciality findById(Long aLong) {
        return specilityRepositories.findById(aLong).orElse(null);
}

    @Override
    public Speciality save(Speciality object) {
        return specilityRepositories.save(object);
    }

    @Override
    public Set<Speciality> findAll() {
        Set<Speciality> specialities = new HashSet<>();
        specilityRepositories.findAll().forEach(specialities::add);
        return specialities;
    }

    @Override
    public void delete(Speciality object) {
        specilityRepositories.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        specilityRepositories.deleteById(aLong);
    }
}