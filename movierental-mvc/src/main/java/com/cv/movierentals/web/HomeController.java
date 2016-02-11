package com.cv.movierentals.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET )
	public String home(){
		String greeting = "Welcome to Rantr. Rant! Rant! Rant!";
		return greeting;
	}

}
