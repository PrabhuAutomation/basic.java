package module1;
import java.util.Scanner;

public class ScannerProgram2 {

	public static void main(String[] args)  // area of a circle =pi*r*r
	{
		Scanner s2=new Scanner(System.in);
		
		System.out.println("Enter the value of pi");
		
		int pi= s2.nextInt();
		
			System.out.println("Enter the value of r");
			
			int r=s2.nextInt();
			
			System.out.println("Enter the value of r");
			
			int m=s2.nextInt();
			
			System.out.println("The area of the Circel is :");
			
			int z=pi*r*m;
					System.out.println(z);
			
			s2.close();


	}

}
