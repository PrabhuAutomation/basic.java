package module1;

public class StringFunction6 {

	public static void main(String[] args)
	{

		String a ="Auto";
		// check if the strings start with a 
		boolean b1=a.matches(a);
		System.out.println(b1);
		System.out.println(a.matches("a(.*)")); // (.*) indicates multi character
		// check if the strings ends with o
		boolean b2=a.matches("(.*)o");
		System.out.println(b2);
		boolean b3=a.matches("(.*)t(.*)");
		System.out.println(b3);
				

	}

}
