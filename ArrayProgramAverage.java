package module1;

public class ArrayProgramAverage {

	public static void main(String[] args)
	{

		double [] input= new double [6];
		input [0]=92;
		input [1]=12;
		input [2]=12;
		input [3]=12;
		input [4]=12;
		input [5]=12;
		
		double sum=0;
		
		for (int i=0;i<input.length;i++)
		{
			sum=sum+input[i]; // sum=12, sum=24
			
		}
		
		double average=sum/input.length;
		System.out.println("The average value of the array is: " + average);

	}

}
