//Create a program that has two instances of LinkedList.  
//•	The first instance will be called stadiumNames and will hold items of type String.  (LinkedList<String>)
//•	The second instance is gameRevenue and will hold items of type Double.  (LinkedList<Double>)

//Within a loop, read data for the ball games played during a season.  The data for a game consists of a stadium name and the amount of money made for that game.  Add the game data to stadiumNames and gameRevenue.  [Note, one stadium can have multiple games].
//After reading the data for all of the games, ask the user for a stadium name and display the total amount of money made for all of the games at that stadium.
import java.util.*;

public class linkedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> stadiumNames = new LinkedList<String>();
		LinkedList<Double> gameRevenue = new LinkedList<Double>();
		String usrInput = new String();
		double usrInputDbl = 0;
		double totalVal = 0;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("On each line enter a stadium name and the game revenue.");
		System.out.println("Enter done when you are finished.");
		try {
		usrInput = keyboard.next();	
		}catch(Exception e){
			System.out.println("Please enter a valid input format and start again.");
			return;
		}
		while (!usrInput.contains("done")) {
			try {
			usrInputDbl = keyboard.nextDouble();
			}catch(Exception e){
				System.out.println("Please enter a valid input format and start again.");
				return;
			}
			stadiumNames.add(usrInput);
			gameRevenue.add(usrInputDbl);
			try {
			keyboard.nextLine();
			}catch(Exception e){
				System.out.println("Please enter a valid input format and start again.");
				return;
			}
			try {
			usrInput = keyboard.next();
			}catch(Exception e){
				System.out.println("Please enter a valid input format and start again.");
				return;
			}
			//usrInputDbl = keyboard.nextDouble();
		}
		System.out.println("Enter the name of a stadium to get the total revenue for: ");
		try {
		usrInput = keyboard.next();
		}catch(Exception e){
			System.out.println("Please enter a valid input format and start again.");
			return;
		}
		Iterator<String> itr = stadiumNames.iterator();
		Iterator<Double> dbl = gameRevenue.iterator();
		while (itr.hasNext()) {			
			String stObj = (String)itr.next();
			Double dbObj = (Double)dbl.next();
			if (stObj.contains(usrInput)) {
				totalVal += dbObj;
				
			}
			// System.out.println(itr.next());
		}
		System.out.print("The total revenue is: " + totalVal);
	}

}

//All code written by: Brian J. Colantonio
