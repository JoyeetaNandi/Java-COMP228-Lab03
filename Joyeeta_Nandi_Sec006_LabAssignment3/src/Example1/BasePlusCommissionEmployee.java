package Example1;

public class BasePlusCommissionEmployee extends CommissionEmployee // inheritance
{
	//class instance variable
	private double baseSalary = 200.00;
    // define getter and setter for baseSalary
	public double getBaseSalary() 
	{
		return baseSalary;
	} //end getter
	// setter
	public void setBaseSalary(double baseSalary) 
	{
		if (baseSalary > 200.00)
		   this.baseSalary = baseSalary;
		
	} //end setter
	
	//Initializes all the instance data members
	public BasePlusCommissionEmployee(int employeeId, String firstName, String lastName,
			double grossSales, double commissionRate, double baseSalary) 
	{
		super(employeeId, firstName, lastName, grossSales, commissionRate);
		//setGrossSales(grossSales);
		//setCommissionRate(commissionRate);
		setBaseSalary(baseSalary);
	} //constructor end
	
	//Calculates employee's commission
	@Override
	public double earnings() 
	{
		// return (getCommissionRate() * (getGrossSales()/100)) + baseSalary;
		// or
		return super.earnings() + baseSalary; 
	}
	
	//Display the object's data
	@Override
	public String toString()
	{
		return String.format("%s%nBase Salary: %.2f%n", super.toString(), baseSalary);
	}
} //end class
