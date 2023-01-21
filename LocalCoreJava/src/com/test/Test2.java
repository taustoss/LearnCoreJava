package com.test;

public class Test2 {
	
	public void hello() {
		
		Test1 t1 = new Test1();
		Test1 t11 = new Test1();
		Test1 t12 = new Test1();
		
		Test1 t13 = t1;
		
		
		t1.setName("T1");
		t11.setName("T11");
		t12.setName("T12");
		
		System.out.println(t1.getName());
		System.out.println(t11.getName());
		System.out.println(t12.getName());
		System.out.println("t13 -> " +t13.getName());
		
		System.out.println("===================================");
		
		t1.setName("T1 again");

		System.out.println(t1.getName());
		System.out.println(t11.getName());
		System.out.println(t12.getName());
		System.out.println("t13 -> " +t13.getName());
		
	}

	
	public static void main(String[] args){
	
	
		new Test2().hello();
	
	}
}
