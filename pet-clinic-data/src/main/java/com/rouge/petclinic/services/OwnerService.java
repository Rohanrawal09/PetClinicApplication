package com.rouge.petclinic.services;

import com.rouge.petclinic.model.Owner;

import java.util.Set;

/**
 * Created By Rohan Rawal On 1/8/2020
 */
public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
