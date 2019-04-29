package lab4;
import java.util.*;
public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String usrInput = new String();
		Scanner keyboard = new Scanner(System.in);
		double dblUsrInput = 0;
		String[] strArray = new String[10];
		double[] dblArray = new double[10];
		
		
		System.out.println("Testing Ledger:");
		System.out.println("Enter sales to add: ");
		usrInput = keyboard.next();
		strArray = usrInput.trim().split(" ");
		for (int i = 0; i < strArray.length; i++)
		{
			dblArray[i] = Double.parseDouble(strArray[i]);
		}
		
	}

}
