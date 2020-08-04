package com.example.restservice.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class Infoservice {


    public String info(){
        return "version : 1.0.0";
    }
}
