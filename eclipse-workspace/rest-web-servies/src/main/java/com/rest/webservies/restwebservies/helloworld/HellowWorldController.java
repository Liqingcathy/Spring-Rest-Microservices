package com.rest.webservies.restwebservies.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Rest API
@RestController
public class HellowWorldController {
	//DispatcherServletAutoConfiguration auto configures urls(path)
	
	//@RequestMapping(method=RequestMethod.GET, path = "/hello")
	@GetMapping(path = "/hello")
	public String helloWorld() {
		return "Hello Rest API";
	}
	
	//created HelloWorldBean class to reuse the object which return response in JSON
	@GetMapping(path = "/hello-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello Rest API");
	}
	
	@GetMapping(path = "/hello/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello, %s", name));
	}
	
	
	
}
