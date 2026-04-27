package module1;
 class ClassOneTwo 
{
	void login()
	{
		System.out.println("Login with mobile no");
	
	}
	
}

public class ProgramOnSupKey extends ClassOneTwo
{

	void login()
	{
		System.out.println("Login with Email ID ");
		super.login(); // it is super keyword used only for static method when method override concept is applied
	}

	public static void main(String[] args) 
	{

		ProgramOnSupKey c1= new ProgramOnSupKey();
		c1.login();
		

	}

}
