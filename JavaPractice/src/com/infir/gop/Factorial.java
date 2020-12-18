package com.infir.gop;

public class Factorial {
	
	static int a=500;
	static int b=10;
	
	public static void show(){
	
		System.out.println("Show Method is called: "+b);
	}
	/*int roll;
	String name;
	String dept;
	String phone;

	public Factorial(int roll, String name, String dept) {
		this.roll=roll;
		this.name=name;
		this.dept=dept;
		
		System.out.println("First Constructor Detail:"+roll +name +dept);
	}

	public Factorial(int roll, String name, String dept, String phone) {
		this(roll, name, dept);
		this.phone=phone;
		System.out.println("Second Constructor Detail:"+phone);
	}*/

	public static void main(String[] args) {
		Factorial f=new Factorial();
		System.out.println(" "+a);
		Factorial.a=200;
		System.out.println(" "+a);
		Factorial.show();
		f.show();
		

/*Factorial f1=new Factorial(007,"Gopal Mishra","CSE");

Factorial f2=new Factorial(007,"Gopal Mishra","CSE","7838747437");*/

	}

}
	