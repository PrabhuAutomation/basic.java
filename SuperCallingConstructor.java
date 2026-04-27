package module1;
class Automation3
{
	Automation3(double a)
	{
		System.out.println("Constructor 123");
	}
}

class Automation4 extends Automation3
{
	Automation4()
	
	{
		super(100.00); // first line inside the constructor
		System.out.println("Constructor 21");   // if you need to call a parametrized then we need to explicitly call super
	}
}

public class SuperCallingConstructor extends Automation4
{

	public static void main(String[] args)
	{

		new SuperCallingConstructor();

	}
	SuperCallingConstructor()
	{
		System.out.println("Constructor 31");
	}

}
