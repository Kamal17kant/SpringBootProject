package com.kamal.beans;

import org.springframework.stereotype.Component;

@Component("java")
public class JavaCouresMaterial implements IcourseMeterial {

	@Override
	public String courseContent() {
		// TODO Auto-generated method stub
		System.out.println("This are the Course Material for java developer");
		return "oops,Excetion,MultiThreading";
	}

	@Override
	public double price() {
		// TODO Auto-generated method stub
		return 5000;
	}

}
