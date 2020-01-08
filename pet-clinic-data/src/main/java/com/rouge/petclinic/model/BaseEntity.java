package com.rouge.petclinic.model;

import java.io.Serializable;

/**
 * Created By Rohan Rawal On 1/8/2020
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}