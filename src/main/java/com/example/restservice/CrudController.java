package com.example.restservice;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


public interface CrudController {

	@GetMapping("/{id}")
	public Object getById(@PathVariable String id);

	@DeleteMapping("/{id}")
	public Object deleteById(@PathVariable String id);


}
