package com.tutorial;

public class BirdFactory {

	public Bird getBird(int speed) {
		if(speed > 50) {
			return new Eagle();
		}else if(speed <=50) {
			return new Sparrow();
		}
		
		return null;
	}
}
