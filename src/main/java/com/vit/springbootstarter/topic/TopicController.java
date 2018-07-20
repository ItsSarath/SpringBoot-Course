package com.vit.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping("/topics")
	public List<TopicClass> getAllTopics() {
		//Since its a Rest controller annotation, 
		//this method returns the list into JSON by Spring MVC
		return Arrays.asList(
				new TopicClass("0133", "C Lang", "Its a computer language"),
				new TopicClass("0134", "C++", "OOPS"),
				new TopicClass("0135", "Java", "Also OOPS"));
	}
}
