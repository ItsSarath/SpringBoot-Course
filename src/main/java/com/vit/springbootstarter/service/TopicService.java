package com.vit.springbootstarter.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.vit.springbootstarter.topic.TopicClass;

@Service
public class TopicService {
	private List<TopicClass> allTopics = Arrays.asList(
			new TopicClass("0133", "C Lang", "Its a computer language"),
			new TopicClass("0134", "C++", "OOPS"),
			new TopicClass("0135", "Java", "Also OOPS"));
	
	public List<TopicClass> getAllTopics() {
		return allTopics;
	}

}
