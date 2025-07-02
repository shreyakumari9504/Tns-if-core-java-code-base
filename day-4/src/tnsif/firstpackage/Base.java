package tnsif.firstpackage;

public class Base {
	
	// declare default ,private,protected,publec variable
	
	int varDefault = 10;
	public int varPublic=20;
	private int varPrivate=10;
	protected int varProtected=40;
	
	//declaring default,protected,public,protected methods
	
	void methodDefault()
	{
		System.out.println("default access base class");
		System.out.println("default variable: "+ varDefault);
	}
	
	public void methodPublic()
	{
		System.out.println("Public access base class");
		System.out.println("public variable: "+ varPublic);
		
	}
	private void methodPrivate()
	{
		System.out.println("Private access base class");
		System.out.println("Private variable: "+ varPrivate);
	}
	protected void methodprotected()
	{
		System.out.println("protected access base class");
		System.out.println("protected variable: "+ varProtected);
	}

}
