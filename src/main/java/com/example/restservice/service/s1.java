package com.example.restservice.service;

import com.example.restservice.GreetingController;
import com.example.restservice.util.ErrorConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class s1 implements GreetingController {

    @Autowired
    ErrorConfig errorConfig;

    @Value("${server.port}")
    String port;

    public Object asdf(){
        System.out.println(port);
        return errorConfig.getMessages();
    }
}
