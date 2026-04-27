package module1;

public class StringFunction {

	public static void main(String[] args) 
	{
		String a="auto";
		System.out.println(a.toUpperCase()); // printing in upper case
		System.out.println(a);
		
		String b="PrabhuThanikachalam";
				System.out.println(b.toLowerCase());
				
				String c="Computer";
				String d="Class";
				
				System.out.println(c.concat(d));
				
				System.out.println(c.concat(" ").concat(d)); // how to give space 

					String e=" Testing the Trim functionality    .   ";
					System.out.println(e);
					System.out.println(e.trim());
	}

}
