package com.example.petsclinic.bootstrap;

import com.example.petsclinic.data.model.Owner;
import com.example.petsclinic.data.repository.OwnerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class DataLoader implements CommandLineRunner {

  private OwnerRepository ownerRepository;

    public DataLoader(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }



    @Override
    public void run(String... args) throws Exception {

        System.out.println("dataloader is called");

        Owner ivan=new Owner();
        ivan.setFirstname("Ivan");
        ivan.setLastname("Ivanov");
        ivan.setId(1L);

        ownerRepository.save(ivan);

        Owner petro=new Owner();
        petro.setFirstname("Petro");
        petro.setLastname("Petrov");
        petro.setId(2L);

        ownerRepository.save(petro);




    }
}
