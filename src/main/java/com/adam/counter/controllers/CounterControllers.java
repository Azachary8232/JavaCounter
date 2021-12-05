package com.adam.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("your_server")
public class CounterControllers {

	
	@RequestMapping("")
	public String home(HttpSession session, Model model) {
		Integer newCount = (Integer)session.getAttribute("count");
		if (session.getAttribute("count") == null) {
			System.out.println(session.getAttribute("count"));
			session.setAttribute("count", 0);
			System.out.println(session.getAttribute("count"));
		}
		else {
			newCount++;
			System.out.println(newCount);
			session.setAttribute("count", newCount);
		}
		model.addAttribute("count", newCount);
		return "dashboard.jsp";
	}
	
	@RequestMapping("/x2")
	public String homeX2(HttpSession session, Model model) {
		Integer newCount = (Integer)session.getAttribute("count");
		if (session.getAttribute("count") == null) {
			System.out.println(session.getAttribute("count"));
			session.setAttribute("count", 0);
			System.out.println(session.getAttribute("count"));
		}
		else {
			newCount += 2;
			System.out.println(newCount);
			session.setAttribute("count", newCount);
		}
		model.addAttribute("count", newCount);
		return "dashboardX2.jsp";
	}

	
	@RequestMapping("counter")
	public String counter() {
		return "currentCount.jsp";
	}

	
	
	
	
	
	
}
