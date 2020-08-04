package com.example.restservice.service;

import com.example.restservice.CrudController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserService implements CrudController {


    @Autowired
    Infoservice infoservice;

//    http://localhost:8080/user/s1
    @Override
    public Object getById(String id) {
        return "Get User By id:"+id;
    }

    @Override
    public Object deleteById(String id) {
        return "Delete User By id:"+id;
    }

    @Override
    public String info() {
        return infoservice.info();
    }
}
