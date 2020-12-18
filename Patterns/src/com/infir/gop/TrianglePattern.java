package com.infir.gop;

public class TrianglePattern {
	
	 // Function to demonstrate printing pattern
	void printTriangle(int m,int n){
		
		for(int i=0;i<m;i++){
			for(int j=n;j>=0;j--){
				if(j>i)
					System.out.print(" ");
				else
					if(j>=0)
						System.out.print(" *");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		TrianglePattern tp=new TrianglePattern();
		//Variables for rows and columns
		int m=5;
		int n=m-1;
		System.out.println("Triangle Pattern:");
		System.out.println();
		tp.printTriangle(m,n);
	}

}

