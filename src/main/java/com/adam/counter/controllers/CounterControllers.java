package com.adam.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("your_server")
public class CounterControllers {

	
	@RequestMapping("")
	public String home(HttpSession session) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}
		else {
			int newCount = (int)session.getAttribute("count");
			newCount++;
			System.out.println(newCount);
			session.setAttribute("count", newCount);
		}
		return "dashboard.jsp";
	}
	
	@RequestMapping("counter")
	public String counter() {
		return "currentCount.jsp";
	}

	
	
	
	
	
	
}
