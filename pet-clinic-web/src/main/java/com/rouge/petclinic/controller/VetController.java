package com.rouge.petclinic.controller;

import com.rouge.petclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created By Rohan Rawal On 1/9/2020
 */
@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }


    @RequestMapping({"/vets","/vets/index","/vets/index.html"})
    public String callIndex(Model model){

        model.addAttribute("vets",vetService.findAll());
        return "vet/index";

    }
}