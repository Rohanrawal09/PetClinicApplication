package com.rouge.petclinic.services;

import com.rouge.petclinic.model.Owner;

/**
 * Created By Rohan Rawal On 1/8/2020
 */
public interface OwnerService extends CrudService<Owner , Long>{

    Owner findByLastName(String lastName);
}
