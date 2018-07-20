package com.vit.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseAPIAPP {

	public static void main(String[] args) {
		
		//Tells Spring boot application to add CourseAPIAPP class to servlet container and run which has a main method
		//args are arguments which we can pass while running spring boot application
		/*1. Sets up default configuration
		2. Starts Spring application context
		3. Performs class path scan
		4. Starts Tomcat server*/ 
		SpringApplication.run(CourseAPIAPP.class, args);
		
		/*Now add a controller
		we are building a Rest API(@RestController annotation)
		So we want response to be a simple JSON
		
		We can also have jsp, ftl, html responses*/
		

	}

}
