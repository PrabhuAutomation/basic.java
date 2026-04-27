package module1;

public class ConstructorSameDifferentParameters 
{
	ConstructorSameDifferentParameters(int a)
	{
		System.out.println("Constructor 1");
	}
	
	ConstructorSameDifferentParameters(char a) // constructor with same parameter is not posible ex int same variable possible
	{
		System.out.println("Constructor 2");
	}

	ConstructorSameDifferentParameters(String a)
	{
		System.out.println("Constructor 3");
	}
	public static void main(String[] args) 
	{
		new ConstructorSameDifferentParameters("PRABHU");
		new ConstructorSameDifferentParameters('U');
		new ConstructorSameDifferentParameters(9);
		


	}

}
