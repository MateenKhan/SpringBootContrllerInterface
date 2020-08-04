package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/default")
public interface GreetingController {

	@GetMapping("/s1")
	public Object asdf();

//	@GetMapping("/s2")
//	public Object s2();
}
