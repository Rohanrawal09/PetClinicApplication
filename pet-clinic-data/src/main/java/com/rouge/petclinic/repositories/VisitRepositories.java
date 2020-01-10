package com.rouge.petclinic.repositories;

import com.rouge.petclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

/**
 * Created By Rohan Rawal On 1/10/2020
 */
public interface VisitRepositories extends CrudRepository<Visit, Long> {
}
