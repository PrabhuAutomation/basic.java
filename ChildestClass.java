package module1;
abstract class GrandParent // abstract grand parent class
{
	abstract void method1(); //abstract grand parent method
	abstract void method2();
}

abstract class ParentClassOne extends GrandParent // abstract parent class
{
	abstract void method3();
	abstract void method4();  // we need to overide all the 4 method in parent and grand parent
}



public class ChildestClass extends ParentClassOne
{

	public static void main(String[] args) 
	{
             
		ChildestClass d1= new ChildestClass();
		d1.method1();
		d1.method2();
		d1.method3();
		d1.method4();

	}

	@Override
	void method3() 
	{

    System.out.println("Print the method 3");
		
	}

	@Override
	void method4() 
	{

		System.out.println("Print the method 4");
		
	}

	@Override
	void method1() 
	{

		System.out.println("Print the method 1");
		
	}

	@Override
	void method2()
	{

		System.out.println("Print the method 2");
		
	}

}
