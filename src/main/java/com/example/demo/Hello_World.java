package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Hello_World {
	 @RequestMapping("/")
	   public String hello() {
	        return "Hello World, Spring Boot!";
	    }
	 @RequestMapping("/kube")
	 public String kube() {
		 return "Welcome to Containeraization";
	 }
}
