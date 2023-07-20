package com.kamal.beans;

import org.springframework.stereotype.Component;

@Component("ui")
public class UICouresMaterial implements IcourseMeterial {

	@Override
	public String courseContent() {
		// TODO Auto-generated method stub
		System.out.println("This are the Course Material for UI developer");
		return "Html,css,javascript,json,xml,node,angular";
	}

	@Override
	public double price() {
		// TODO Auto-generated method stub
		System.out.println("The price of this course is ");
		return 7000;
	}

	public UICouresMaterial() {
		System.out.println("UICouresMaterial class 0 param constructor is colled");
	}
}
