
public class CSGraduateStudent extends Student
{

	private String concentration;
	
	public CSGraduateStudent()
	{
		super();
		concentration = "unknown";
	}
	public CSGraduateStudent(int id, String lastName, String firstName, int yearStarted, double currentGPA, String concentration)
	{
		super(id, lastName, firstName, yearStarted, currentGPA);
		this.concentration = concentration;
		
	}
	public String getConcentration()
	{
		return concentration;
	}
	
}