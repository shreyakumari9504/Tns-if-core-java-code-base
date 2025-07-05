package tnsif.staticmethod;

public class MyClass {
	
	private int section;
	
	private static int srNo;
	
	//Static Block
	static
	{
		System.out.println("-------within static block-------");
		srNo=1000;
	}
	public MyClass() {
		System.out.println("-------within constructor class-------");
		srNo++;
		section++;
	}
	@Override
	public String toString() {
		return "MyClass [serial no "+srNo+ ",section=" + section + "]";
	}
	
	static void display()
	{
		System.out.println("Serial no :"+srNo);
	}
	
	
	
	

}
