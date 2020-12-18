package com.infir.gop;

public class FirstPattern {

	public static void main(String[] args) {
		
    int i,j;
    //reverse right angle triangle examples
    /*for(i=0;i<5;i++){
    	for(j=0;j<5;j++){
    		if(j>=i)
    		System.out.print(" *");
    	}
    	System.out.println();
    }*/
    
   /* for(i=0;i<5;i++){
    	for(j=4;j>=0;j--){
    		if(j>=i){
    			System.out.print(" *");
    		}
    	}
    	System.out.println();
    }*/
    
    for(i=4;i>=0;i--){
		for(j=0;j<5;j++){
			if(i>=j)
			System.out.print(" *");
		}
		System.out.println();
	}

	}

}
