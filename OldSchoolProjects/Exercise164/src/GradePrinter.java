import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class GradePrinter 
{
	
	/** Author - John Bartels
	 * @param args
	 */
	static Map<String, String> gradeMap = new HashMap<String, String>();
	static Set<String> names = new TreeSet<String>();
	static Set<String> lastNames = new TreeSet<String>();
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int userOption = 0;
		do
		{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter (1) to Add a Student.");
		System.out.println("Enter (2) to Remove a Student.");
		System.out.println("Enter (3) to Modify a Student's Grade.");
		System.out.println("Enter (4) to Print all Students' Grades.");
		System.out.println("Enter (5) to Exit the GradePrinter Program.");
		System.out.println("Please Enter A Menu Option: ");
		
		userOption = in.nextInt();
		
		if (userOption == 1)
		{
			// executes method to Add a student
			addStudent();
			
		}
		else if(userOption == 2)
		{
			// executes method to Remove a Student
			removeStudent();
		}
		else if(userOption == 3)
		{
			// executes method to Modify a Student's Grade.
			modifyStudentGrade();
		}
		else if(userOption == 4)
		{
			// executes method to Print all Students' Grades.
			//printAllGrades(names);
			printLastNames(lastNames);
		}
		}
		while (userOption != 5);
	}

	private static void printLastNames(Set<String> r) 
	{
		// TODO Auto-generated method stub
		for (String element : r)
		{
			
			String element2 = new String();
			String key = new String();
			String firstName = new String();
			String lastName = new String();
			element2 = element.substring(0, element.length());
			key = element;
			for (int i = 0; i < element2.length(); i++)
			{
				if (element2.charAt(i) == ' ')
				{
					int j = i;
					i++;
					firstName = element2.substring(i, element2.length());
					lastName = element2.substring(0, j);
					key = firstName + ' ' + lastName;
					break;
				}
			}
			String grade = gradeMap.get(key);
			System.out.print(element + ' ' + grade);
			System.out.println(" ");
		}
	}

	private static void printAllGrades(Set<String> s) 
	{
		// method to print all names and associated grades
		   for (String element : s)
		   {
			   String grade = gradeMap.get(element);
			   System.out.print(element + ": " + grade);
			   System.out.println(" ");
			   
		   }
	}

	private static void modifyStudentGrade() 
	{
		// TODO Auto-generated method stub
		String studentName = new String();
		String studentGrade = new String();
		Scanner kbdinput = new Scanner(System.in);
		System.out.print("Please Enter the Name of a Student for Grade Modification: ");
		studentName = kbdinput.nextLine();
		gradeMap.get(studentName);
		System.out.print("Please Enter the New Grade for the Student: ");
		studentGrade = kbdinput.nextLine();
		gradeMap.put(studentName, studentGrade);
	}

	private static void removeStudent() 
	{
		// TODO Auto-generated method stub
		String studentName = new String();
		Scanner kbdin = new Scanner(System.in);
		System.out.print("Please Enter the Name of a Student to Remove: ");
		studentName = kbdin.nextLine();
		gradeMap.remove(studentName);
		names.remove(studentName);
	}

	private static void addStudent() 
	{
		// TODO Auto-generated method stub
		Scanner kbd = new Scanner(System.in);
		String userInputName = new String();
		String lastName = new String();
		String firstName = new String();
		String lastNameFirst = new String();
		String userInputGrade = new String();
		System.out.print("Please Enter the Student's Name: ");
		userInputName = kbd.nextLine();
		System.out.print("Please Enter the Student's Grade: ");
		userInputGrade = kbd.nextLine();
		gradeMap.put(userInputName, userInputGrade);
		lastNameFirst = userInputName;
		for (int i = 0; i < userInputName.length(); i++)
		{
			
			if (userInputName.charAt(i) == ' ')
			{
				int j = i;
				i++;
				lastName = userInputName.substring(i, userInputName.length());
				firstName = userInputName.substring(0, j);
				lastNameFirst = lastName + ' ' + firstName;
				break;
			}
		}
		System.out.println(lastName);
		System.out.println(firstName);
		System.out.println(lastNameFirst);
		names.add(userInputName);
		lastNames.add(lastNameFirst);
	}

}
