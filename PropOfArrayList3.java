package module1;

import java.util.ArrayList;

public class PropOfArrayList3 {

	public static void main(String[] args) 
	{

		ArrayList <String> a1 = new ArrayList <String>();
		a1.add("Sham");
		a1.add("Ram");
		a1.add("Shama");
		a1.add("Sudha");
		a1.add("Shamitha");
		a1.add("Varsha");
		a1.add("Vishnu");
		
		System.out.println(a1);
		
		a1.remove(1);
		
		a1.remove("Shama");
		System.out.println("The update value is " + a1);
		
		
		ArrayList <String> a2 = new ArrayList <String>();
		a2.add("Lord");
		a2.add("Muruga");
		a2.addAll(a1);
		System.out.println(a2);
		
		a2.removeAll(a1);
		System.out.println("The update value of a2 is "+a1);
	}

}
