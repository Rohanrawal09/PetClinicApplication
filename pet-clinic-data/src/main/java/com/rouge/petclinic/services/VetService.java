package com.rouge.petclinic.services;

import com.rouge.petclinic.model.Vet;

import java.util.Set;

/**
 * Created By Rohan Rawal On 1/8/2020
 */
public interface VetService {

    Vet findById(Long id);

    Vet save(Vet owner);

    Set<Vet> findAll();

}
