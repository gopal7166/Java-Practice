package com.array.go;

import java.util.Arrays;

public class WaveForm {
	
	void printwave(int arr[],int n){
		
		Arrays.sort(arr);
		for(int i=0;i<n;i++)
			System.out.print(" "+arr[i]);
		
		for(int i=0;i<n;i=+2){
			swap(arr[i],arr[i+1]);
		}
	}
	
	void swap(int arr,int arr2){
		int temp=arr;
		arr=arr2;
		arr2=temp;
	}

	public static void main(String[] args) {
		WaveForm wf=new WaveForm();
		
		int arr[]={21,63,2,56,32,17};
		int n=arr.length;
		wf.printwave(arr,n);
		for (int i=0;i<n;i++)
			System.out.print(arr[i]+ " ");
	   }
	}


