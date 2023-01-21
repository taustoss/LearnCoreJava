package com.tutorial;

public class Sparrow implements Bird{

	@Override
	public int flyHeight() {
		System.out.println("this is Sparrow height method");
		return 50;
	}

	@Override
	public int flySpeed() {
		System.out.println("this is eagparrowle height method");
		return 20;
	}

}
