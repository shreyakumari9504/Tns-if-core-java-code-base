package tnsif.SetDemo;

public class Student {
	private int Id;
	private String name;
	private double per;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPer() {
		return per;
	}
	public void setPer(double per) {
		this.per = per;
	}
	public Student(int id, String name, double per) {
		super();
		this.Id = id;
		this.name = name;
		this.per = per;
	}
	@Override
	public String toString() {
		return "Student [id=" + Id + ", name=" + name + ", per=" + per + "]";
	}

}
