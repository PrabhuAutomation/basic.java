package module1;

import java.util.Arrays;

public class SplitExample {

	public static void main(String[] args)
	{

		String a ="My name is Ram";
			String [] s1=	a.split(" ");
			System.out.println(Arrays.toString(s1));
			
		String newvalue=s1[3].concat(s1[2]).concat(s1[1]).concat(s1[0]);
		System.out.println(newvalue);
		
		String s2=s1[3].concat(" ").concat(s1[2]).concat(" ").concat(s1[1]).concat(" ").concat(s1[0]);
		System.out.println(s2);

	}

}
