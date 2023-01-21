package com.tutorial;

public class Parent {
	
	public static String guardian = "G1";
	
	public String name = "parent";
	
	
	
	public static String getGuardian() {
		return guardian;
	}



	public static void setGuardian(String guardian) {
		Parent.guardian = guardian;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String greetMe(String name) {
		String greeting = "welcome ";
		
		return greeting+name;
	}

	
	
	public static void main(String[] args) {
		
		Parent p1 = new Parent();
		Parent p2 = new Parent();
		Parent p3 = new Parent();
		
		
		p1.setName("p1");
		
		p2.setName("p2");
		p3.setName("p3");
		
		
		p1.setGuardian("p1g");
		System.out.println("init p1 "+p1);
		p2.setGuardian("p2g");
		p3.setGuardian("p3g");
		
		System.out.println("p1 "+p1);
		System.out.println("p2 "+p2);
		System.out.println("p3 "+p3);
		
		System.out.println(Parent.guardian);
		
		System.out.println(args.length);
		int ctr = 1;
		for (String string : args) {
			System.out.println("arg: ["+ctr+"] = "+string);
			ctr++;
		}
		
	}



	@Override
	public String toString() {
		return "Parent [name=" + name + ", guardian="+guardian+"]";
	}

	
}
