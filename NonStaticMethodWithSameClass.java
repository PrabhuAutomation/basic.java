package module1;

public class NonStaticMethodWithSameClass 
{
	
	static void add()
	{
		System.out.println("addition");
	}
	
	void sub()
	{
		System.out.println("subtraction");
	}
	
	void mul()
	{
		System.out.println("multiplication");
	}

	public static void main(String[] args) 
	{

		add();
		NonStaticMethodWithSameClass a= new NonStaticMethodWithSameClass();
		a.sub();
		a.mul();

	}

}
