package module1;

public class StringFunction2 {

	public static void main(String[] args)
	{

		String a="Technical Guy";
		a.substring(2);
		System.out.println(a.substring(2)); // it will start from index 2 (0,1,2)
		
		a.substring(2, 5);
		System.out.println(a.substring(2, 5));  // it will start from 2 will end at 5 ( 5th will not be displayed )
		
		String c="Potato";
		System.out.println(c.indexOf('o'));
		System.out.println(c.charAt(4));
		

	}

}
