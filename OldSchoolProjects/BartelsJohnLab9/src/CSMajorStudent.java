public class CSMajorStudent extends Student{

	private String theory;
	private String isTrack;
	private String hardware;
	private String option;
	private int age;
	private int hours;
	




	public CSMajorStudent(int id, String lastName, String firstName, int yearStarted, double currentGPA, String theory, String isTrack, String hardware)
	{
		super(id, lastName, firstName, yearStarted, currentGPA);
		this.theory = theory;
		this.isTrack = isTrack;
		this.hardware = hardware;
		this.option = option;
		this.age = age;
		this.hours = hours;
	}

	public String getTheory()
	{
		return theory;
	}

	public String getIS()
	{
		return isTrack;
	}
	public String getHardware()
	{
		return hardware;
	}

	public int getAge() {
		// TODO Auto-generated method stub
		return age;
	}

	public String getOption() {
		// TODO Auto-generated method stub
		return option;
	}

	public int getHours() {
		// TODO Auto-generated method stub
		return hours;
	}

}
