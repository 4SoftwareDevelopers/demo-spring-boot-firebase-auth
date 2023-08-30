package com.example.demospringbootfirebaseauth.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class AppController {
	
	@GetMapping(path = "/getName")
	public String getPrincipalName(Principal principal) {
		return principal.getName();
	}

}
