package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


@Entity
public class Employer extends AbstractEntity {


    @NotBlank(message="Location is required")
    @Size(min= 3, message = "Location must be at least 3 characters long")
    private String location;


    public Employer() {}

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
