
public class StudentTester 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		
		Student firstNewStudent = new Student(500524, "Bartels", "John", 2004, 3.5);
		
		System.out.println("The new student is " + firstNewStudent.getFirstName() + " " + firstNewStudent.getLastName() + " Student ID#: " + firstNewStudent.getId() + " Student's Starting Year: " + firstNewStudent.getFreshmanYear());
		System.out.println();
		
		CSMinorStudent firstCSMinorStudent = new CSMinorStudent(500524, "Bartels", "John", 2004, 3.5, "Computer Science", "Computer Technology");
		System.out.println("The new CS Minor student is " + firstCSMinorStudent.getFirstName() + " " + firstCSMinorStudent.getLastName() + " Student ID#: " + firstCSMinorStudent.getId() + " Student's Starting Year: " + firstCSMinorStudent.getFreshmanYear() + " Student Major: " + firstCSMinorStudent.getMajor() + " Student Option: " + firstCSMinorStudent.getOption());
		
		CSMajorStudent firstCSMajorStudent = new CSMajorStudent(500524, "Bartels", "John", 2004, 3.5, "Practical Use", "isTrack", "All Hardware");
		System.out.println("The new CS Major student is " + firstCSMajorStudent.getFirstName() + " " + firstCSMajorStudent.getLastName() + " Student ID#: " + firstCSMajorStudent.getId() + " Student's Starting Year: " + firstCSMajorStudent.getFreshmanYear() + " Student Theory: " + firstCSMajorStudent.getTheory() + " Student IS: " + firstCSMajorStudent.getIS() + " Student HardWare: " + firstCSMajorStudent.getHardware());
		
		CSGraduateStudent firstNewGraduateStudent = new CSGraduateStudent(500524, "Bartels", "John", 2004, 3.5, "Theory");
		
		System.out.println("The new CS Graduate student is " + firstNewGraduateStudent.getFirstName() + " " + firstNewGraduateStudent.getLastName() + " Student ID#: " + firstNewGraduateStudent.getId() + " Student's Starting Year: " + firstNewGraduateStudent.getFreshmanYear() + " Student Concentration: " + firstNewGraduateStudent.getConcentration());
		System.out.println();
		
		CSDoctoralStudent firstNewDoctoralStudent = new CSDoctoralStudent(500524, "Bartels", "John", 2004, 3.5, "Application", "Dr. Supervisor", "The Practical Applications of Machine and Microprocessor Inerfacing");
		
		System.out.println("The new CS Doctoral student is " + firstNewDoctoralStudent.getFirstName() + " " + firstNewDoctoralStudent.getLastName() + " Student ID#: " + firstNewDoctoralStudent.getId() + " Student's Starting Year: " + firstNewDoctoralStudent.getFreshmanYear() + " Student Concentration: " + firstNewDoctoralStudent.getConcentration() + " Student Supervisor: " + firstNewDoctoralStudent.getSupervisor() + " Student Dissertation Topic: " + firstNewDoctoralStudent.getDissertationTopic());
		System.out.println();

	}

}
