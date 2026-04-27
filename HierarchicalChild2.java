package module1;

public class HierarchicalChild2 extends HierachicalLevel1
{

	public static void main(String[] args) 
	{
		method1();
		HierarchicalChild2 n = new HierarchicalChild2();
		n.method5();
		n.method2();


	}
	
	void method5()
	{
		System.out.println("Method 5");
	}

}
