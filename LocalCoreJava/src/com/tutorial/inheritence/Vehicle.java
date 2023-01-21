package com.tutorial.inheritence;

public class Vehicle {
	
	public String color;
	public int speed;
	public String fuelType;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	@Override
	public String toString() {
		return "Vehicle [color=" + color + ", speed=" + speed + ", fuelType=" + fuelType + "]";
	}
	

}
