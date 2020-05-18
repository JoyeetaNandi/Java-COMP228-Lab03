package Example1;

public class PieceWorker extends Employee 
{
	private double wagePerPiece;
	private int numberOfpiecesProduced;
	
	//getter for wage per pieces
			public double getWagePerPiece() {
				return wagePerPiece;
			}//end getter
			
			//setter for wage per piece
			public void setWagePerPiece(double wagePerPiece) {
				if(wagePerPiece > 0) 
				this.wagePerPiece = wagePerPiece;
				else
					System.out.println("**Wage per pieces can not be negative or zero");
			}//end setter
	
	//getter for the wage per piece
			public double getNumberOfpiecesProduced() {
				return numberOfpiecesProduced;
			}//end getter
			
			//setter  for the wage per pieces
			public void setNumberOfpiecesProduced(int numberOfpiecesProduced) {
				if(numberOfpiecesProduced > 0)
				this.numberOfpiecesProduced = numberOfpiecesProduced;
				else
					System.out.println("**The total produces numbers of pieces cannot be negative or zero");
			}//end setter
			
			//Constructor to initializing all the instance data members/variables
			public PieceWorker(int employeeId, String firstName, String lastName, double wagePerPiece, int numberOfpiecesProduced) {
				super(employeeId, firstName, lastName);
				setWagePerPiece(wagePerPiece);
				setNumberOfpiecesProduced(numberOfpiecesProduced);
			}//end constructor
			
			//Method to calculates employee earnings
			@Override
			public double earnings() {
				return (numberOfpiecesProduced * wagePerPiece);
			}//end Method
		  
			//Method to display the object's data
			
			@Override
			public String toString()
			{
				return String.format("%s%nWage Per Piece: %.2f%nNumber Of pieces Produced: %f%n", 
						super.toString(), getWagePerPiece(), getNumberOfpiecesProduced());
			}//end Method
			
}
