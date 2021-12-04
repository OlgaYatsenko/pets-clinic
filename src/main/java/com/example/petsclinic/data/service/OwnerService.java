package com.example.petsclinic.data.service;

import com.example.petsclinic.data.model.Owner;
import org.springframework.stereotype.Service;


@Service
public interface OwnerService extends GrudService<Owner, Long>{
    Owner findByLastName(String lastName);

}
