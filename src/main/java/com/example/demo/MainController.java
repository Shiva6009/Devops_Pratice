package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class MainController {

	
	@RequestMapping(value = "/testapi" , method = RequestMethod.GET)
	public String testApi()
	{
		System.out.println(" Inside the Controller");
		return "Hai I am Working Fine!!"; 
	}
	
}
