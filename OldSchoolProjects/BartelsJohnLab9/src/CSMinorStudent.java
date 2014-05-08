public class CSMinorStudent extends Student{

	private String major;
	private String option;

	public CSMinorStudent()
	{
		super();
		major = "unknown";
		option = "unknown";
	}

	public CSMinorStudent(int id, String lastName, String firstName, int yearStarted, double currentGPA, String major, String option)
	{
		super(id, lastName, firstName, yearStarted, currentGPA);
		this.major = major;
		this.option = option;
		
	}

	public String getMajor()
	{
		return major;
	}

	public String getOption()
	{
		return option;
	}

}
