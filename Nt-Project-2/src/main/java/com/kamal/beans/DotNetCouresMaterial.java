package com.kamal.beans;

import org.springframework.stereotype.Component;

@Component("dot")
public class DotNetCouresMaterial implements IcourseMeterial {

	@Override
	public String courseContent() {
		// TODO Auto-generated method stub
		System.out.println("This are the Course Material for DotNate developer");
		return "c#,.net,.netMVC";
	}

	@Override
	public double price() {
		// TODO Auto-generated method stub
		System.out.println("The price of this course is ");
		return 5000;
	}

	public DotNetCouresMaterial() {
		System.out.println("DotNateCouresMaterial class 0 param constructor is colled");
	}
}
