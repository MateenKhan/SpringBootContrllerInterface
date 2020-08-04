package com.example.restservice.service;


import com.example.restservice.CrudController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeService implements CrudController {

    //    http://localhost:8080/user/s1
    @Override
    public Object getById(String id) {
        return "Get employee By id:"+id;
    }

    @Override
    public Object deleteById(String id) {
        return "Delete employee By id:"+id;
    }
}
