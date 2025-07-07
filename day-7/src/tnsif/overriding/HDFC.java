package tnsif.overriding;

public class HDFC extends RBI {
	
	public float getRateofIntertest() {
		
		System.out.println("Base rate of interest of home loan");
		return 7.9f;
	}

}
