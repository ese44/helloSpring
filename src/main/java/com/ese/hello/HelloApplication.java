package com.ese.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // web request handling
@SpringBootApplication // enable auto-configuration for SpringBoot application
public class HelloApplication {

	@RequestMapping("/") // handles requests made for the home page
	@ResponseBody // displays the body of the page
	String home(){
		return "Hello Spring!"; // display message
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	} // run the server
}
