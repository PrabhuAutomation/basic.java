package module1;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayHumanInput {

	public static void main(String[] args) 
	{

		Scanner s1= new Scanner(System.in);
		System.out.print("Please enter the size of the array :");
		int [] rollno = new int [s1.nextInt()];
		
		rollno[0]=s1.nextInt();
		rollno[1]=s1.nextInt();
		rollno[2]=s1.nextInt();
		rollno[3]=s1.nextInt();
		
		System.out.println(Arrays.toString(rollno));
			
		

	}

}
