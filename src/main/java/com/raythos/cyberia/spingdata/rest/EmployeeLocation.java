package com.raythos.cyberia.spingdata.rest;

import javax.persistence.*;

@Entity
@Table(name = "EMPLOYEELOCATION")
public class EmployeeLocation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    private String location;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location= location;
    }
}
