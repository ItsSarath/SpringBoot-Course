package com.vit.springbootstarter.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {
	
	@RequestMapping("/") //for GET request
	public String sayHello(Model model) {
		model.addAttribute("message", "Welcome!!");
		return "index";
	}
	

}
