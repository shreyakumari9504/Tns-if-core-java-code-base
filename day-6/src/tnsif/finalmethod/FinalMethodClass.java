package tnsif.finalmethod;

public class FinalMethodClass {
	public FinalMethodClass() {
		System.out.println("this is a default constructor ");
	}
	
	final int a=50;
	 // final method 
	final void show()
	{
		System.out.println("value of a "+ a);
	}

}
