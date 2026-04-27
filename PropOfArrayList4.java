package module1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class PropOfArrayList4 {

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
		
		
	Iterator <String> i2=	a1.iterator();
	//hasnext-Boolean,next-Object,Remove
	//Forward iteration
	//it is applicable to entire collection object
	
	System.out.println("Iteration of doing the array");
	
	while(i2.hasNext())
	{
		System.out.println(i2.next());
	}
	
	
	ListIterator<String>  i3= a1.listIterator();
	//hasnext-Boolean,next-object,Previous-object,hasprevious-Boolean,remove,get
	//forward iteration + backward iteration
	// it si applicable only for list and classes
	
	System.out.println("List Iteration of doing the array Forward");
	
	while(i3.hasNext())
	{
		System.out.println(i3.next());
	}
	
	
	System.out.println("List Iteration of doing the array Backwards");
	
	while(i3.hasPrevious())
	{
		System.out.println(i3.previous());
	}
	}

}
