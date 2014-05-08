/**
 * A class that calculates a Student's Grade.
 * @author Johnny
 *
 */
public class StudentGrade {

	
	/**
	 * Constructs a studentGrade object
	 * @param assignmentScore the students grade on 100 point scale
	 */
	public StudentGrade(double assignmentScore)
	{
		percentageScore = assignmentScore;
	}
	
	/**
	 * Gets the percentage score for the student
	 * @return the associated letter grade for the student
	 */
	public String getAssignmentScore()
	{
		String goodOrBadNews;
		if (percentageScore <= 59.999)
			goodOrBadNews = "Your Letter Grade is F, you must work hard to improve.";
		else if (percentageScore <= 69.999)
			goodOrBadNews = "Your Letter Grade Is D, you will need to improve your grade to pass this class.";
		else if (percentageScore <= 79.999)
			goodOrBadNews = "Your Letter Grade is C, You have passed, but there is still much room for improvement";
		else if (percentageScore <= 89.999)
			goodOrBadNews = "Your Letter Grade is B, Good job, work harder and you could get an A!";
		else
			goodOrBadNews = "Your Letter Grade is A, Excellent work, Keep it up!!!";
		return goodOrBadNews;	
	}
	private double percentageScore;
}
