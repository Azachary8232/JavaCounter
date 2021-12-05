package com.adam.counter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("your_server")
public class CounterControllers {

	
	@RequestMapping("")
	public String home() {
		return "dashboard.jsp";
	}
}
