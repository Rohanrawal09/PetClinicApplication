package com.rouge.petclinic.services.springjpa;

import com.rouge.petclinic.model.Visit;
import com.rouge.petclinic.repositories.VisitRepositories;
import com.rouge.petclinic.services.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created By Rohan Rawal On 1/10/2020
 */
@Service
@Profile("springdatajpa")
public class VisitSDJpaService implements VisitService {

    private final VisitRepositories visitRepositories;

    public VisitSDJpaService(VisitRepositories visitRepositories) {
        this.visitRepositories = visitRepositories;
    }

    @Override
    public Visit findById(Long aLong){
        return visitRepositories.findById(aLong).orElse(null);
    }

    @Override
    public Visit save(Visit object) {
        return visitRepositories.save(object);
    }

    @Override
    public Set<Visit> findAll() {
       Set<Visit> visits = new HashSet<>();
        visitRepositories.findAll().forEach(visits::add);
       return visits;
    }

    @Override
    public void delete(Visit object) {
        visitRepositories.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        visitRepositories.deleteById(aLong);
    }
}