
public class Student 
{

	private int id;
	
	private String lastName;
	
	private String firstName;
	
	private int yearStarted;
	
	private double currentGPA;
	
	public Student()
	{
		lastName = "";
		firstName = "";
		id = 0;
		yearStarted = 0;
		currentGPA = 0.0;
	}
	public Student(int id, String lastName, String firstName, int yearStarted, double currentGPA)
	{
		this.lastName = lastName;
		this.firstName = firstName;
		this.id = id;
		this.yearStarted = yearStarted;
		this.currentGPA = currentGPA;
	}
	public String getLastName()
	{
		return lastName;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public int getId()
	{
		return id;
	}
	public int getFreshmanYear()
	{
		return yearStarted;
	}
	public double getGPA()
	{
		return currentGPA;
	}
	
}
