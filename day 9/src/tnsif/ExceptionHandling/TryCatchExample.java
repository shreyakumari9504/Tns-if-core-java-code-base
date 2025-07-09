package tnsif.ExceptionHandling;

public class TryCatchExample {
	static void PerformDivision(int x, int y)
	{
		System.out.println("I am in method ");
		int z;
		try
		{
			System.out.println("I am in try block ");
			
		 z=x/y;
		 System.out.println("Result of z :"+z);
		}
		catch (ArithmeticException e)
		{
			System.err.println("I am in catch block :"+e.getMessage());
		}
		
	}

}
