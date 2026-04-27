package module1;

import java.util.List;
import java.util.ArrayList;

public class ListProperty1 {

	public static void main(String[] args) 
	{
		List a1 =new ArrayList (); //this is upcasting
		a1.add(5);
		a1.add("Prabhu");
		a1.add(57.87);
		a1.add(5);
		System.out.println(a1);
	}

}
