package tnsif.overriding;

public class OverRidingDemo {
	public static void main(String[] args) {
		RBI rbi;
		
		//dynamic binding assigning child object to parent
		rbi=new SBI();
		System.out.println(rbi.getRateofInterest());
		
		rbi=new ICICI();
		System.out.println(rbi.getRateofInterest());
		
		rbi=new HDFC();
		System.out.println(rbi.getRateofInterest());
		
	}

}
