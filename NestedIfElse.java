package module1;

public class NestedIfElse {

	public static void main(String[] args)
	{
		int a=15;
		boolean validticket=true;
		char gender='M';	
		
		if (gender=='M')
		{
			if (a>18)
			{
				System.out.println("Full ticket");
			}
			
			else
			{
				System.out.println("child else block");
			}
		}
			else
			{
				System.out.println("Else block");
			}
		}
	}


