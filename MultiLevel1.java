package module1;

public class MultiLevel1 extends MultiLevel2
{
	static void method1()
	{
		System.out.println("Main method 1");
	}
	
	static void method2()
	{
		System.out.println("Main method 2");
	}
	
	void method3()
	{
		System.out.println("Main Method 3");
	}
	
	public static void main(String[] args) 
	{
		method6();
		method4();
		method1();
		method2();
		
		MultiLevel1 c1 =new MultiLevel1();
		c1.method3();
		c1.method5();
		c1.method7();
		
	}
}
