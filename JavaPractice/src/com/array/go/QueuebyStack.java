package com.array.go;

import java.util.Queue;
import java.util.Stack;

public class QueuebyStack {

	public static void main(String[] args) {
		QueuebyStack qs=new QueuebyStack();
		Stack<Integer> s1=new Stack<Integer>();
		
		s1.push(1);
		s1.push(2);
		s1.push(3);
		s1.push(4);
		s1.push(5);
		s1.pop();
		
		System.out.println("Stack's Elements are:");
		for(int i=0;i<s1.size();i++){
			System.out.println(s1.elementAt(i));
		}

	}

}
