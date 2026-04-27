package module1;

public class CheckIf53IsPartOfArray 
{

	public static void main(String[] args) 
	{
		int [] input=new int[6];
		input[0]=12;
		input[1]=7;
		input[2]=91;
		input[3]=53;
		input[4]=17;
		input[5]=25;
		
		int noToCheck=53;
		
		for(int k=0; k<=input.length-1;k++)
		{
			if(noToCheck==input[k])
			{
				System.out.println("yes it is present in the index position " +  k);
			}
			
		}


	}

}
