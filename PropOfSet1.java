package module1;

import java.util.HashSet;
import java.util.Set;

public class PropOfSet1 
{

	public static void main(String[] args) 
	{

		Set a1 = new HashSet();
		
		a1.add(96);
		a1.add('T');
		a1.add("Name");
		a1.add(78.98);
		a1.add(989);
		a1.add("True");
		a1.add(96);
		
		System.out.println(a1); // HashSet is not following the indexing
		
		
		Set<String> b1 = new HashSet<String>();
		b1.add(null);
		b1.add("Prabhu");
		b1.add("Prabhu");
		b1.add("Jyothi");
		b1.add("Akshatha");
		b1.add("Shalini");
		b1.add("Spoorthi");
		b1.add("Anjali");
		b1.add(null);
		
		System.out.println(b1);
		
	}

}
