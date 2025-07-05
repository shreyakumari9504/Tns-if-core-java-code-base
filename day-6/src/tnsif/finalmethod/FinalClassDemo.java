package tnsif.finalmethod;

final class FinalClass{
		
		void show ()
		{
			System.out.println("Final class cannot be inherited");
		}
	}


public class FinalClassDemo {

		public static void main(String[] args) {
			
			FinalClass f=new FinalClass();
			f.show();

		}


}
