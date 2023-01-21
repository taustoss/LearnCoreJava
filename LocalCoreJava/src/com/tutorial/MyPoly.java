package com.tutorial;

import java.util.Date;

public class MyPoly {

	public static final String NAME = "this my app name";
	private  int age = 22;
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age > 0  &&  age <=120) {
			this.age = age;
		}
	}
	
	public Date getDate() {
		return new Date();
	}
	
	
	public int math(int a, int b) {
		return a+b;
	}
	
	public int math(int a, int b, int c) {
		return (a + b) * c;
	}
	
	public int math(String s1, String s2) {
		int i1 = Integer.parseInt(s1);
		int i2 = Integer.parseInt(s2);
		
		return i1 - i2;
	}
	
	public static void main(String[] args) {
		MyPoly mp = new MyPoly();
		System.out.println(mp.math(1,2));
		System.out.println(mp.math(1,2,30));
		System.out.println(mp.math("1","2"));
		
		mp.setAge(-50);
		System.out.println("age is "+mp.getAge());
	}
}
