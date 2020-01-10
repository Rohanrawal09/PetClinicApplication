package com.rouge.petclinic.repositories;

import com.rouge.petclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created By Rohan Rawal On 1/10/2020
 */
public interface OwnerRepositories extends CrudRepository<Owner, Long> {

    List<Owner> findAllByLastNameLike(String lastName);

    Owner findByLastName(String lastName);
}
