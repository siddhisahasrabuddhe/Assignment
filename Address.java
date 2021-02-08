package oopsAssignment;

class AddressInfo{
	
	private String addressLine;
	private String city;
	
	

	public AddressInfo(String addressLine, String city) {
	
		this.addressLine = addressLine;
		this.city = city;
		
		System.out.println("AddressLine is "+addressLine);
		System.out.println("City is "+city);
	}
	
	

	public void getAddressDetails(String addressLine, String city) {

		System.out.println("AddressLine is "+addressLine);
		System.out.println("City is "+city);
	}


	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}


	public void setCity(String city) {
		this.city = city;
	}
}

	public class Address {

	public static void main(String[] args) {
		
		AddressInfo a=new AddressInfo("1st main HSR Layout","Banglore");
	
		a.getAddressDetails("1st main HSR Layout","Banglore");
		
		
	}	

	}


