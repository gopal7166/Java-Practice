package com.array.go;

import java.util.Scanner;

public class RotateArray {
	
	void rotateElement(int arr1[],int d){
		int arr2[]=new int[d];
		int n=arr1.length;
		
		for(int i=0;i<d;i++)
			arr2[i]=arr1[i];
		
		for(int i=0;i<d;i++)
			arr1[i]=arr1[n-(i+1)];
		
		for(int i=n-d;i<n;i++)
			
			arr1[i]=arr2[i-(n-d)];
		
		System.out.print("Array's elements after rotation:");
		for(int i=0;i<n;i++)
			System.out.print(" "+arr1[i]);
	}

	public static void main(String[] args) {
		
		RotateArray ra=new RotateArray();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value of d:");
		int d=sc.nextInt();;
		int arr1[]=new int[]{1,2,3,4,5,6};
		
		ra.rotateElement(arr1,d);
	
	}
}
