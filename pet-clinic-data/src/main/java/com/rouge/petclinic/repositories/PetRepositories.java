package com.rouge.petclinic.repositories;

import com.rouge.petclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

/**
 * Created By Rohan Rawal On 1/10/2020
 */
public interface PetRepositories extends CrudRepository<Pet, Long> {
}
