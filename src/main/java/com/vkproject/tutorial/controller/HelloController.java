package com.vkproject.tutorial.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	private static final Logger logger = LoggerFactory.getLogger(HelloController.class);
	@GetMapping("/hello")
	public String sayHello() {
		  logger.info("Inside /hello endpoint");
	        logger.debug("Debug log for /hello");
	        logger.warn("Warning log for /hello");
	        logger.error("Error log for /hello");
		
		return "Hello, Spring boot";
	}
}
