package module1;

import java.util.Enumeration;
import java.util.Vector;

public class VectorPropertyLegacyClass {

	public static void main(String[] args) 
	{

		Vector<Double> v1= new Vector();
		// most of the method present has element in it 
		v1.addElement(23.89);
		v1.addElement(93.89);
		v1.addElement(3.89);
		v1.addElement(236.89);
		v1.addElement(423.89);
		v1.addElement(263.89);
		System.out.println(v1);
		
		Enumeration v2= v1.elements();
		//hasmoreelement-boolean,nextelement-object
		System.out.println("Iteration using Enumeration");
		while(v2.hasMoreElements())
		{
			System.out.println(v2.nextElement());
		}
		
		

	}

}
