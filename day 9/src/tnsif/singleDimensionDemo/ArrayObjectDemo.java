package tnsif.singleDimensionDemo;

public class ArrayObjectDemo {
	public static void main(String[] args) {
		
		Student [] arr;
		
		//declare
		arr=new Student[5];
		
		arr[0]=new Student (101,"Heli");
		arr[1]=new Student(102,"Shreya");
		arr[2]=new Student(102,"Piyush");
		arr[3]=new Student(102,"Shiya");
		arr[4]=new Student(102,"Yakshit");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Element at: "+ i +": "+ arr[i].getRollNo()+ ","+ arr[i].getName());
		}
}
}