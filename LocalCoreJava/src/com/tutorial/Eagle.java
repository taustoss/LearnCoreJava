package com.tutorial;

public class Eagle implements Bird{

	@Override
	public int flyHeight() {
		System.out.println("this is eagle height method");
		return 100;
	}

	@Override
	public int flySpeed() {
		System.out.println("this is eagle speed method");
		return 60;
	}
	
	

}
