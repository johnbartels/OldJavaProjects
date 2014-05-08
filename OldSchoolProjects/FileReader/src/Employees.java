
public class Employees

{
	private String name;
	private String address;
	private String phoneNumber;
	private String notes;
	
	public Employees()
	{
		name = "unknown";
		address = "unknown";
		phoneNumber = "unknown";
		notes = "unknown";
	}
	
	public Employees(String intialName, String intialAddress, String initialPhoneNumber, String initialNotes)
	{
		name = intialName;
		address = intialAddress;
		phoneNumber = initialPhoneNumber;
		notes = initialNotes;
	}
	
	public String getEmployeesName()
	{
		return name;
	}
	
	public String getEmployeesAddress()
	{
		return address;
	}
	
	public String getEmployeesPhoneNumber()
	{
		return phoneNumber;
	}
	
	public String getEmployeesNotes()
	{
		return notes;
	}

}