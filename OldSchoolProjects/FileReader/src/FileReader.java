import java.io.*; 
import java.util.ArrayList;
class FileReaderDemo 
{ 
	static ArrayList<Contacts> contactArrayList = new ArrayList<Contacts>();
	static ArrayList<Employees> employeeArrayList = new ArrayList<Employees>();
	public static void main(String args[]) throws Exception 
	{ 
		FileReader contactList = new FileReader("ContactList.dat");
		FileReader employeeList = new FileReader("EmployeeList.dat");
		
		BufferedReader br = new BufferedReader(contactList);
		BufferedReader br2 = new BufferedReader(employeeList);
		
		ArrayList<String> inFileContactList = new ArrayList<String>();
		ArrayList<String> inFileEmployeeList = new ArrayList<String>();
		
		String s;
		//int contactIndexLocation = 0;
		//int employeeIndexLocation = 0;
		
		while((s = br.readLine()) != null) 
		{ 
			
			inFileContactList.add(s);
			System.out.println(s); 
		}
		
		while((s = br2.readLine()) != null) 
		{ 
			
			inFileEmployeeList.add(s);
			System.out.println(s); 
		}
		employeeList.close();
		contactList.close(); 
		
		for (int i =0; i < inFileContactList.size();i++)
		{
			String x = inFileContactList.get(i);
			autoAddContact(x);
			
		}
		
		for (int i =0; i < inFileEmployeeList.size();i++)
		{
			String x = inFileEmployeeList.get(i);
			autoAddEmployee(x);
			
		}
		// This portion of the code identifies the line index location for each category
		// This index location is then applied as an integer for quick referencing later on
		//int machineryIndexLocation = 0;
		//int productIndexLocation = 0;
		/**for (int i = 0; i<inFileArrayList.size(); i++)
		{
			String x = inFileArrayList.get(i);
			
			
			if (x.equalsIgnoreCase("Contacts"))
			{
				contactIndexLocation = i;
			}
			else if (x.equalsIgnoreCase("Employees"))
			{
				employeeIndexLocation = i;
				
			}
			else if (x.equalsIgnoreCase("Machinery"))
			{
				machineryIndexLocation = i;
			}
			else if (x.equalsIgnoreCase("Products"))
			{
				productIndexLocation = i;
			}
			// the next two lines will print the index location and String that has been 
			// inputed into that index location from the inFileArrayList
			System.out.print(i);
			System.out.println(x);
			
		}
		
		
		
		// method here to begin sorting of inFileArray of Strings into Four Arrays of Strings
		for (int k = contactIndexLocation+1; k < employeeIndexLocation; k++)
		{
			String inContString = inFileArrayList.get(k);
			System.out.println(inContString);
			autoAddContact(inContString);
		}
		
		for (int l = employeeIndexLocation+1; l < machineryIndexLocation; l++)
		{
			String inEmpString = inFileArrayList.get(l);
			System.out.println(inEmpString);
			autoAddEmployee(inEmpString);
			
			
		}
		**/
		
		
		Contacts tempContact = contactArrayList.get(0);
		Contacts tempContact2 = contactArrayList.get(1);
		Contacts tempContact3 = contactArrayList.get(2);
		Contacts tempContact4 = contactArrayList.get(3);
		
		//Employees tempEmployee = employeeArrayList.get(0);
		//System.out.println(tempEmployee.getEmployeesName());
		//System.out.println(tempEmployee.getEmployeesAddress());
		//System.out.println(tempEmployee.getEmployeesPhoneNumber());
		//System.out.println(tempEmployee.getEmployeesNotes());
		
		System.out.println(tempContact.getContactsName());
		System.out.println(tempContact.getContactsAddress());
		System.out.println(tempContact.getContactsPhoneNumber());
		System.out.println(tempContact.getContactsNotes());
		
		System.out.println(tempContact2.getContactsName());
		System.out.println(tempContact2.getContactsAddress());
		System.out.println(tempContact2.getContactsPhoneNumber());
		System.out.println(tempContact2.getContactsNotes());
		
		System.out.println(tempContact3.getContactsName());
		System.out.println(tempContact3.getContactsAddress());
		System.out.println(tempContact3.getContactsPhoneNumber());
		System.out.println(tempContact3.getContactsNotes());
		
		System.out.println(tempContact4.getContactsName());
		System.out.println(tempContact4.getContactsAddress());
		System.out.println(tempContact4.getContactsPhoneNumber());
		System.out.println(tempContact4.getContactsNotes());
		
		//System.out.println(contactIndexLocation);
		//System.out.println(machineryIndexLocation);
		//System.out.println(employeeIndexLocation);
		//System.out.println(productIndexLocation);
		
		
	}

	private static void autoAddEmployee(String inEmpString) 
	{
		// method to identify the location of quotation marks within the Current Working String
		// Location index is then used to create substrings that are associated with given entries
		// Substrings are used to create temporary contact which is then added to Contact ArrayList
		ArrayList<Integer> lineIndexArray = new ArrayList<Integer>();
		
		for (int i =0; i < inEmpString.length(); i++)
		{
			// use irregular character µ by entering key combination Alt + 1254
			if(inEmpString.charAt(i) == 'µ')
			{
				lineIndexArray.add(i);
				System.out.println(i);
				
			}
		}
		String inFileEmployeeName = inEmpString.substring(lineIndexArray.get(0)+1, lineIndexArray.get(1));
		String inFileEmployeeAddress = inEmpString.substring(lineIndexArray.get(2)+1, lineIndexArray.get(3));
		String inFileEmployeePhoneNumber = inEmpString.substring(lineIndexArray.get(4)+1, lineIndexArray.get(5));
		String inFileEmployeeNotes = inEmpString.substring(lineIndexArray.get(6)+1, lineIndexArray.get(7));
		Employees inputEmployee = new Employees(inFileEmployeeName, inFileEmployeeAddress, inFileEmployeePhoneNumber, inFileEmployeeNotes);
		employeeArrayList.add(inputEmployee);
		System.out.println(inFileEmployeeName);
		System.out.println(inFileEmployeeAddress);
		System.out.println(inFileEmployeePhoneNumber);
		System.out.println(inFileEmployeeNotes);
		System.out.println(lineIndexArray.get(0));
		System.out.println(lineIndexArray.get(1));
		System.out.println(lineIndexArray.get(2));
		System.out.println(lineIndexArray.get(3));
		System.out.println(lineIndexArray.get(4));
		System.out.println(lineIndexArray.get(5));
		System.out.println(lineIndexArray.get(6));
		System.out.println(lineIndexArray.get(7));
	}

	private static void autoAddContact(String inContString) 
	{
		
		// method to identify the location of quotation marks within the Current Working String
		// Location index is then used to create substrings that are associated with given entries
		// Substrings are used to create temporary contact which is then added to Contact ArrayList
		ArrayList<Integer> lineIndexArray = new ArrayList<Integer>();
		
		for (int i =0; i < inContString.length(); i++)
		{
			// use irregular character µ by entering key combination Alt + 1254
			if(inContString.charAt(i) == 'µ')
			{
				lineIndexArray.add(i);
				System.out.println(i);
				
			}
		}
		// divide String passed into method into Contact Fields, then apply these to new contact
		// then add this new contact to the contact ArrayList
		String inFileContactName = inContString.substring(lineIndexArray.get(0)+1, lineIndexArray.get(1));
		String inFileContactAddress = inContString.substring(lineIndexArray.get(2)+1, lineIndexArray.get(3));
		String inFileContactPhoneNumber = inContString.substring(lineIndexArray.get(4)+1, lineIndexArray.get(5));
		String inFileContactNotes = inContString.substring(lineIndexArray.get(6)+1, lineIndexArray.get(7));
		Contacts inputContact = new Contacts(inFileContactName, inFileContactAddress, inFileContactPhoneNumber, inFileContactNotes);
		contactArrayList.add(inputContact);
		System.out.println(inFileContactName);
		System.out.println(inFileContactAddress);
		System.out.println(inFileContactPhoneNumber);
		System.out.println(inFileContactNotes);
		System.out.println(lineIndexArray.get(0));
		System.out.println(lineIndexArray.get(1));
		System.out.println(lineIndexArray.get(2));
		System.out.println(lineIndexArray.get(3));
		System.out.println(lineIndexArray.get(4));
		System.out.println(lineIndexArray.get(5));
		System.out.println(lineIndexArray.get(6));
		System.out.println(lineIndexArray.get(7));
	}

	
}