package com.docker.secret.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {
	
	@GetMapping(value = "/")
	public String defaultReturn() {
		return "<h1>Hello there! I am here now..<h1>";
	}

}
