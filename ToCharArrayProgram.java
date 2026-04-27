package module1;

import java.util.Arrays;

public class ToCharArrayProgram {

	public static void main(String[] args) 
	{

		String a="auto";
		char [] c1=		a.toCharArray();
		
		 // [a,u,t,o]
		//   0 1 2 3
		
		/*
		System.out.println(c1[0]);
		System.out.println(c1[1]);
		System.out.println(c1[2]);
		System.out.println(c1[3]);
		
		or
		*/
		
		System.out.println(Arrays.toString(c1)); // arrays is a class to string is a static method
		
		
	}

}
