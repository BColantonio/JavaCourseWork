package lab4;

//this class will record sales for a store
public class Ledger {
	
	private int salesMade = 0; //the number of sales made so far
	private int maxSales = 0; //the maximum number of sales that can be made
	private double[] sale = new double[10]; //an array of double values that are the amount of all sales
	
	public void Ledger(int max) {
		//constructor that sets the maximum number of sales to the max value
		maxSales = max; 
	}
	
	public void addSale(String d) {
		//adds a sale whose value is d
		for (int i = 0; i<= sale.length; i++) {
			double val = Double.parseDouble(d);
			sale[i] = val;
		}
	}

	public void getNumberOfSales(){
		//returns the number of sales made
		for (int i = 0; i < sale.length; i++)
		{
			salesMade++;
		}
	}
	
	public double getTotalSales() {
		//returns the total value of sales
		double grandTotal = 0;
		for (double val : sale) {
			grandTotal += val;
		}
		return grandTotal;
	}
	
	public double getAverageSale() {
		//returns the average value of all sales
		double total = getTotalSales();
		return total / sale.length;
		
	}
	
	public int getCountAbove(double target) {
		//returns the number of sales that exceeded the target value
		int count = 0;
		for (int i = 0; i <= sale.length; i++) 
		{
			if (sale[i] > target)
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	//In addition you are responsible for reasonable error handling in this program--i.e. ou ashould define the program against users that enter things that aren't logical.
	
	//In your main program. make appropriate calls to prove that your program has et the above specification
	
	//you should use a constructor for Ledger that sets the sales array in LEdger to a value of 10. You should only add about 5 sales in the main program.
	
	//An example output is:
	
	//Testing Ledger:
	//Adding sales 3.52, 2.43, 9.00, 3.5, 5.0
	//the total number of sales are: 5
	//the total amount of sales is: 23.45
	//The average sale amount is: 4.689999999999999995
	//The number of sales greater than 3.5 is: 3
	//The number of sales greater than 3.0 is: 4

}
