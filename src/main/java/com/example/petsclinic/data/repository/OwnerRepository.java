package com.example.petsclinic.data.repository;

import com.example.petsclinic.data.model.Owner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
