
public class Employee {
String FirstName, LastName;
	
	public Employee(String firstName, String lastName) {
		super();
		FirstName = firstName;
		LastName = lastName;
		
}

	@Override
	public String toString() {
		return "Employee [FirstName=" + FirstName + ", LastName=" + LastName + "]";
	}

	public static void main(String[] args) {

		Employee e1= new Employee("Sachin","Tendulkar");
		 Employee e2= new Employee("Rahul","Dravid");
		 Employee e3= new Employee("Virat","Kohali");
		 
		 System.out.println(e1.toString());
		 System.out.println(e2.toString());
		 System.out.println(e3.toString());

	}

}
