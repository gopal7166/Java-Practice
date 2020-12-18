package com.infir.gop;

import java.util.Scanner;

public class FifthPattern {
	
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("How many rows you want to enter");
		int rows=sc.nextInt();
		System.out.println();
		
		System.out.println("Your pattern is:");
		System.out.println();
		
		for(int i=0;i<rows;i++){
			for(int j=0;j<rows;j++){
				
				if(i%2==0){
					if(j%2==0)
					System.out.print(1);
					else
					System.out.print(0);
				}
				if(i%2!=0){
					if(j%2==0)
						System.out.print(0);
						else
						System.out.print(1);
				}
			}
			System.out.println();
		}
	}

}
