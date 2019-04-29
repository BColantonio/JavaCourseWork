package lab3BC;

import java.util.Scanner;

public class testClass {

	/*
	 * Test the class to show that the class requirements have been satisfied. Your
	 * class should show the following scenario
	 * 
	 * • Create two rooms. • Add people to both rooms • Subtract people from both
	 * rooms – show that you can’t go negative • Print out the total number of
	 * people in each room • Print out the total number of people in ALL rooms (NOTE
	 * – THIS MUST BE A STATIC CALL)
	 * 
	 */

	public static void main(String[] args) {
		RoomOccupancy room1 = new RoomOccupancy();
		RoomOccupancy room2 = new RoomOccupancy();
		Scanner keyboard = new Scanner(System.in);
		String usrInput = "menu";
		int i = 0;
		int k = 0;
		// boolean j = false;
		while (usrInput.contains("menu")) {
			System.out.println("This program allows you to manage the room capacity of two rooms.");
			System.out.println(
					"You can add people to rooms, subtract people from rooms, and view the total capacity of one or both rooms.");
			System.out.println("What would you like to do?");
			System.out.println("ADD PEOPLE TO A ROOM (ENTER: 1)" + "\nSUBTRACT PEOPLE FROM A ROOM (ENTER: 2)"
					+ "\nVIEW TOTAL CAPACITY OF ONE ROOM (ENTER: 3)"
					+ "\nVIEW TOTAL CAPACITY OF BOTH ROOMS (ENTER: 4)");
			// usrInput tested with char and int outside of accepted options range
			usrInput = keyboard.next();
			try {
				i = Integer.parseInt(usrInput);
			} catch (Exception e) {
				System.out.println("I'm sorry, that isn't a valid response. Returning to main menu.");
				usrInput = "menu";
				continue;
			}
			switch (i) {
			case 1: {
				System.out.println(
						"There are two rooms that you can add people to. Would you like to add people? (Y or N)");
				try {
					// usrInput tested with int and char outside of accepted options range
					usrInput = keyboard.next().toUpperCase();
				} catch (Exception e) {
					System.out.println("I'm sorry, that isn't a valid response. Returning to main menu.");
					usrInput = "menu";
					break;
				}
				// usrInput.toUpperCase();
				if (usrInput.contains("Y")) {
					System.out.println("Which room would you like to add to? (1 or 2)");
					// usrInput tested with char and int outside of accepted options range
					usrInput = keyboard.next();
					try {
						Integer.parseInt(usrInput);
					} catch (Exception e) {
						System.out.println("I'm sorry, that isn't a valid response. Returning to main menu.");
						usrInput = "menu";
						break;
					}
					if (Integer.parseInt(usrInput) == 1) {
						System.out.println("How many people would you like to add to room 1?");
						// usrInput tested with char and int outside of accepted options range
						usrInput = keyboard.next();
						try {
							Integer.parseInt(usrInput);
						} catch (Exception e) {
							System.out.println("I'm sorry, that isn't a valid response. Returning to main menu.");
							usrInput = "menu";
							break;
						}
						i = Integer.parseInt(usrInput);
						for (k = 0; k < i; k++)
							room1.addOneToRoom();
					} else if (Integer.parseInt(usrInput) == 2) {
						System.out.println("How many people would you like to add to room 2?");
						// usrInput tested with char and int outside of accepted options range
						usrInput = keyboard.next();
						i = Integer.parseInt(usrInput);
						for (k = 0; k < i; k++)
							room2.addOneToRoom();
					} else {
						System.out.println("I'm sorry, that isn't a valid response. Returning to main menu.");
						usrInput = "menu";
						continue;
					}
					System.out.println("There are now " + room1.getNumber() + " in room 1 and " + room2.getNumber()
							+ " in room 2.");
					usrInput = "menu";
					continue;
				} else {
					System.out.println("I'm sorry, that isn't a valid response. Returning to main menu.");
					usrInput = "menu";
					break;
				}
			}
			case 2: {
				System.out.println(
						"There are two rooms that you can subtract people from. Would you like to subtract people? (Y or N)");
				try {
					// usrInput tested with int and char outside of accepted options range
					usrInput = keyboard.next().toUpperCase();
				} catch (Exception e) {
					System.out.println("I'm sorry, that isn't a valid response. Returning to main menu.");
					usrInput = "menu";
					break;
				}
				if (usrInput.contains("Y")) {
					System.out.println("Which room would you like to subtract from? (1 or 2)");
					// usrInput tested with char and int outside of accepted options range
					usrInput = keyboard.next();
					try {
						Integer.parseInt(usrInput);
					} catch (Exception e) {
						System.out.println("I'm sorry, that isn't a valid response. Returning to main menu.");
						usrInput = "menu";
						break;
					}
					if (Integer.parseInt(usrInput) == 1) {
						System.out.println("How many people would you like to subtract from room 1?");
						usrInput = keyboard.next();
						try {
							Integer.parseInt(usrInput);
						} catch (Exception e) {
							System.out.println("I'm sorry, that isn't a valid response. Returning to main menu.");
							usrInput = "menu";
							break;
						}
						i = Integer.parseInt(usrInput);
						if (i > room1.getNumber()) {
							System.out.println("The room cannot contain negative numbers.");
						} else {
							for (k = 0; k < i; k++)
								room1.removeOneFromRoom();
						}
					} else if (Integer.parseInt(usrInput) == 2) {
						System.out.println("How many people would you like to subtract from room 2?");
						usrInput = keyboard.next();
						try {
							Integer.parseInt(usrInput);
						} catch (Exception e) {
							System.out.println("I'm sorry, that isn't a valid response. Returning to main menu.");
							usrInput = "menu";
							break;
						}
						i = Integer.parseInt(usrInput);
						if (i > room2.getNumber()) {
							System.out.println("The room cannot contain negative numbers.");
						} else {
							for (k = 0; k < i; k++)
								room2.removeOneFromRoom();
						}
					} else {
						System.out.println("I'm sorry, that isn't a valid response. Returning to main menu.");
						usrInput = "menu";
						continue;
					}
					System.out.println("There are now " + room1.getNumber() + " in room 1 and " + room2.getNumber()
							+ " in room 2.");
					usrInput = "menu";
					continue;
				} else {
					System.out.println("I'm sorry, that isn't a valid response. Returning to main menu.");
					usrInput = "menu";
					break;
				}
			}
			case 3: {
				System.out.println(
						"There are two rooms that you can view the total capacity of; which would you like to view? (room (1) or room (2) or both rooms (3))");
				usrInput = keyboard.next();
				switch (Integer.parseInt(usrInput)) {
				case 1:
					System.out.println("There are " + room1.getNumber() + " in room 1.");
					break;
				case 2:
					System.out.println("There are " + room2.getNumber() + " in room 2.");
					break;
				case 3:
					System.out.println(
							"There are " + room1.getNumber() + " in room 1. And " + room2.getNumber() + " in room 2.");
					break;
				default: {
					System.out.println("I'm sorry, that isn't a valid response.");
				}
				}
				usrInput = "menu";
				break;
			}
			case 4: {
				System.out.println("The total occupation of both room 1 and 2 together is: "
						+ room1.getTotal(room1.getNumber(), room2.getNumber()));
				usrInput = "menu";
				break;

			}
			default: {
				System.out.println("I'm sorry, that isn't a valid response. Returning to main menu.");
				usrInput = "menu";
				break;
			}

			}

		}
	}

}
