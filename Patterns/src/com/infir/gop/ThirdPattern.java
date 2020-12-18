package com.infir.gop;

public class ThirdPattern {

	public static void main(String[] args) {
		int i,j;
		//pattern for right angle triangle
		System.out.println("Right angle Triangle Pattern while spacing is filled by 1s");
		System.out.println();
		for(i=1;i<7;i++){
			for(j=6;j>=1;j--){
				if(j>i)
					System.out.print("1");
				else
					if(j>=0)
				System.out.print(""+i);
			}
			System.out.println();
		}
	}

}
