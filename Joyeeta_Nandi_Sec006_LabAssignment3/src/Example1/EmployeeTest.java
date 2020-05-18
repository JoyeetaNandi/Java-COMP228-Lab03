package Example1;


public class EmployeeTest {

	public static void main(String[] args) {
		
		
		Employee[] employeeObjects = new Employee[] {
		         
		         new SalariedEmployee(101,"Debjyoti", "Sarker", 800.00),
		         new CommissionEmployee(202, "Joyeeta","Nandi", 10000.00, 0.5),
		         new HourlyEmployee (303, "Biplob", "Sarker", 35, 20.00),
		         new BasePlusCommissionEmployee (404, "Shreya","Sarker", 1612.00,2555.00,0.85),
		         new PieceWorker(505, "John","Smith", 12.00, 20)
		      };

		      System.out.println(
		         "Employees processed polymorphically:"); 

		      // generically process each element in array payableObjects
		      for (Employee currentPayable : employeeObjects) {
		    	 
		         // output currentPayable and its appropriate payment amount
		         System.out.printf("%n%s %npayment due: $%,.2f%n", 
		            currentPayable.toString(), // could invoke implicitly
		            currentPayable.earnings()); 
		      } 
		   
		
		
	} // end main
} // end class
