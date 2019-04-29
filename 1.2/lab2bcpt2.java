package lab2bc;
import java.util.Scanner;
enum Integers {}
public class lab2bcpt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner keyboard = new Scanner(System.in); 
        int tempint = 0;
        int largest = 0;
        int counter = 0;
        System.out.print("Please enter integers separated by spaces. (0 ends the input) then press [ENTER]: ");
        //String usrInput = keyboard.next();
        while (keyboard.hasNext())
        {      
    		tempint = keyboard.nextInt();
    		System.out.println("Int: " + tempint);      			
        
        	if (tempint > largest) 
        	{
        		largest = tempint;
        		counter++;
        	}       	
		
			if (tempint == 0)
			{
				System.out.println("The largest number is " + largest);
				System.out.println("The number " + largest + " appears " + counter + " times.");
				System.exit(0);
			}
        }
	}

}
