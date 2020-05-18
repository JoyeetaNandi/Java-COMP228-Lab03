package Example3;

public class CommissionEmployee extends Employee
{	
	//class instance variables
	private double grossSales;
	private double commissionRate = 0.1;
	
	//Getters and Setters for grossSales and commission rate, Note: Data validation left
	public double getGrossSales() 
	{
		return grossSales;
	} //end getter
	
	public void setGrossSales(double grossSales) 
	{
		if (grossSales > 0 )
		{
			this.grossSales = grossSales;
		}
		else
		{
			System.out.println("Gross Sales has to be positive");
		}
		
	} //end setter
	public double getCommissionRate() 
	{
		return commissionRate;
	} //end getter
	
	public void setCommissionRate(double commissionRate) 
	{
		if (commissionRate > 0.1) {
			this.commissionRate = commissionRate;
		}
		else
		{
			System.out.println("Commission Rate can be greater than or eqaul to 0.1");
		}	
	} //end setter
	
	//Constructor that initializes all the instance data members/variables
	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, 
			                   double grossSales, double commissionRate) 
	{
		super(firstName, lastName, socialSecurityNumber);
		setGrossSales(grossSales);
		setCommissionRate(commissionRate);
	} //end constructor
	
	//calculates employee's commission
	@Override
	public double earnings()
	{
		return (commissionRate * (grossSales/100));
	}
	
	//display the object's data
	@Override
	public String toString()
	{
		return String.format("%s%nGross Sales:%f%nCommissionRate: %f%n",
	                          super.toString(), grossSales, commissionRate);
	}
} // end class
