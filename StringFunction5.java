package module1;

public class StringFunction5 {

	public static void main(String[] args) 
	{

		String a =" K v no 2";
		// replace all capital letters
		System.out.println(a.replaceAll("[A-Z]", ""));
		
		// replace all small letters
		System.out.println(a.replaceAll("[a-z]", ""));
		
		// replace all numbers
		System.out.println(a.replaceAll("[0-9]", ""));
	}

}
