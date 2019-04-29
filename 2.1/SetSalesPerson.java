package inclasswk3BC;
import java.util.Scanner;

public class SetSalesPerson {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in); 
		String fNameSet = new String();
		String lNameSet = new String();
		String fNameSet1 = new String();
		String lNameSet1 = new String();
		SalesPerson Guy = new SalesPerson();
		SalesPerson Girl = new SalesPerson();
		
		System.out.print("Enter the sales person's first name:");
		fNameSet = keyboard.nextLine();
		Guy.setFirstName(fNameSet);
		System.out.print("Enter the sales person's last name: ");
		lNameSet = keyboard.nextLine();		
		Guy.setLastName(lNameSet);		 
		System.out.print("print: ");
		Guy.print();
		
		System.out.println("Enter another sales person? (Y or N)");
		fNameSet1 = keyboard.nextLine().toUpperCase();
		if (fNameSet1.contentEquals("Y"))
		{
			System.out.print("Enter the sales person's first name:");
			fNameSet1 = keyboard.nextLine();
			Girl.setFirstName(fNameSet1);	
			System.out.print("Enter the sales person's last name: ");
			lNameSet1 = keyboard.nextLine();
			Girl.setLastName(lNameSet1);
			System.out.print("print: ");
			Girl.print();
			Girl.equals(Guy);
		}
		
	}

}
