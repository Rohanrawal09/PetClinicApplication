package com.rouge.petclinic.services;

import com.rouge.petclinic.model.Pet;

import java.util.Set;

/**
 * Created By Rohan Rawal On 1/8/2020
 */
public interface PetService {

    Pet findById(Long id);

    Pet save(Pet owner);

    Set<Pet> findAll();
}
