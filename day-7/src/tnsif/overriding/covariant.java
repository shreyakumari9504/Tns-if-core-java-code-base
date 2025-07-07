package tnsif.overriding;

class Colour{
  protected Colour getColour() {
	  Colour s=new Colour();
	  return s;
  }
}  
class Red extends Colour{
	  protected Red getColour() {
		  Red s=new Red();
		  return s;
  }
}

class Blue extends Colour{
	
	@Override
	protected Blue getColour()
	{
		Blue s=new Blue();
		return s;
	}
}
public class covariant {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
