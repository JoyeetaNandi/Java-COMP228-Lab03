package Example2;

public class HourlyEmployee extends Employee {

		//Add instance data variables
		private double totalNumberOfHoursPerWeek;
		private double hourlyRate = 14;

		//getter for the total number of hours per week
		public double getTotalNumberOfHoursPerWeek() {
			return totalNumberOfHoursPerWeek;
		}//end getter
		
		//setter  for the total number of hours per week
		public void setTotalNumberOfHoursPerWeek(double totalNumberOfHoursPerWeek) {
			if(totalNumberOfHoursPerWeek > 0)
			this.totalNumberOfHoursPerWeek = totalNumberOfHoursPerWeek;
			else
				System.out.println("**The total numbers of hours per week cannot be negative or zero");
		}//end setter
		
		//getter for hourlyRate
		public double getHourlyRate() {
			return hourlyRate;
		}//end getter
		
		//setter for hourly rate
		public void setHourlyRate(double hourlyRate) {
			if(hourlyRate > 14) 
			this.hourlyRate = hourlyRate;
			else
				System.out.println("**Hourly rate can not be negative or zero");
		}//end setter
		
		//Constructor to initializing all the instance data members/variables
		public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double totalNumberOfHoursPerWeek, double hourlyRate) {
			super(firstName, lastName, socialSecurityNumber);
			setTotalNumberOfHoursPerWeek(totalNumberOfHoursPerWeek);
			setHourlyRate(hourlyRate);
		}//end constructor
		
		//Method to calculates employee earnings
		@Override
		public double getPaymentAmount() {
			return (totalNumberOfHoursPerWeek * hourlyRate);
		}//end Method
	  
		//Method to display the object's data
		@Override
		public String toString()
		{
			return String.format("%s%nHourly Rate: %.2f%nNumber Of Hours Per Week: %f%n", 
					super.toString(), getHourlyRate(), getTotalNumberOfHoursPerWeek());
		}//end Method
}//end Class




