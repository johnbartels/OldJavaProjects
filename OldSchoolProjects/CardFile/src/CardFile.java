import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileOutputStream;


public class CardFile

{
	
	static Contacts newContact = null;
	public static void main(String[] args) 
	
	{
	
		Scanner in = null;
		String inFileName = "ContactList.dat";
		
		String contactListFilename = "ContactList.dat";
		
		try 
		{
			FileWriter contactList = new FileWriter("ContactList.dat");
				BufferedWriter output = new BufferedWriter(contactList);
			output.append("I am Fine.");
			output.close();
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		addContact();
		
		Machines machine1 = new Machines("Description of Machine", "Model Number of Machine", "Repair Information for Machine", "Parts Suppliers for Machine", "Notes for Machine");
		System.out.println(machine1.getMachinesDescription());
		System.out.println(machine1.getMachinesModelNumber());
		System.out.println(machine1.getMachinesRepairInfo());
		System.out.println(machine1.getMachinesPartsSuppliers());
		System.out.println(machine1.getMachinesNotes());
		
		Employees employee1 = new Employees("John Bartels", "1413 W. Rex", "765-749-7135", "Cool Ass MothaFucka");
		System.out.println(employee1.getEmployeesAddress());
		System.out.println(employee1.getEmployeesName());
		System.out.println(employee1.getEmployeesNotes());
	
		Contacts contact1 = new Contacts("Ian Reid", "1413 W. Rex", "765-xxx-xxxx", "Financial Guru");
		
		System.out.println(contact1.getContactsAddress());
		System.out.println(contact1.getContactsName());
		System.out.println(contact1.getContactsNotes());
		//try {
			//String newContact = contact1.getContactsName();
			//contactList.append(newContact);
		//} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		//}
		
		
		Products product1 = new Products();
		
		
	}

	private static void addContact() 
	{
		// TODO Auto-generated method stub
		
		Scanner kbd = new Scanner(System.in);
		
		System.out.print("Please Enter In a Name For The New Contact:");
		String userInputName = kbd.nextLine();
		System.out.print("Please Enter In a Address For The New Contact:");
		String userInputAddress = kbd.nextLine();
		System.out.print("Please Enter In a Phone Number For The New Contact:");
		String userInputPhoneNumber = kbd.nextLine();
		System.out.print("Please Enter In Some Notes About The New Contact:");
		String userInputNotes = kbd.nextLine();
		
		Contacts newContact = new Contacts(userInputName, userInputAddress, userInputPhoneNumber, userInputNotes);
		
		System.out.println(newContact.getContactsAddress());
		System.out.println(newContact.getContactsName());
		System.out.println(newContact.getContactsNotes());
	}
}