package com.example.petsclinic.data.service;


import com.example.petsclinic.data.model.Vet;
import org.springframework.stereotype.Service;


@Service
public interface VetService  extends GrudService<Vet, Long>{
    Vet findByLastName(String lastName);

}
