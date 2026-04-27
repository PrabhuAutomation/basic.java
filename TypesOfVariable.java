package module1;

public class TypesOfVariable
{
	static int a=10;// global variable 
	int h=30;// global variable - instance variable ( non static global variable )
	
	static void add()
	{
		int b=25;// local variable 
		System.out.println(a); // can be used since it is global
		//System.out.println(c); // cannot be used since its local
		
	}
	

	public static void main(String[] args) 
	{

		int c=35; // local variable 
		add();
		System.out.println(a); // can be used since it is global
		System.out.println(c);
		//System.out.println(b); // cannot be used since its local
		
	
		
	}
}
