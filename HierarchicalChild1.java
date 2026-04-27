package module1;

public class HierarchicalChild1 extends HierachicalLevel1
{

	public static void main(String[] args)
	{

		method1();
		method3();
		HierarchicalChild1 c1= new HierarchicalChild1();
		c1.method2();

	}
	
	static void method3()
	{
		System.out.println("method3");
	}

}
