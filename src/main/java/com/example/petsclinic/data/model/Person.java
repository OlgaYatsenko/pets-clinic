package com.example.petsclinic.data.model;


import javax.persistence.MappedSuperclass;


@MappedSuperclass
public class Person  extends BaseEntity {


    private String firstname;
    private  String lastname;


    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
