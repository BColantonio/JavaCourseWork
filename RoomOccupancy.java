package lab3BC;

//Create a class called RoomOccupancy that can be used to record the number of people in the rooms of a building.  
public class RoomOccupancy {

	/*
	 * The class has the following attributes: • numberInRoom – the number of people
	 * in a room • totalNumber – the total number of people in all rooms as a static
	 * variable
	 */
	private static int numberInRoom;
	private static int totalNumber;

	/*
	 * The class has the following methods: • addOneToRoom – adds a person to the
	 * room and increases the value of totalNumber • removeOneFromRoom – removes a
	 * person from the room. It will not allow the number of people in the room to
	 * go negative • getNumber – returns the number of people in the room • getTotal
	 * – a static method that returns the total number of people in all rooms.
	 */
	public void addOneToRoom() {
		this.numberInRoom++;
	}

	public void removeOneFromRoom() {
		if (this.numberInRoom > 0)
			this.numberInRoom--;
	}

	public int getNumber() {
		return numberInRoom;
	}

	public static int getTotal(int room1Total, int room2Total) {
		totalNumber = room1Total + room2Total;
		return totalNumber;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
