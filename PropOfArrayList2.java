package module1;

import java.util.ArrayList;

public class PropOfArrayList2 {

	public static void main(String[] args)
	{

		ArrayList <Integer> a1 = new ArrayList <Integer> ();
		a1.add(4);
		a1.add(44);
		a1.add(34);
		a1.add(49);
		a1.add(47);
		a1.add(2, 876);

			System.out.println(a1);
			
			Boolean b1 =a1.isEmpty();
			
			System.out.println(b1);
			
			Boolean b2 =a1.contains(876);
			System.out.println(b2);
			
			
		int count=a1.size();
		System.out.println(count);
		
		a1.clear();
		System.out.println(a1);
		
	}

}
