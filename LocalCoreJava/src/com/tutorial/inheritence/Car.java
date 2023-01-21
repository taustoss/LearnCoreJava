package com.tutorial.inheritence;

public class Car extends Vehicle{

	Wheel wheel = new Wheel();
	
	public Car() {
		wheel.setPsi(35);
		wheel.setType("alloye");
	}

	@Override
	public String toString() {
		return "Car [wheel=" + wheel + ", getColor()=" + getColor() + ", getSpeed()=" + getSpeed() + ", getFuelType()="
				+ getFuelType() + "]";
	}
	
	
	
}
