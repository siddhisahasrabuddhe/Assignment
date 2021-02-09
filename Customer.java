package oopsAssignment;

class Address1
{
	String doorname;
	String streetName,city;
	
	
	public Address1(String doorname, String streetName, String city) {
		super();
		this.doorname = doorname;
		this.streetName = streetName;
		this.city=city;
		
}
}


public class Customer {
	
	String customerName;
	Address1 residentialAddress;
	
	public Customer() {
		super();
	}
	
	public Customer(String customerName, Address1 residentialAddress) {
		super();
		this.customerName = customerName;
		this.residentialAddress = residentialAddress;
	}

	public String getCustomerDetails(String customerName, Address1 ad) {
		System.out.println("Name is: "+customerName);
		System.out.println("DoorName is: "+ad.doorname);
		System.out.println("StreetName is: "+ad.streetName);
		System.out.println("City is: "+ad.city);
		return customerName + ad;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public void setResidentialAddress(Address1 residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	
	
	public static void main(String[] args) {
		
		Address1 ad= new Address1("1st Main","HSR Layout","Banglore");
		
		Customer c=new Customer();
		c.getCustomerDetails("John",ad);
		
		
		
		

	}

}

