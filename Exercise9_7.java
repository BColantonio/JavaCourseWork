package lab3BC;

public class Exercise9_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create an account object with an account id of 1122
		Account acct = new Account(1122, 20000);
		acct.setAnnualInterestRate(4.5);
		System.out.println("Initiating withdrawal of $2500.00");
		acct.withdraw(2500);
		System.out.println("Initiating deposit of $3000");
		acct.deposit(3000);
		System.out.println("Balance: " + acct.getBalance() + " Date account was created: " + acct.DateCreated() + " Monthly Interest: " + acct.getMonthlyInterest());
	}

}
