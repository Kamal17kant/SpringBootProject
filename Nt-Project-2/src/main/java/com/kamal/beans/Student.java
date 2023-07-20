package com.kamal.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("std")
public class Student {
	
	@Autowired
	@Qualifier("courseid")
	private IcourseMeterial course;
	public void prepration(String examName) {
		System.out.println("Prepraction Started for "+ examName);
		String courseContent=course.courseContent();
		double price=course.price();
		System.out.println("Prepration is goingon for "+courseContent+"material with price "+price);
		System.out.println("Prepration is completed for "+examName);
	}
	public Student() {
		System.out.println("Student 0 param constructor is called");
	}
}
