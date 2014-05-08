import java.util.Scanner;
/**
 * This program prints the students letter grade and advice
 * @author Johnny
 *
 */
public class StudentGradeTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner in = new Scanner(System.in);
	
		boolean wouldYouLikeToContinue = false;
		
		/*
			System.out.println("Would you like to Continue Grading? (Y/N):");
				
				Scanner contOrNot = new Scanner(System.in);
		
		String keepgoing = contOrNot.nextLine();
		
		while (keepgoing.equalsIgnoreCase("Y"))
		{
			System.out.println("Would you like to Continue Grading? (Y/N):");
			
			keepgoing = contOrNot.nextLine();
			
			
		}
		*/
		do{
		
		System.out.println("Would you like to Continue Grading? (Y/N):");
		
		String keepgoing = in.next();
		
		if (keepgoing.equalsIgnoreCase("Y"))
		{	
			System.out.println("You have chosen to continue.  Press enter and then enter in the next grade.");
			
			System.out.println("Enter a Student's Percentage Score to retrieve their Letter Grade");

			double assignmentScore = in.nextDouble();
				
				StudentGrade student1 = new StudentGrade(assignmentScore);
		
					System.out.println(student1.getAssignmentScore());
		
					wouldYouLikeToContinue = true;
		
		}
		
			else
			System.out.println("Thank you for using the Student Grader Program.");
			wouldYouLikeToContinue = false;
			System.exit(0);
		}
			while (wouldYouLikeToContinue = true);
		}
		
	}

	

