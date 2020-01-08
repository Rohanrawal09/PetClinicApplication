package com.rouge.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created By Rohan Rawal On 1/9/2020
 */
@Controller
public class VetController {

    @RequestMapping({"/vet","/vet/index","/vet/index.html"})
    public String callIndex(){
        return "vet/index";
    }
}