package module1;

class Automation1
{
	Automation1()
	{
		System.out.println("Constructor 1");
	}
}

class Automation2 extends Automation1
{
	Automation2()
	{
		System.out.println("Constructor 2");
	}
}

public class InhertingConstructor extends Automation2
{

	public static void main(String[] args) 
	{

		new InhertingConstructor();
		

	}
	InhertingConstructor()
	{
		System.out.println("Constructor 3");
	}
}
