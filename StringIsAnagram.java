package module1;

import java.util.Arrays;

public class StringIsAnagram {

	public static void main(String[] args)
	{
		String a="saw";
		String b="was";
		
		if(a.length()!=b.length())
		{
			System.out.println("Not a Anagram");
		}
		
		else
		{
			char [] c1= a.toCharArray();
			char [] c2=b.toCharArray();
			
			Arrays.sort(c1);// sort the c1 [ a, s ,w]
			Arrays.sort(c2);//sort the c2 [ a, s ,w]
			
			System.out.println(Arrays.toString(c1));
			System.out.println(Arrays.toString(c2));
			
			if (Arrays.equals(c1, c2))
			{
				System.out.println("The 2 arrays are equal");
			}
			
			else
			{
				System.out.println("The 2 arrays are not equal");
			}
		}
		
		
		

	}

}
