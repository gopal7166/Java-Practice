package com.infir.gop;

abstract class AbstractClass {

	public abstract void area()	;
	public abstract void perimeter();;

}

class ABC extends AbstractClass{
	
	ABC(int r){
		this.r=r;
	}
	static int PI=22/7;
	int r;
	public void area(){
		int a=PI*r*r;
		System.out.println("Area is: "+a);
	}
	
	public void perimeter(){
		int p=2*PI*r;
		System.out.println("Perimeter is: "+p);
	}
	
}

class Main{
	public static void main(String[] args){
		AbstractClass abs=new ABC(5);
		
		System.out.println("For a Circle:");
		abs.area();
		abs.perimeter();
	}
}