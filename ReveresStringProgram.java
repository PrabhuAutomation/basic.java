package module1;

public class ReveresStringProgram {

	public static void main(String[] args)
	{

		String input="automation";  // modify anything we did with auto example
		String output="";
		
		//for ( int i=3;i>=0;i--) // one way of using both better use length
			for (int i=input.length()-1;i>=0;i--)
		{
			     char c1=    input.charAt(i);
			     output=output+c1;
			     
			     /* i=3, c1=o , output =o
			      * i=2, c1=t , output =o+t =ot
			      * i=1, c1=u , output =ot+u otu
			      * i=0, c1=a , output =otu+a otua
			      */
		}
		System.out.println( output);

	}

}
