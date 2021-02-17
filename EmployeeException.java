class NameValidationException extends RuntimeException
{
	String name;

	public NameValidationException(String name) {
		super();
		
	}
	
}


public class EmployeeException{
	
	private String FirstName;
	private String LastName;
	
	
	public EmployeeException(String FirstName, String LastName) {
		//super();
		FirstName = this.FirstName;
		LastName = this.LastName;
	
	}
	void validateField() //throws NameValidationException
	{
		
		if(FirstName==null && LastName==null)
		{
			throw new NullPointerException("Entry Missing");
		}

		else if(FirstName.length()<3 && LastName.length()<3)
		{
			throw new NameValidationException("Name should be minimum 3 character");
		}
		else
		{
			System.out.println("FirstName is "+FirstName);
			System.out.println("LastName is "+LastName);
		}
	}
	

	public static void main(String[] args) {
		EmployeeException ed=new EmployeeException("si","si");
		
		ed.validateField();

	}

}
