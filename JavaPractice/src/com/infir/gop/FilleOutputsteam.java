package com.infir.gop;

import java.io.FileOutputStream;

public class FilleOutputsteam {

	public static void main(String[] args) {
		
		try{
			FileOutputStream fout=new FileOutputStream("Abc.txt");
			String s="Gopal Mishra";
			byte b[]=s.getBytes();
			fout.write(b);
			fout.close();
			
			System.out.println("Success");
		}
		
		catch(Exception e){
			System.out.println(" "+e);
		}

	}

}
