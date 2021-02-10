package oopsAssignment;

abstract class Medicine
{
	abstract void getDetails(int price, String expiryDate);
	abstract void displayLabel();
	
}

class Tablet extends Medicine
{

	@Override
	void getDetails(int price, String expiryDate) {
		System.out.println("Price of tablet is:"+price);
		System.out.println("Expiry Date of tablet is: "+expiryDate);
		
	}

	@Override
	void displayLabel() {
		System.out.println("store in a cool dry place");
		
	}
}
	class Syrup extends Medicine
	{

		@Override
		void getDetails(int price, String expiryDate) {
			System.out.println("Price of syrup is:"+price);
			System.out.println("Expiry Date f syrup is: "+expiryDate);
			
		}

		@Override
		void displayLabel() {
			System.out.println("Shake well before use");
			
		}
	}
		class Oinment extends Medicine
		{

			@Override
			void getDetails(int price, String expiryDate) {
				System.out.println("Price of oinment is:"+price);
				System.out.println("Expiry Date of oinment is: "+expiryDate);
				
			}

			@Override
			void displayLabel() {
				System.out.println("for external use only");
				
			}
	
}

public class MedicineExample {

	public static void main(String[] args) {
		
		
		Tablet t1= new Tablet();
		Syrup s1=new Syrup();
		Oinment o1=new Oinment();
		
		t1.displayLabel();
		s1.displayLabel();
		o1.displayLabel();
		
		 double a= Math.random()*3;
		 int b= (int) a;
		 System.out.println(b);
		 
		 switch(b)
		 {
		 case 1:
			 
			 t1.getDetails(50 ,"11-09-22");
			 break;
			 
		 case 2:
			 
			 s1.getDetails(90 ,"19-01-23");
			 break;
			 
		 case 3:
			 
			 o1.getDetails(40 ,"01-01-24");
			 break;
		 }
		 
		
	}

}
	
