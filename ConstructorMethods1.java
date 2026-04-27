package module1;

public class ConstructorMethods1 
{
	ConstructorMethods1()	
	{
		System.out.println("Calling constructor");
	}
	
	void add()	
	{
		System.out.println("Non static method calling");
	}

	public static void main(String[] args) 
	{
		
		ConstructorMethods1 p = new ConstructorMethods1(); // 1st way of creating object to cal constructor
		p.add();
		new ConstructorMethods1(); // 2nd way of calling constructor
		

	}

}
