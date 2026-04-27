package module1;

public class ChainingThisConstructor 
{
	ChainingThisConstructor (int a)
	{
		
		System.out.println("Chain 1");
	}
	ChainingThisConstructor (double a)
	{
		this (100);
		System.out.println("Chain 2");
	}
	ChainingThisConstructor ()
	{
		this (100.98);     // chaining is happening ( there should be no brekage in chain ) 
		System.out.println("Chain 3");
	}
	public static void main(String[] args) 
	{

		new ChainingThisConstructor();

	}

}
