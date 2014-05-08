import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class QuizTester
{
	private static String infilename = "";
	private static Scanner kbd = new Scanner(System.in);
	private static int numberOfQuestions = 0;
	private static double percentageValue = 0;
	private static int numberCorrect = 0;
	private static Scanner in = null;
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		FileWriter out = null;
		try 
		{
		// Open a file whose name is defined by user
		infilename = getInputFileName();
		in = new Scanner(new FileReader(infilename));
		String outfilename = infilename.substring(0, infilename.indexOf(".", 0)) + "Results.txt";
	
			out = new FileWriter(outfilename);
			
			while (in.hasNextLine())
			{
				// gets next line of file and checks for T, N, S, or M which indicate the type of question
				
				String line = in.nextLine();
				if (line.equals("T"))
				{
					// calls for string comparison method for fill in the blank type questions
					getStringComparisonHandler();
				}
				else if(line.equals("N"))
				{
					// calls for numerical comparison method for questions with a numerical response
					getNumericalQuestionHandler();
				}
				else if(line.equals("S"))
				{
					// calls for Multiple choice method for questions that have only one response
					try
					{
					getSingRespMultChoiceHandler();
					}
					catch (NullPointerException e)
					{
						System.out.println("You are Supposed to enter A, B, C, or D.");
					}
				}
				else if(line.equals("M"))
				{
					// calls for Multiple choice method for questions that have more than one response
					try
					{
						getMultRespMultChoiceHandler();
					}
					catch (NullPointerException e)
					{
						System.out.println("You are Supposed to enter A, B, C, or D.");
					}
				}
				
			}
			// Results Printed to Screen and test1Results.txt file then name of result file printed to screen
			System.out.println("You had " + numberCorrect + " out of " + numberOfQuestions + " Questions Correct");
			out.append("User had " + numberCorrect + " out of " + numberOfQuestions + " Questions Correct");
			System.out.println(outfilename);
		} 
		// catch file not found error if test file that user inputs is not found
		catch (FileNotFoundException e)
		{
			System.out.println("File not Found ...");
			System.exit(0);
		}
		catch (IOException e) {
			// if exception occurs print message to screen
			e.printStackTrace();
		}
		
		finally
		{
			if (in !=null)
				in.close();
			try 
			{
				if (out !=null)
					out.close();
			} catch (IOException e) {
				// if exception occurs print message to screen
				e.printStackTrace();
			}
		}
		
	}
	private static String getInputFileName()
	{
		System.out.println("Please enter the Name of the file: ");
		Scanner in = new Scanner(System.in);
		String infilename = in.next();
		return infilename;
	}
	private static void getStringComparisonHandler() 
	{
		// acquires information for question from infile and then takes users response and compares to correct answers

		System.out.println(in.nextLine());
		String questionAnswer = in.nextLine();
		numberOfQuestions++;
		String userResponse = null;
		userResponse = kbd.next();
		if (userResponse.equalsIgnoreCase(questionAnswer))
		{
			numberCorrect++;
			System.out.println("You are Correct! Congratulations");
		}
		else
		{
			System.out.println("You are Incorrect. Press Enter for the next Question.");
			System.out.println("Correct Answer: " + questionAnswer);
			System.out.println("User Answer: " + userResponse);
		}
	}
	private static void getNumericalQuestionHandler() 
	{
		// acquires information for question from infile and then takes users response and compares to correct answer
		
		System.out.println(in.nextLine());
		numberOfQuestions++;
		double userCompare = 0;
		double  numberValue = 0;
		String userResponse = null;
		try
		{
		userResponse = kbd.next();
		userCompare = Double.parseDouble(userResponse);
		numberValue = Double.parseDouble(in.nextLine());
		}
		catch (NumberFormatException e)
		{
			System.out.println("You are supposed to input A NUMBER value!");
		}
		percentageValue = numberValue / 100;
		double upperLimit = numberValue + percentageValue;
		double lowerLimit = numberValue - percentageValue;
		if ((userCompare > lowerLimit) && (userCompare < upperLimit))
		{
			System.out.println("You are Correct! Excellent Job.");
			System.out.println("Upper Limit: " + upperLimit);
			System.out.println("Lower Limit: " + lowerLimit);
			System.out.println("User Compare: " + userCompare);
			numberCorrect++;
		}
		else 
		{
			System.out.println("You are Incorrect!  Terrible Job");
			System.out.println("Upper Limit: " + upperLimit);
			System.out.println("Lower Limit: " + lowerLimit);
			System.out.println("User Compare: " + userCompare);
		}
	}
	private static void getSingRespMultChoiceHandler() 
	{
		// TODO Auto-generated method stub
		
		String correctString = null;
		int correctResponses = 0;
		System.out.println(in.nextLine());
		String choice1 = in.nextLine();
		int choice1size = choice1.length();
		//char choice1last = choice1.charAt(choice1size);
		String choice1sub = choice1.substring(2, choice1size);
		
		String choice2 = in.nextLine();
		int choice2size = choice2.length();
		//char choice2last = choice2.charAt(choice2size);
		String choice2sub = choice2.substring(2, choice2size);
		
		String choice3 = in.nextLine();
		int choice3size = choice3.length();
		//char choice3last = choice3.charAt(choice3size);
		String choice3sub = choice3.substring(2, choice3size);
		
		String choice4 = in.nextLine();
		int choice4size = choice4.length();
		//char choice4last = choice4.charAt(choice4size);
		String choice4sub = choice4.substring(2, choice4size);
		
		System.out.println("A. " + choice1sub);
		System.out.println("B. " + choice2sub);
		System.out.println("C. " + choice3sub);
		System.out.println("D. " + choice4sub);
		if (choice1.charAt(0) == '+')
		{
			correctString = choice1sub;
			correctResponses++;
		}	
		else if (choice2.charAt(0) == '+')
		{
			correctString = choice2sub;
			correctResponses++;
		}
		else if (choice3.charAt(0) == '+')
		{
			correctString = choice3sub;
			correctResponses++;
		}
		else if (choice4.charAt(0) == '+')
		{		
			correctString = choice4sub;
			correctResponses++;
		}
		System.out.println("Number of Responses: " + correctResponses);
		numberOfQuestions++;
		String userChoice = null;
		String userResponse = null;
		
			userChoice = kbd.next();
		
		
		if (userChoice.equalsIgnoreCase("a"))
		{
			userResponse = choice1sub;
		}
		else if (userChoice.equalsIgnoreCase("b"))
		{
			userResponse = choice2sub;
		}
		else if (userChoice.equalsIgnoreCase("c"))
		{
			userResponse = choice3sub;
		}
		else if (userChoice.equalsIgnoreCase("d"))
		{
			userResponse = choice4sub;
		}
		
		if (userResponse.equalsIgnoreCase(correctString))
		{
			System.out.println("You are Correct!  Excellent Job");
			numberCorrect++;
		}
		else
		{
			System.out.println("You are Incorrect.  Terrible Job.");
			System.out.println("Correct Response:" + correctString + " String Length: " + correctString.length());
			
			System.out.println("Your Response: " + userResponse + " String Length: " + userResponse.length());
		}
	}
	private static void getMultRespMultChoiceHandler() 
	{
		// TODO Auto-generated method stub
	
		String correctString1 = null;
		String correctString2 = null;
		String correctString3 = null;
		String correctString4 = null;
		int multiChoiceCorrect = 0;
		int correctResponses = 0;
		System.out.println(in.nextLine());
		String choice1 = in.nextLine();
		int choice1size = choice1.length();
		String choice1sub = choice1.substring(2, choice1size);
		
		String choice2 = in.nextLine();
		int choice2size = choice2.length();
		String choice2sub = choice2.substring(2, choice2size);
		
		String choice3 = in.nextLine();
		int choice3size = choice3.length();
		String choice3sub = choice3.substring(2, choice3size);
		
		String choice4 = in.nextLine();
		int choice4size = choice4.length();
		String choice4sub = choice4.substring(2, choice4size);
		
		System.out.println("A. " + choice1sub);
		System.out.println("B. " + choice2sub);
		System.out.println("C. " + choice3sub);
		System.out.println("D. " + choice4sub);
			if (choice1.charAt(0) == '+')
			{
				correctString1 = choice1sub;
				correctResponses++;
				
			}	
			if (choice2.charAt(0) == '+')
			{
				correctString2 = choice2sub;
				correctResponses++;
				
			}
			if (choice3.charAt(0) == '+')
			{
				correctString3 = choice3sub;
				correctResponses++;
			}
			if (choice4.charAt(0) == '+')
			{		
				correctString4 = choice4sub;
				correctResponses++;
			}
		numberOfQuestions++;
		String userResponse1 = null;
		String userResponse2 = null;
		String userChoice1 = null;
		String userChoice2 = null;
		System.out.println("Number of Correct Responses: " + correctResponses);
		System.out.println("enter first response:");
		userChoice1 = kbd.next();
		System.out.println("enter second response: ");
		userChoice2 = kbd.next();
		if (userChoice1.equalsIgnoreCase("a"))
		{
			userResponse1 = choice1sub;
		}
		else if (userChoice1.equalsIgnoreCase("b"))
		{
			userResponse1 = choice2sub;
		}
		else if (userChoice1.equalsIgnoreCase("c"))
		{
			userResponse1 = choice3sub;
		}
		else if (userChoice1.equalsIgnoreCase("d"))
		{
			userResponse1 = choice4sub;
		}
		if (userChoice2.equalsIgnoreCase("a"))
		{
			userResponse2 = choice1sub;
		}
		else if (userChoice2.equalsIgnoreCase("b"))
		{
			userResponse2 = choice2sub;
		}
		else if (userChoice2.equalsIgnoreCase("c"))
		{
			userResponse2 = choice3sub;
		}
		else if (userChoice2.equalsIgnoreCase("d"))
		{
			userResponse2 = choice4sub;
		}
		
			if (userResponse1.equalsIgnoreCase(correctString1) || userResponse1.equalsIgnoreCase(correctString2) || userResponse1.equalsIgnoreCase(correctString3) || userResponse1.equalsIgnoreCase(correctString4))
			{
				multiChoiceCorrect++;

			}
			if (userResponse2.equalsIgnoreCase(correctString1) || userResponse2.equalsIgnoreCase(correctString2) || userResponse2.equalsIgnoreCase(correctString3) || userResponse2.equalsIgnoreCase(correctString4))
			{
				multiChoiceCorrect++;

			}
				
			if (multiChoiceCorrect == correctResponses)
			{
				numberCorrect++;
				System.out.println("You Answered Correctly! Great Job!");
				System.out.println("correct strings " + correctString1 + " string 2: " + correctString2 + " string 3: " + correctString3 + " string 4: " + correctString4);
				System.out.println("# of responses: " + correctResponses);
				System.out.println("number correct: " + multiChoiceCorrect);
			}
			else
			{
				System.out.println("Sorry you only answered " + multiChoiceCorrect + " out of " + correctResponses + " correctly.");
				
				System.out.println("correct strings " + correctString1 + " string 2: " + correctString2 + " string 3: " + correctString3 + " string 4: " + correctString4);
				System.out.println("# of responses: " + correctResponses);
				System.out.println("number correct: " + multiChoiceCorrect);
				System.out.println("user Responses " + userResponse1 + " 2nd response: " + userResponse2);
			}
		
	}
}
