package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;

@RestController
@RequestMapping("/hello")
public class RestAPI {
	
	/**
	 * Call Get method to return the text
	 * @return
	 */
	@RequestMapping(value = {"","/","/home"})
	public String sayHello() {
		return "Hello from Bridgelabz...";
	}
	
	/**
	 * Call Get request method to display the message 
	 * @param name
	 * @return
	 */
	@RequestMapping(value= {"/query"} , method = RequestMethod.GET)
	public String sayHello(@RequestParam(value= "name") String name){
		return "Hello" +" "+ name + " "+ "from Bridgelabz";
	}
	
	/**
	 * Call Get request method by passing path variable and print the message
	 * @param name
	 * @return
	 */
	@GetMapping("/param/{name}")
	public String sayHelloParam(@PathVariable String name) {
		return "Hello"+" " + name +" "+ "from Bridgelabz"; 
	}
	
	/**
	 * Call post method to post the details on server
	 * @param user
	 * @return
	 */
	@PostMapping("/post")
	public String sayHello(@RequestBody User user) {
		return "Hello"+" " + user.getFirstName() + " " + user.getLastName()+" "+"from Bridgelabz";
	}
}