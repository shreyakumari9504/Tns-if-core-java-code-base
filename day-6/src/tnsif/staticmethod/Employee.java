package tnsif.staticmethod;

public class Employee {
	
	private String name;
	private int id;
	
	static String companyname="TNSIF";
	
	public Employee(String name,int id) {
		this.name=name;
		this.id=id;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ","+ "company= "+ companyname+ "]";
	}
	
	

}
