package com.rouge.petclinic.repositories;

import com.rouge.petclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

/**
 * Created By Rohan Rawal On 1/10/2020
 */
public interface PetTypeRepositories extends CrudRepository<PetType, Long> {
}
