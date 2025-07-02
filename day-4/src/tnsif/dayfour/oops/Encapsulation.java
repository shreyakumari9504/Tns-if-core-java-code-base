package tnsif.dayfour.oops;

public class Encapsulation {
	
	private int serialName;
	private String name;
    private int age;
    
    
	public int getSerialName() {
		return serialName;
	}
	public void setSerialName(int serialName) {
		this.serialName = serialName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return "Encapsulation [serialName=" + serialName + ", name=" + name + ", age=" + age + "]";
	}
	
//	public Encapsulation() {
//		System.out.println("this is parameter constructor");
//		this.serialName = serialName;
//		this.name = name;
//		this.age = age;
//	}
	
	
	
	
	
}
