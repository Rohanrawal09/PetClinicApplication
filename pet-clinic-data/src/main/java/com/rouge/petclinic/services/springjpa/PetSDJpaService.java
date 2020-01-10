package com.rouge.petclinic.services.springjpa;

import com.rouge.petclinic.model.Pet;
import com.rouge.petclinic.repositories.PetRepositories;
import com.rouge.petclinic.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created By Rohan Rawal On 1/10/2020
 */
@Service
@Profile("springdatajpa")
public class PetSDJpaService implements PetService {

    private final PetRepositories petRepositories;

    public PetSDJpaService(PetRepositories petRepositories) {
        this.petRepositories = petRepositories;
    }


    @Override
    public Pet findById(Long aLong) {
        return petRepositories.findById(aLong).orElse(null);
}

    @Override
    public Pet save(Pet object) {
        return petRepositories.save(object);
    }

    @Override
    public Set<Pet> findAll() {
        Set<Pet> pets = new HashSet<>();
        petRepositories.findAll().forEach(pets::add);
        return pets;
    }

    @Override
    public void delete(Pet object) {
        petRepositories.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        petRepositories.deleteById(aLong);
    }
}