// Fig. 10.14: PayableInterfaceTest.java
// Payable interface test program processing Invoices and 
// Employees polymorphically.
package Example3;

public class PayableInterfaceTest {
   public static void main(String[] args) {
	   //CommissionEmployee commissionEmployer = new CommissionEmployee("Joyeeta","Nandi", "123-231-1212", 10000.00, 0.5);
	   //System.out.println("Commission Employee Object: ");		
		//System.out.println(commissionEmployer);
		
      // create four-element Payable array
      Payable[] payableObjects = new Payable[] {
         new Invoice("01234", "seat", 2, 375.00),
         new Invoice("56789", "tire", 4, 79.95),
         new SalariedEmployee("John", "Smith", "111-11-1111", 800.00),
         new CommissionEmployee("Joyeeta","Nandi", "123-231-1212", 10000.00, 0.5),
         new HourlyEmployee ("Biplob", "Sarker", "343-322-2344",35, 20.00),
         new BasePlusCommissionEmployee ("Shreya","Sarker","111-222-3333", 1612.00,2555.00,0.85)
         
         //new SalariedEmployee("Lisa", "Barnes", "888-88-8888", 1200.00)
      };

      System.out.println(
         "Invoices and Employees processed polymorphically:"); 

      // generically process each element in array payableObjects
      for (Payable currentPayable : payableObjects) {
    	  if (currentPayable instanceof BasePlusCommissionEmployee) 
    	  	{
    		  ((BasePlusCommissionEmployee)currentPayable).setBaseSalary(1.1 *((BasePlusCommissionEmployee)currentPayable).getBaseSalary());
    	  	}
    	  if (currentPayable instanceof HourlyEmployee)
    	  {
    		  ((HourlyEmployee)currentPayable).setHourlyRate(2 + ((HourlyEmployee)currentPayable).getHourlyRate());
    	  }
         // output currentPayable and its appropriate payment amount
         System.out.printf("%n%s %npayment due: $%,.2f%n", 
            currentPayable.toString(), // could invoke implicitly
            currentPayable.getPaymentAmount()); 
      } 
   } 
} 


/**************************************************************************
 * (C) Copyright 1992-2018 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
