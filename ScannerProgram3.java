package module1;
import java.util.Scanner;

public class ScannerProgram3 
{

	public static void main(String[] args)
	{
        Scanner s3=new Scanner(System.in);
        
   System.out.println("Enter the value of r:");
        double r= s3.nextDouble();
        
        double area =Math.PI*r*r;
        System.out.println("The Area of the Square:"+area);
        s3.close();

	}

}
