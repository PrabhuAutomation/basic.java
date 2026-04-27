package module1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayHumanInputFor {

	public static void main(String[] args)
	{
		Scanner s1= new Scanner(System.in);
		System.out.print("Please enter the size of the array :");
		int [] rollno = new int [s1.nextInt()];
		
		for (int i=0; i<=rollno.length-1;i++)
		{
			   rollno[i]=s1.nextInt();
		}
		System.out.println(Arrays.toString(rollno));
	}

}
