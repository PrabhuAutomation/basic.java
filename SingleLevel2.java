package module1;

public class SingleLevel2 extends SingleLevel1
{

	public static void main(String[] args) 
	{
		method4();
		method1();
		method2();
		SingleLevel2 c1 =new SingleLevel2();
		c1.method3();

	}
	
	static void method4()
	{
		System.out.println("Method4");
	}

}
