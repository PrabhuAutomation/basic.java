package module1;

class InheritanceParent
{
	static void mainmethod1()
	{
		System.out.println("Main Method1");
	}
	
	void mainmethod2()
	{
		System.out.println("Main Method2");
	}
}

public class InheritanceExample extends InheritanceParent
{

	public static void main(String[] args)
	{
		mainmethod1();
		mainmethod3();
		
		InheritanceExample c1 = new InheritanceExample();
		c1.mainmethod2();
		c1.mainmethod4();
		
	}
	
	static void mainmethod3()
	{
		System.out.println("Main Method3");
	}
	
	void mainmethod4()
	{
		System.out.println("Main Method4");
	}
}
