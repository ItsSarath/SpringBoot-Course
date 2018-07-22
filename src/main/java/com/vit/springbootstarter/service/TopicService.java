package com.vit.springbootstarter.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.vit.springbootstarter.topic.TopicClass;

@Service
public class TopicService {
	//Arrays.asList creates an immutable ArrayList - we cant change(Add/delete)
	// new ArrayList<>(Arrays.List); creates a mutable ArrayList
	private List<TopicClass> allTopics = new ArrayList<>(Arrays.asList(
			new TopicClass("133", "C Lang", "Its a computer language"),
			new TopicClass("134", "C++", "OOPS"),
			new TopicClass("135", "Java", "Also OOPS")));
	
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

	public void addTopic(TopicClass topic) {
		allTopics.add(topic);
	}

	public List<TopicClass> deleteTopic(String id) {
		//Java 8
		//allTopics.removeIf(t->t.getId().equals(id));
		//Java 7
		for(TopicClass topic: allTopics) {
			if(topic.getId().equals(id)) {
				allTopics.remove(topic);
				break;
			}
		}
		return allTopics;
		
	}

	public void updateTopic(String id, TopicClass topic) {
		for(int i=0;i<allTopics.size();i++) {
			if(allTopics.get(i).getId().equals(topic.getId())){
				allTopics.set(i, topic);
				return;
			}
			
		}
		
	}

}
