package com.vit.springbootstarter.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vit.springbootstarter.service.TopicService;

@Controller
public class HelloController {
	
	@Autowired
	TopicService topicService;
	
	@RequestMapping("/") //for GET request
	public String sayHello(Model model) {
		model.addAttribute("message", "Welcome!!");
		return "index";
	}
	

}
