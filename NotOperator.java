package module1;

public class NotOperator {

	public static void main(String[] args) 
	{

		int a=10;
		int b=20;
		
		if (!(a==b || b!=20))
		{
			System.out.println("OR Operator");
		}
		else
		{
			System.out.println("Not Or Operator");
		}

	}

}
