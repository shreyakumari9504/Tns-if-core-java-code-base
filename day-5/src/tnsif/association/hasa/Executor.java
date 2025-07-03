package tnsif.association.hasa;

public class Executor {
	
	public static void main(String[] args) {
		
		Address address=new Address("405 Laxmi nagar", "Pune", "Maharashtra", "4110001");
		
		
		Person p=new Person("Shreya", address);
		p.displayInfo();
		System.out.println(p);
	}

}
