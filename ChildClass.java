package module1;
class ParentClass
{
	void login()
	{
		System.out.println("Login with mobile no");
	}
}

public class ChildClass extends ParentClass
{
	void login()
	{
		System.out.println("Login with Email ID");
	}
	public static void main(String[] args) 
	{
		ChildClass c1 = new ChildClass();
		c1.login();                                  // instead of parent value child class is overlapped


	}

}
