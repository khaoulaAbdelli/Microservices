package com.example.demo.service;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//@PropertySource("classpath:boostrap.properties")
@RestController
public class BourseRestService {
	@Value("${kabd}")
	private String message ;
	@RequestMapping("/messages")
	public String tellMe() {
		return message ;
		
	}

}
