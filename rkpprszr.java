import java.util.Scanner;

public class rkpprszr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// define the range 
        int max = 2; 
        int min = 0;         
        
        Scanner keyboard = new Scanner(System.in); 
        
        System.out.println("Please enter \"Rock\", \"Paper\", or \"Scissor.\"");
        String usrInput = keyboard.nextLine(); 
        String usrInputString = usrInput.toUpperCase();
        System.out.println(usrInputString);
        
        String pcPlay = new String();
        
        int rand = (int)(Math.random() * 3); 
        
        switch (rand)
        {
        	case 0:
        		pcPlay = "ROCK";
        		break;
        	case 1:
        		pcPlay = "SCISSOR";
        		break;
        	case 2:
        		pcPlay = "PAPER"; 
        		break;
        	default:
        		pcPlay = "OOPS, something went wrong...";
        		System.exit(0);
        		break;
        }
        
        if (usrInputString.equals(pcPlay)) 
            System.out.println("It's a tie!"); 
        else if (usrInputString.equals("ROCK") && pcPlay.equals("SCISSOR")) 
			System.out.println("Rock crushes scissors. You win!!");
        else if (usrInputString.equals("ROCK") && pcPlay.equals("PAPER")) 
    		System.out.println("Paper eats rock. You lose!!"); 
        else if (usrInputString.equals("PAPER") && pcPlay.equals("SCISSOR")) 
    		System.out.println("Scissor cuts paper. You lose!!"); 
		else if (usrInputString.equals("PAPER") && pcPlay.equals("ROCK")) 
			System.out.println("Paper eats rock. You win!!"); 
		else if (usrInputString.equals("SCISSOR") && pcPlay.equals("PAPER")) 
			System.out.println("Scissor cuts paper. You win!!"); 
		else if (pcPlay.equals("ROCK") && usrInputString.equals("SCISSOR")) 
			System.out.println("Rock breaks scissors. You lose!!"); 
        else 
			System.out.println("Invalid user input."); 
    } 
	

}
