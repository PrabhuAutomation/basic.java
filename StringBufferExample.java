package module1;

public class StringBufferExample {

	public static void main(String[] args) 
	{

		StringBuffer s1 =new StringBuffer ("ram school");
		//s1.append("going");
		//System.out.println(s1);

		//-----insert operation ----//
		
		s1.insert(3, " going");
		System.out.println(s1);
		
		
		StringBuffer s2= new StringBuffer ("Testing the name");
		s2.replace(8, 12, "real ");
		System.out.println(s2);
		
		s2.delete(7, 12);
		System.out.println(s2);
		
		
		StringBuffer s3= new StringBuffer("School");
		s3.reverse();
		System.out.println(s3);
		
		StringBuffer s4= new StringBuffer("School");
	System.out.println(s4.substring(2));
	System.out.println(s4.substring(0, 3));
	}

}