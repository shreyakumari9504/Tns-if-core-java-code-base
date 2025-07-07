package tnsif.abstraction;

public abstract class Shape {
	
	protected float area;
	
    public abstract void calArea();
   
	//solid method
   public void show() {
	   System.out.println("Area of the shape is : "+area);
   }
   
}
