package lab2bc;

import java.util.Scanner;

public class Pt3 {
	//Write a program that prompts the user to enter the numerator and denominator of a fraction. The program determines whether the number is a proper fraction (i.e. less than 1) or an improper fraction. If it is a proper fraction, display the number. If not, reduce it to a mixed fraction or to an integer.
	
	//To convert an improper fraction to a mixed fraction, follow these steps: 
	/*	•	Divide the numerator by the denominator. 
		•	Write down the whole number answer. 
		•	Then write down any remainder above the denominator. 
	*/

	//The program is to loop until the numerator entered is 0, at that point, the program will output a statement saying that it is exiting.

	//All data will be valid.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//system.out.println prompt the user to enter the numerator and the denominator
		//Enter a numerator: 45
		//Enter a denominator: 46
		
		//The program determines whether the number is a proper fraction (i.e. less than 1) or an improper fraction.
		
		//If it is a proper fraction, display the number. If not, reduce it to a mixed fraction or to an integer.
		
		//45 / 46 is a proper fraction
		//45 / 15 is an improper fraction and it can be reduced to 3
		//45 / 25 is an improper fraction and its mixed fraction is 1 + 20 / 25
		
		//The program is to loop until the numerator entered is 0, at that point, the program will output a statement saying that it is exiting.
		Scanner keyboard = new Scanner(System.in);
		int intNumerator = 1;
		int intDenominator = 0;
		String usrInputString = new String(); 
		while (intNumerator != 0)
		{
			System.out.println("Enter a numerator: ");
			usrInputString = keyboard.nextLine();
			intNumerator = Integer.parseInt(usrInputString);
			
			System.out.println("Enter a denominator: ");
			usrInputString = keyboard.nextLine();
			intDenominator = Integer.parseInt(usrInputString);
			
			//if numerator is less than denominator, display the number... it is less than one.
			
			// if numerator is more than denominator,  it is an improper fraction, decide whether it can be reduced, or display it as a mixed fraction
			
			//if numerator is larger than denominator, attempt to reduce it. if it cannot be reduced to an integer, display it as a mixed fraction. 
		}
			
			
	}

}
