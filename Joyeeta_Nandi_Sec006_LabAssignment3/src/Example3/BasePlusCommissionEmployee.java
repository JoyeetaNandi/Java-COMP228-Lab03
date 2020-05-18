package Example3;

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
	public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
			double grossSales, double commissionRate, double baseSalary) 
	{
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
		//setGrossSales(grossSales);
		//setCommissionRate(commissionRate);
		setBaseSalary(baseSalary);
	} //constructor end
	
	//Calculates employee's commission
	@Override
	public double getPaymentAmount() 
	{
		// return (getCommissionRate() * (getGrossSales()/100)) + baseSalary;
		// or
		return super.getPaymentAmount() + baseSalary; 
	}
	
	//Display the object's data
	@Override
	public String toString()
	{
		return String.format("%s%nBase Salary: %.2f%n", super.toString(), baseSalary);
	}
} //end class
