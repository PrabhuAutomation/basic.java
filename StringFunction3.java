package module1;

public class StringFunction3 {

	public static void main(String[] args) 
	{

		String a="Automation Testing";
		String b="automation Testing";
		a.equals(a);
		System.out.println(a.equals(a));
		System.out.println(a.equals(b));
		
		 boolean b1 =a.equals("automation Testing");
		 System.out.println(b1);
		 boolean b2=a.equalsIgnoreCase("automation Testing");
		 System.out.println(b2);

	}

}
