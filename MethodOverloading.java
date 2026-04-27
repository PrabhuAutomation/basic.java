package module1;

public class MethodOverloading 
{
	static void login(int a)
	{
		System.out.println("Method oVerloading 1");
	}
	static void login(int a , char b)
	{
		System.out.println("Method oVerloading 2");
	}
	 void login(int a , double c, char b)
	{
		 System.out.println("Method oVerloading 3");
	}
	 void login(char b , int a )
	{
		 System.out.println("Method oVerloading 4");
	}
	
	public static void main(String[] args)
	{
		login(10);
		MethodOverloading a=new MethodOverloading();
		a.login(1,12.00, 'a');
		a.login( 'a',5);
		login(10,'M');


	}

}
