package module1;

public class VariableProgram3 
{
	int rollno;
	double pocketmoney;
	String name;
	
	void studentdetails(int rollno,double pocketmoney,String name)
	{
		System.out.println("The roll number is "+ rollno);
		System.out.println("The roll number is "+ pocketmoney);
		System.out.println("The roll number is "+ name);
	}

	public static void main(String[] args) 
	{
		VariableProgram3 a = new VariableProgram3();
		a.studentdetails(25,78.90,"Prabhu");
		System.out.println(a.rollno);
		System.out.println(a.pocketmoney);
		System.out.println(a.name);

	}

}
