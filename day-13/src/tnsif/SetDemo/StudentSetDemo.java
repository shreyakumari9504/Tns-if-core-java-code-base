package tnsif.SetDemo;

import java.util.HashSet;
import java.util.Set;

public class StudentSetDemo {

	public static void main(String[] args) {
		Set<Student>set=new HashSet<Student>();
		set.add(new Student(101,"Shubham",45.09));
		set.add(new Student(1012,"Heti",67.89));
		set.add(new Student(101,"Zeel",78.89));
		set.add(new Student(1012,"Heti",67.89));
		set.add(new Student(1012,"Heti",90.871));
		System.out.println(set);
	}
}
