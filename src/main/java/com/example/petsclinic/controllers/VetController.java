package com.example.petsclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("vets")
public class VetController {

    @RequestMapping({"", "/", "/index"})
    public String index(){

        return "vets/index";
    }

}
