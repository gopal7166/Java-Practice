package com.infir.gop;

public class ReverseTriangle {

	public static void main(String[] args) {
		
		int i,j;
		//reverse Triangle pattern
		System.out.println("Reverse Triangle pattern");
		System.out.println();
		for(i=4;i>=0;i--){
			for(j=4;j>=0;j--){
				if(j>i)
					System.out.print(" ");
				else
					if(j>=0)
				System.out.print(" *");
			}
			System.out.println();
		}
		System.out.println();
		
		//Square in 2 plane
		System.out.println("Square in 2 plane Pattern");
		System.out.println();
		for(i=0;i<5;i++){
			for(j=4;j>=0;j--){
				if(j>i)
					System.out.print(" ");
				else
					if(j>=0)
				System.out.print(" *");
			}
			System.out.println();
		}

		for(i=3;i>=0;i--){
			for(j=4;j>=0;j--){
				if(j>i)
					System.out.print(" ");
				else
					if(j>=0)
				System.out.print(" *");
			}
			System.out.println();
		}

	}

}
