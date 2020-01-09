package com.rouge.petclinic.model;

/**
 * Created By Rohan Rawal On 1/10/2020
 */
public class Speciality extends BaseEntity{

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}