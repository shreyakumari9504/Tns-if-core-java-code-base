package tnsif.staticmethod;

public class MyCLassDEmo {
	
	public static void main(String[] args) {
		MyClass.display();
		
		System.out.println();

	    MyClass ol=new MyClass();
	    
	    System.out.println(ol);
	    
	    MyClass.display();
	    
	    System.out.println();

	    MyClass o2=new MyClass();
	    
	    System.out.println(o2);
	    
	    System.out.println();

	    MyClass o3=new MyClass();
	    
	    System.out.println(o3);
	}

}
