package module1;

import java.util.Arrays;

public class OneArrayIntoAnotherReverse {

	public static void main(String[] args)
	{

		int [] a = new int[3];
		a[0]=12;
		a[1]=14;
		a[2]=15;
		
		int b[]=new int [a.length];
		for (int i=0,j=2;i<a.length;i++,j--) // j=a.length-1 will make any size of the arrays
		{
			b[j]=a[i];
			
		}
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}

}
