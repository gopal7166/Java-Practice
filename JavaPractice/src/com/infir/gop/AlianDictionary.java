package com.infir.gop;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

 class AlianDictionary {
	private int V;
	private LinkedList<Integer> adj[];
	
	AlianDictionary(int v){
		V=v;
		adj = new LinkedList[v];
		for (int i=0; i<V; ++i)
		adj[i] = new LinkedList();	
	}
	
  void addEdge(int i, int j) {
		adj[i].add(j);
		}
 
  void topologicalSort(){
     Stack stack = new Stack();
  
      boolean visited[] = new boolean[V];
      for (int i = 0; i < V; i++)
         visited[i] = false;
  
      for (int i = 0; i < V; i++)
        if (visited[i] == false)
           topologicalSortUtil(i, visited, stack);
  
    	 while (stack.empty()==false){
    		 int i=(int) (stack.pop());
    		 char c=(char) (i+97);
        	 System.out.print(c+"");	 
    	 }
    	 System.out.println();
     }
     
   void topologicalSortUtil(int v,boolean visited[],Stack stack){
		  
		  visited[v] = true;
		  Integer i;
		  
		  Iterator<Integer> it = adj[v].iterator();
		  while (it.hasNext())
		  {
		  i = it.next();
		  if (!visited[i])
		  topologicalSortUtil(i, visited, stack);
		  }
		  stack.push(new Integer(v));
}

	public static void main(String[] args) {
		int k=3;
		AlianDictionary ad=new AlianDictionary(k);
		
		String dic[]={"caa", "aaa", "aab"};
		int n;
		 ad.topologicalSort();
		for(int i=0;i<dic.length;i++){
			if(!dic[i].equals(dic[i+1])){
				String s1=dic[i];
				String s2=dic[i+1];
				for(int j=0;j<s1.length();j++)
					if(s1.charAt(j)!=s2.charAt(j))
						ad.addEdge((s1.charAt(j)-'a'),(s2.charAt(j)-'a'));
			}
		}
	}
}
