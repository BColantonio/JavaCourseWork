package lab2bc;

import java.util.Scanner;
import java.text.DecimalFormat;

public class lab2bcpt1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		double wghtInLbs = 0;
		double hghtInInchs = 0;
		int ageInYrs = 0;
		double chocolateBar = 230;
		double totalChocolate = 0;		
        Scanner keyboard = new Scanner(System.in); 
        String activityLvl = new String();
        String gender = new String();
        //if gender does not equal M and gender does not equal F
        while (!gender.equals("M") && !gender.equals("F"))
        {
	        System.out.print("Please enter your gender in valid format: ( > M / F < ) ");
	        String genderInput = keyboard.nextLine();
	        gender = genderInput.toUpperCase();
        }
        System.out.print("Please enter your weight in pounds (lbs): ");
        String wghtInput = keyboard.nextLine();
        wghtInLbs = Double.valueOf(wghtInput);
        System.out.print("Please enter your height in inches: ");
        String hghtInput = keyboard.nextLine(); 
        hghtInInchs = Double.valueOf(hghtInput);
        System.out.print("Please enter your age in years: ");
        String ageInput = keyboard.nextLine(); 
        ageInYrs = Integer.parseInt(ageInput);
        System.out.println("Please enter your activity level:");
        System.out.println("Sedentary...");
        System.out.println("Somewhat Active (exercise occasionally)...");
        System.out.println("Active (exercise 3-4 days per week) ...");
        System.out.println("Highly active (exercise every day) ...");
        activityLvl = keyboard.nextLine();
        activityLvl = activityLvl.toUpperCase();
        double wBMR = 655 + (4.3 * wghtInLbs) + (4.7 * hghtInInchs) - (4.7 * ageInYrs);
		double mBMR = 66 + (6.3 * wghtInLbs) + (12.9 * hghtInInchs) - (6.8 * ageInYrs);
        switch (activityLvl) 
        {
	        case "SEDENTARY":
	        	wBMR += (wBMR * .20); 
	        	mBMR += (mBMR * .20);
	        	break;
	        case "SOMEWHAT ACTIVE":
	        	wBMR += (wBMR * .30); 
	        	mBMR += (mBMR * .30);
	        	break;
	        case "ACTIVE":
	        	wBMR += (wBMR * .40); 
	        	mBMR += (mBMR * .40);
	        	break;
	        case "HIGHLY ACTIVE":
	        	wBMR += (wBMR * .50); 
	        	mBMR += (mBMR * .50);
	        	break;
	        default:
	        	System.out.println("OOPS... something went wrong!");
	        	break;
        }
        
        //System.out.print(mBMR);
        switch (gender)
        {
        case "M":
        	totalChocolate = (mBMR / chocolateBar);
        	System.out.println("You can eat " + new DecimalFormat("#.##").format(totalChocolate) + " chocolate bars and still maintain your current BMR");
        	break;
        case "F":
        	totalChocolate = (mBMR / chocolateBar);
        	System.out.println("You can eat " + new DecimalFormat("#.##").format(totalChocolate) + " chocolate bars and still maintain your current BMR");
        	break;
        default:
        	System.out.println("There has been an error with \"Gender\", \"mBMR\", or \"wBMR\"");
        	break;

        }
	}
}


