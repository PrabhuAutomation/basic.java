package module1;

public class TypeOfvariable2 
{
	static int c=10;// global variable 
	int h=30;// global variable - instance variable ( non static global variable )
	
	public static void main(String[] args) 
	{
       int a=100;
       System.out.println(a);
       a=150;
       System.out.println(a);// update the local variable 
       System.out.println(c);
       c=98;                  // update the static global variable
       System.out.println(c);
      
       TypeOfvariable2 y= new TypeOfvariable2();
       System.out.println(y.h);
       y.h=350;                   //update the non static global variable -Instance Variable
       System.out.println(y.h);


	}

}
