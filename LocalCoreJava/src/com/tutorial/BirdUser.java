package com.tutorial;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BirdUser {
	
	
	public ArrayList<String> getEmployees(){
		
		return new ArrayList<>();
	}
	
	public static void main(String[] args) {

		Sparrow sp = new Sparrow();
		
		
//		sp.flyHeight();
//		sp.flySpeed();
		
		BirdProvider bu = new BirdProvider();
		Bird providerBird = bu.getBird();
		providerBird.flyHeight();
		providerBird.flySpeed();
		
		
		List<String> list = new ArrayList();
		BirdUser u = new BirdUser();
		ArrayList emps = u.getEmployees();
		
		System.out.println("factory starts");
		BirdFactory fac = new BirdFactory();
		Bird highSpeed = fac.getBird(1000);
		System.out.println("this is high speed "+highSpeed.flySpeed());
		Bird slowSpeed = fac.getBird(10);
		System.out.println("this is high speed "+slowSpeed.flySpeed());
		
	}
}
