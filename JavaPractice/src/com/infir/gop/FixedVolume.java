package com.infir.gop;
//Sir in this program there is an assumption that values of radius and height will lie between 1 to 1000;

public class FixedVolume {
	static int pi=(22/7);
	
	void getValues(int n,int V){
		
		for(int r=1;r<1000;r++)
			for(int h=1;h<1000;h++){
				if(((r*r)*h)==(V/pi))
					storeValues(r,h,n,V);	
			}
	}
	
	void storeValues(int r,int h,int n,int V){
		//array to store radius and height;
				int a[]=new int[n];
		a[n-3]=r;
		a[n-2]=2;
		a[n-1]=h;
		printInput(n,a,V);
	}
	
	//method to print input values;
	void printInput(int n,int a[],int V){
		System.out.println("Input ");
		
		System.out.println(n+" ");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		
		System.out.println();
		System.out.println(V+" ");
		System.out.println();
		printOutput(a);
	}
	
	//method to print output values;
	void printOutput(int a[]){
		System.out.println("Output ");
		
		System.out.print(a[0]+" ");
		System.out.print(a[2]+"");
}
	public static void main(String[] args) {
		
		FixedVolume fix=new FixedVolume();
		//Variable n represents array size and V for fixed Volume;
		int n=3;
		int V=22;
		//main method to calculate Radius and Height;
		fix.getValues(n,V);
	}
}
