package com.rouge.petclinic.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Created By Rohan Rawal On 07/01/2020
 */
public class Vet extends Person{

    private Set<Speciality> specialities = new HashSet<>();

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}
