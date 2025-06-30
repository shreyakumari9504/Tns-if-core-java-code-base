package tnsif.day2;

public class PrimitiveDatatype {
	
	public static void main(String[] args) {
		
		//bytetakes 1 byte
		//1 byte= 8 bits  //2^6
		//256/2
		//128
		
		byte byteMax=127;
		byte byteMin=-128;
		
		System.out.println("Min range of byte is : "+ byteMin +  " Max range of byte is: "+ byteMax);
		
		//short----2byte
		short shortMax=32767;
		short shortMin=-32768;
		
		System.out.println("Min range of short is : "+ shortMin +  " Max range of short is: "+ shortMax);
		
		//int----4byte
		int maxInt=2147483647;
		int minInt=-2147483648;
		
		System.out.println("Min range of int is : "+ minInt +  " Max range of int is: "+ maxInt);
		
		//long--8byte
		long maxLong=922337203684775807L;
		long minLong=922337203684775808L;
		
		System.out.println("Min range of Long is : "+ minLong +  " Max range of Long is: "+ maxLong);
		
		float f=32340141243278345f;
		double d=3456.14124512345678902345678914f;
		
		boolean flag=true;
		boolean flag2=false;
		
	}

}
