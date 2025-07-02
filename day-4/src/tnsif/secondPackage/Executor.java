package tnsif.secondPackage;

import tnsif.firstpackage.Base;

//import tnsif.firstpackage.Base;

public class Executor {
	
	public static void main(String[] args) {
		
		//accessing
		
		Base b1=new Base();
		
		//pribate,protected,public and default
		
		b1.methodPublic();
		b1.varPublic=3456;
		b1.methodPublic();
				
	}

}
