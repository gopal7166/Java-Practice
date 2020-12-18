package com.infir.gop;

 class BooleanParanthsis {
	
	void countParenth(String symbols,String operators ,int n)
	{
		
	 int F[][]=new int[n][n];
	 int T[][]=new int[n][n];

	
	 // All diagonal entries in T[i][i] are 1 if symbol[i]
	 // is T (true).  Similarly, all F[i][i] entries are 1 if
	 // symbol[i] is F (False)
	 for (int i = 0; i < n; i++)
	 {
	     F[i][i] = (symbols.charAt(i) == 'F')? 1: 0;
	     T[i][i] = (symbols.charAt(i) == 'T')? 1: 0;
	 }

	 // Now fill rest of entries in matrix
	 for (int gap=1; gap<n; ++gap)
	 {
	     for (int i=0, j=gap; j<n; ++i, ++j)
	     {
	         T[i][j] = F[i][j] = 0;
	         for (int g=0; g<gap; g++)
	         {
	             // Find place of parenthesization using current value
	             // of gap
	             int k = i + g;

	             // Store Total[i][k] and Total[k+1][j]
	             int tik = T[i][k] + F[i][k];
	             int tkj = T[k+1][j] + F[k+1][j];

	             // Follow the recursive formulas according to the current
	             // operator
	             if (operators.charAt(k) == '&')
	             {
	                 T[i][j] += T[i][k]*T[k+1][j];
	                 F[i][j] += (tik*tkj - T[i][k]*T[k+1][j]);
	             }
	             if (operators.charAt(k) == '|')
	             {
	                 F[i][j] += F[i][k]*F[k+1][j];
	                 T[i][j] += (tik*tkj - F[i][k]*F[k+1][j]);
	             }
	             if (operators.charAt(k) == '^')
	             {
	                 T[i][j] += F[i][k]*T[k+1][j] + T[i][k]*F[k+1][j];
	                 F[i][j] += T[i][k]*T[k+1][j] + F[i][k]*F[k+1][j];
	             }
	         }
	     }
	 }
	 
	 if((T[0][n-1]>1)&&(T[0][n-1]<100))
	 System.out.println("Total No of ways: "+((T[0][n-1])%1003));
	}

	public static void main(String[] args) {
		
		BooleanParanthsis bo=new BooleanParanthsis();
		String symbols = "TTFT";
	    String operators = "|&^";
		int n=symbols.length();
		
		String symbols1 = "TFF";
	    String operators1 = "|^";
		int n1=symbols1.length();
		System.out.println("Output");
		
		bo.countParenth(symbols, operators, n);
		bo.countParenth(symbols1, operators1, n1);
	}
}



