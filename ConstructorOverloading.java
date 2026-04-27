package module1;

public class ConstructorOverloading
{
	ConstructorOverloading(int a,int b,String c)
	{
		System.out.println("constructor 1");
	}
	ConstructorOverloading(int a,int b,char c)
	{
		System.out.println("constructor 2");
	}
	ConstructorOverloading(int a,char c)
	{
		System.out.println("constructor 3");
	}
	
	public static void main(String[] args)
	{
		new ConstructorOverloading(2,45,'s');
		new ConstructorOverloading(2,15,'s');
		new ConstructorOverloading(2,45,"Prabhu");

	}

}
