package inclasswk3BC;

public class SalesPerson {
	private String firstName;
	private String lastName;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}	
	
	public void print()
	{
		String fName = this.getFirstName();
		String lName = this.getLastName();
		System.out.println(fName + " " + lName);
	}
	
	public boolean equals(SalesPerson instance)
	{
		if (this.firstName.contains(instance.firstName) && this.firstName.contains(instance.lastName))
		{
			System.out.println("These sales people match.");
			return true;	
		}
		else
		{
			System.out.println("These sales people do not match");
			return false;
		}
		
	}

}
