package com.example.petsclinic.data.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import java.time.LocalDate;


@Data
@RequiredArgsConstructor
@Entity
public class Pet extends BaseEntity{

    private  Owner owner;
    private PetType petType;
    private LocalDate birthday;

    public Owner getOwner() {
        return owner;
    }

    public PetType getPetType() {
        return petType;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}
