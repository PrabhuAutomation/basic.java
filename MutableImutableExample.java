package module1;

public class MutableImutableExample {

	public static void main(String[] args) 
	{

		String a ="Automation";
		String b = a.concat("Testing");
		System.out.println(a);
		System.out.println(b);
		
		StringBuffer s1 =new StringBuffer("Automation1");
		s1.append("Testing1");
		System.out.println(s1);
		
		

	}

}
