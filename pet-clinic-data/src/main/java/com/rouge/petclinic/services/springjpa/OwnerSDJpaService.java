package com.rouge.petclinic.services.springjpa;

import com.rouge.petclinic.model.Owner;
import com.rouge.petclinic.repositories.OwnerRepositories;
import com.rouge.petclinic.repositories.PetRepositories;
import com.rouge.petclinic.repositories.PetTypeRepositories;
import com.rouge.petclinic.services.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created By Rohan Rawal On 1/10/2020
 */
@Service
@Profile("springdatajpa")
public class OwnerSDJpaService implements OwnerService {

    private final OwnerRepositories ownerRepositories;
    private final PetRepositories  petRepositories;
    private final PetTypeRepositories petTypeRepositories;

    public OwnerSDJpaService(OwnerRepositories ownerRepositories, PetRepositories petRepositories, PetTypeRepositories petTypeRepositories) {
        this.ownerRepositories = ownerRepositories;
        this.petRepositories = petRepositories;
        this.petTypeRepositories = petTypeRepositories;
    }

    @Override
    public Owner findByLastName(String lastName) {
        return ownerRepositories.findByLastName(lastName);
    }

    public List<Owner> findAllByLastNameLike(String lastName) {
        return ownerRepositories.findAllByLastNameLike(lastName);
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner> owners = new HashSet<>();
        ownerRepositories.findAll().forEach(owners::add);
        return owners;
    }

    @Override
    public Owner findById(Long aLong) {
        return ownerRepositories.findById(aLong).orElse(null);
    }

    @Override
    public Owner save(Owner object) {
        return ownerRepositories.save(object);
    }

    @Override
    public void delete(Owner object) {
        ownerRepositories.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        ownerRepositories.deleteById(aLong);
    }
}