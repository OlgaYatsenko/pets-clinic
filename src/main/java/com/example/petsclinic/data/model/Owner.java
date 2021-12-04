package com.example.petsclinic.data.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;

@Data
@RequiredArgsConstructor
@Entity
public class Owner extends Person{

}
