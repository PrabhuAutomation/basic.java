package module1;
import java.util.Arrays;
import java.util.Scanner;

public class FindTwoArraysAreEqual {

	public static void main(String[] args)
	{

		Scanner s1=new Scanner (System.in);
		System.out.println("Please enter the size of the array:");
		int [] rollno1 = new int [s1.nextInt()];
		int [] rollno2 =new int [rollno1.length];
		
		for (int j=0;j<=rollno1.length-1;j++)
		{
			System.out.println(" please end the value at index-> "+j);
			System.out.println("please eneter for 1st array:");
			rollno1[j]=s1.nextInt();
			System.out.println("please eneter for 1st array:");
			rollno2[j]=s1.nextInt();
			
		}
		
		System.out.println(Arrays.toString(rollno1));
		System.out.println(Arrays.toString(rollno2));
		
		if (rollno1.equals(rollno2)) // arrays.equals(rollno1,rollno2)--- method done by class
		{
			System.out.println("The arrays are equal");
		}
		else
		{
			System.out.println("The arrays are not equal");
		}
	}

}
