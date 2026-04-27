package module1;

public class HumanClassWithInterface  implements HumanInterface
{
	
	

	public static void main(String[] args) 
	{
		HumanClassWithInterface c1 =new HumanClassWithInterface();
		c1.method1();
		c1.method2();


	}

	@Override
	public void method1()
	{

		System.out.println("Print 2 numbers");
		
	}

	@Override
	public void method2() 
	{
		System.out.println("Add 2 Numbers");

		
	}

}
