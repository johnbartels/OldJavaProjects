import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class QuizTester
{
	private static String infilename = "";
	private static Scanner kbd = new Scanner(System.in);
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner in = null;
		FileWriter out = null;
		int numberQuestions = 0;
		int numberCorrect = 0;
		double percentageValue = 0;
		try
		{
		// Open a file
		String infilename = getInputFileName();
		in = new Scanner(new FileReader(infilename));
		String outfilename = infilename.substring(0, infilename.indexOf(".", 0)) + ".out";

			out = new FileWriter(outfilename);

			while (in.hasNextLine())
			{
				// get the line , print the line to screen,
				String line = in.nextLine();
				if (line.equals("T"))
				{
					System.out.println(in.nextLine());
					numberQuestions++;
					String userResponse = null;
					userResponse = kbd.next();
					if (userResponse == in.nextLine())
					{
						numberCorrect++;
						System.out.println("You are Correct! Congratulations");
					}
					else
						System.out.println("You are Incorrect. Press Enter for the next Question.");
				}
				else if(line.equals("N"))
				{
					System.out.println(in.nextLine());
					numberQuestions++;
					String userResponse = null;
					userResponse = kbd.next();
					double userCompare = Double.parseDouble(userResponse);
					double numberValue = Double.parseDouble(in.nextLine());
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
				else if(line.equals("S"))
				{
					System.out.println(in.nextLine());
					String choice1 = in.nextLine();
					String choice2 = in.nextLine();
					String choice3 = in.nextLine();
					String choice4 = in.nextLine();
					System.out.println(choice1);
					System.out.println(choice2);
					System.out.println(choice3);
					System.out.println(choice4);
					numberQuestions++;
					String userResponse = null;
					boolean correctResponse = false;
					userResponse = kbd.next();

					//for (int i = 0; i < )

				}
				else if(line.equals("M"))
				{

				}
				out.append('\n');
			}

			System.out.println(outfilename);
		}
		catch (FileNotFoundException e)
		{
			System.out.println("File not Found ...");
			System.exit(0);
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
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
				// TODO Auto-generated catch block
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

}
