package module1;

public class Palindrome {

	public static void main(String[] args) 
	{

		String input="prabhu";
		String output="";
		
		for ( int i=input.length()-1;i>=0;i--)
		{
			char c1 =input.charAt(i);
			output= output+c1;
		}
		System.out.println(output);
		
		if (input.equals(output))
		{
			System.out.println("The value is a palindrome");
		}
		else
			{
				System.out.println("The value is not a palindrome");
			}
	}

}
