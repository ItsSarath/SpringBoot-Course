package com.vit.springbootstarter.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vit.springbootstarter.service.TopicService;

@RestController
public class TopicController {
	
	@Autowired
	TopicService topicService;

	@RequestMapping("/topics")
	public List<TopicClass> getAllTopics() {
		//Since its a Rest controller annotation, 
		//this method returns the list into JSON by Spring MVC
		return topicService.getAllTopics();
		//All topics are kept in service class so that no need to create new list every time
	}
}
