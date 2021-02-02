package day5;

class employeeinfo
{
	int empId;
	String name, dept;
	double salary;
	
	void dispalyEmployeeInfo()
	{
		System.out.println("Id is "+ empId);
		System.out.println("Name is "+ name);
		System.out.println("Department is "+ dept);
		System.out.println("Salary is "+ salary);
	}
	
	String loan()
	{
	if(salary<75000)
		return "You can apply for loan";
	return "You cannot apply for loan";
	}
}

public class Employee {

	public static void main (String[] args) {
		
		employeeinfo ramesh= new employeeinfo();
		ramesh.empId= 234567;
		ramesh.name = "Ramesh";
		ramesh.dept = "Developer";
		ramesh.salary= 50000;
		
		ramesh.dispalyEmployeeInfo();
		
		
		System.out.println(ramesh.loan());

	}

}

