package module1;

public class M2NonStaticDifClass 
{
	void sub()
	{
		System.out.println("Subtraction");  // non static method same class
	}
	
	static void mul()
	{
		System.out.println("Multiplication"); // static method same class
	}

	public static void main(String[] args) 
	{
		M1NonStaticDifClass m =new M1NonStaticDifClass();  // variable for non static method different class
		m.add();
		
		M2NonStaticDifClass c= new M2NonStaticDifClass();  // variable for non static method same class
		c.sub();
		
		mul();
		m.div();


	}

}
