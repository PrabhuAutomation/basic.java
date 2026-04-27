package module1;
abstract class ParentClassProgram // abstract class
{
	abstract void add(); // abstract method
}

		public class ChildClassProgram extends ParentClassProgram // concrete class
		{
			
			void add()
			{
				System.out.println("Addition of 2 numbers");
			}
			
			static void mul()
			{
				System.out.println("Multiplication of 2 numbers");
			}
			
			void sub()
			{
				System.out.println("Subtraction of 2 numbers");
			}
			
			
			public static void main(String[] args)// concrete method
			{
				mul();
				ChildClassProgram c1 = new ChildClassProgram();
				c1.add();
				c1.sub();
	}

}
