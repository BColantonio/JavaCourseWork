package lab3BC;
import java.util.Date;

public class Account {
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated = new Date();
	
	
	public Account(int id, double balance) {
		super();
		this.id = id;
		this.balance = balance;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate / 100;
	}

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Date DateCreated() {
		return dateCreated;
	}
	
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}
	
	public double getMonthlyInterest() {
		double monthlyInterestRate = annualInterestRate / 12;
		return balance * monthlyInterestRate;
	}
	public void withdraw(double withdrawal) {
		//withdraw a specified amount from the account.
		balance -= withdrawal;
		System.out.println("You have withdrawn " + withdrawal + ", your balance is now: " + balance);
	}
	
	public void deposit(double depositing) {
		//deposits a specified amount to the account.
		balance += depositing;
		System.out.println("You have deposited " + depositing + ", your balance is now: " + balance);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	

}
