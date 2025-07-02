package tnsif.firstpackage;

public class Executor {
	
	public static void main(String[] args) {
		
		Base b1=new Base();
		b1.methodDefault();
		b1.methodprotected();
		b1.methodPublic();
		//b1.methodPrivate();
		
		
		b1.varDefault=11;
		b1.methodDefault();
		
		b1.varProtected=100;
		b1.methodprotected();
		
		b1.varPublic=50;
		b1.methodPublic();
	}

}
