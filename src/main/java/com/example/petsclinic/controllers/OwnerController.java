package com.example.petsclinic.controllers;

import com.example.petsclinic.data.model.Owner;
import com.example.petsclinic.data.repository.OwnerRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("owners")
public class OwnerController {

    private final OwnerRepository ownerRepository;

    public OwnerController(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    @RequestMapping(value = {"", "/", "/index"},method = RequestMethod.GET)
    public String showAll(Model model){
        List<Owner> owners=new ArrayList<>();
        ownerRepository.findAll().forEach(owner->owners.add(owner));
        for (Owner owner : owners) {
            System.out.println(owner.getLastname());
        }
        model.addAttribute("owners", owners);

        return "owners/index";
    }

}