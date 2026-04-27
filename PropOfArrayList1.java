package module1;

import java.util.ArrayList;

public class PropOfArrayList1 {

	public static void main(String[] args)
	{

		ArrayList <Integer> a1= new ArrayList <Integer>();
		a1.add(67);
		a1.add(97);
		a1.add(77);
		a1.add(07);
		a1.add(45);
		a1.add(2, 78);
		System.out.println(a1);
		
		ArrayList <Integer> a2= new ArrayList <Integer>();
		a2.add(878);
		a2.add(78);
		//a2.addAll(a1);
		a2.addAll(1, a1);
		System.out.println(a2);

	}

}
