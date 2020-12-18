package com.infir.gop;

public class FourthPattern {

	public static void main(String[] args) {
		int i,j;
		
		for(i=0;i<8;i++){
			for(j=0;j<8;j++){
				if(i==j){
					System.out.print(i);
				}
				else{
					System.out.print(0);
				}		
			}
			System.out.println();
		}

	}

}
