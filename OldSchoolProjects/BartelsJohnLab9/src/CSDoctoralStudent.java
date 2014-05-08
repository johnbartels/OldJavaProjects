
public class CSDoctoralStudent extends CSGraduateStudent
{

	private String supervisor;
	private String dissertationTopic;
	
	public CSDoctoralStudent()
	{
		super();
		supervisor = "unknown";
		dissertationTopic = "unknown";
	}
	public CSDoctoralStudent(int id, String lastName, String firstName, int yearStarted, double currentGPA, String concentration, String supervisor, String dissertationTopic)
	{
		super(id, lastName, firstName, yearStarted, currentGPA, concentration);
		this.supervisor = supervisor;
		this.dissertationTopic = dissertationTopic;
		
	}
	public String getSupervisor()
	{
		return supervisor;
	}
	public String getDissertationTopic()
	{
		return dissertationTopic;
	}
	
}