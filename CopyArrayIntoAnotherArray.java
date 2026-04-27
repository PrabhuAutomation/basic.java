package module1;

import java.util.Arrays;
import java.util.Scanner;

public class CopyArrayIntoAnotherArray {

	public static void main(String[] args)
	{

		Scanner s1=new Scanner (System.in);
		System.out.println("Please enter the size of the array:");
		int [] rollno1 = new int [s1.nextInt()];
		int [] copiedno1 =new int [rollno1.length];
		
		for (int j=0;j<=rollno1.length-1;j++)
		{
			System.out.println(" please end the value at index-> "+j);
			
			rollno1[j]=s1.nextInt();
			copiedno1[j]= rollno1[j];
			
		}
		
				System.out.println("Input array is:");
				System.out.println(Arrays.toString(rollno1));
				System.out.println("Copied array is:");
				System.out.println(Arrays.toString(copiedno1));
		
			
		}
		
		
	}

	


