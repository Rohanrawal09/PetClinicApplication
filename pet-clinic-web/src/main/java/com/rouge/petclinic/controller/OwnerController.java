package com.rouge.petclinic.controller;

import com.rouge.petclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created By Rohan Rawal On 1/9/2020
 */
@Controller
@RequestMapping("/owners")
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"/find","/find/index","/find/index.html"})
    public String callIndex(Model model){

        model.addAttribute("owners",ownerService.findAll());
        return "owner/index";

    }
}