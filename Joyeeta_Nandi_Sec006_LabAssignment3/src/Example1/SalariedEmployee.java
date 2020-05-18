package Example1;

public class SalariedEmployee extends Employee{
	// instance data member
	private double weeklySalary;
	
	// TODO 
	// define getter and setter and add validation in setter
	
	public SalariedEmployee(int employeeId, String firstName, String lastName, double weeklySalary)
	{
		super(employeeId, firstName, lastName);
		this.weeklySalary = weeklySalary; 
	}

	@Override
	public double earnings() {
		return weeklySalary;
	}//end Method
	
	
} // end class
