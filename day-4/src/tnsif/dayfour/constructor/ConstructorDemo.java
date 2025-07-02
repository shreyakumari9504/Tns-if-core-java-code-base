package tnsif.dayfour.constructor;

import java.util.Scanner;

public class ConstructorDemo {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		String name,city;
		int id;
		System.out.println("Enter Customer ID: ");
		id=sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter the customer Name: ");
		name=sc.nextLine();
		
		System.out.println("Enter Customer City: ");
		city=sc.nextLine();
		
		System.out.println(" ");
		
		Customer c1=new Customer();  //default
		c1.setCustomerCity(city);
		c1.setCustomerId(id);
		c1.setCustomerName(name);
		System.out.println(c1);
		
		Customer c2=new Customer(name,id,city);
		System.out.println(c2);
		
		System.out.println(c2.getCustomerCity());
		System.out.println(c2.getCustomerId());
		System.out.println(c2.getCustomerName());
	}

}
