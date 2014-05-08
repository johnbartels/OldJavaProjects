
public class Contacts

{
	private String name;
	private String address;
	private String phoneNumber;
	private String notes;
	
	public Contacts()
	{
		name = "unknown";
		address = "unknown";
		phoneNumber = "unknown";
		notes = "unknown";
	}
	
	public Contacts(String initialName, String initialAddress, String initialPhoneNumber, String initialNotes)
	{
		name = initialName;
		address = initialAddress;
		phoneNumber = initialPhoneNumber;
		notes = initialNotes;
	}
	
	public String getContactsName()
	{
		return name;
	}
	
	public String getContactsAddress()
	{
		return address;
	}
	
	public String getContactsPhoneNumber()
	{
		return phoneNumber;
	}
	
	public String getContactsNotes()
	{
		return notes;
	}
}