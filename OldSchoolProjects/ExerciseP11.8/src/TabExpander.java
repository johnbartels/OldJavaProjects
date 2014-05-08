import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;



/**
*
* @author John Bartels
*	      CS 121 Summer Session 2
*                Exercise P11.8
*	      Purpose:  This program replaces all tabs in text file with spaces.
*
*/

public class TabExpander
{
	private static String filename = null;
	private static int tabwidth = 3;
	/**
	*  Get the filename either from the commandline or directly from the user.  
	*   Open the file and begin processing it
	*/
	public static void main(String[] args)
	{

		// check the command line for parameters
		checkCommandLine(args);
		
			if (filename == null)
			{
				filename = getFileName();
			}
		
			// Process the file
			try
			{
				Scanner in = new Scanner(new FileReader(filename));
				TabReplacer replacer = new TabReplacer(in, tabwidth);
			}
			catch (FileNotFoundException e)
			{
				System.out.println("File Not Found");
				System.exit(0);
			}
			catch (IOException e)
			{
				System.out.println("Unexpected IO Exception: " + e.getMessage());
				System.exit(1);
			}
	}
	private static void checkCommandLine(String[] args) 
	{
		// TODO Auto-generated method stub
		
		if (args.length > 0) //process arguments
		{
			if (args.length == 1)
			{
				filename = args[0];
			}
			else if (args.length == 2)
			{
				filename = getFileName();
				if (args[0].equals("-t"))
				{
					tabwidth = Integer.parseInt(args[1]);
				}
				else // ill-formed command line
				{
					System.out.println("Usage: java TabExpander –t <int>");
					System.exit(2);
				}
			}
			// assume exactly three arguments
			else
			{
				// First two arguments should be “-t <int>”
				if (args[0].equals("-t"))
				{
					tabwidth = Integer.parseInt(args[1]);
				}
				// ill-formed command line
				else 
				{
					System.out.println("Usage: java TabExpander –t <int>");
					System.exit(3);
				}
				filename = args[2];
			}
		}
		
	}
	private static String getFileName()
	{
		// Prompt user for filename, get filename, return filename
		System.out.println("Enter File Name: ");
		Scanner in = new Scanner(System.in);
		String fname = in.next();
		return fname;
	}
}
