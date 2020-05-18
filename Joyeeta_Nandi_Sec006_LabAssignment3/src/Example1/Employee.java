package Example1;

import java.util.Date;

public abstract class Employee extends Object {
	// Instance Data members
	private int employeeId;
	private String firstName;
	private String lastName;
	// add address
	// add hireDate
	//private Date hireDate; // this is a composition relation. It is of type- "has-a"
	//Getters for employeeId, first name and last name, Note: Data validation left
		public int getEmployeeId() 
		{
			return employeeId;
		} //end getter
		
		public String getFirstName() 
		{
			return firstName;
		} //end getter
		
		public String getLastName() 
		{
			return lastName;
		} //end getter

//Overload Constructor that initializes employeeId, first name and last name
	public Employee(int employeeId, String firstName, String lastName)
		{
			if (employeeId > 0) {
				this.employeeId = employeeId;
			}
			if (firstName == null || firstName == "") 
			{
				System.out.println("First Name has to be filled");
			}
			else
				this.firstName = firstName;
			if (lastName == null || lastName == "")
			{
				System.out.println("Last Name has to be filled");
			}
			else
				this.lastName = lastName;
		} //end overloaded constructor
  // abstract class, they don't have body
	public abstract double earnings();
    
	// For displaying the objects data
	public String toString()
	{
		return String.format("EmployeeId:%d%nFirst Name: %s%nLast Name:%s%n",
				              employeeId, firstName, lastName);
	}
} // end class
