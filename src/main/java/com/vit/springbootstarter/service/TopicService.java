package com.vit.springbootstarter.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.vit.springbootstarter.topic.TopicClass;

@Service
public class TopicService {
	private List<TopicClass> allTopics = Arrays.asList(
			new TopicClass("133", "C Lang", "Its a computer language"),
			new TopicClass("134", "C++", "OOPS"),
			new TopicClass("135", "Java", "Also OOPS"));
	
	public List<TopicClass> getAllTopics() {
		return allTopics;
	}

	public TopicClass getTopic(String id) {
		// Java 8
		//return allTopics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		//Java 7
		TopicClass resultTopicClass = new TopicClass();
		for(TopicClass topic: allTopics) {
			if(topic.getId().equals(id)) {
				resultTopicClass = topic;
				break;
			}
		}
		return resultTopicClass;
	}

}