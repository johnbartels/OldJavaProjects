import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class TabReplacer 
{

	public TabReplacer(Scanner in, int tabwidth) 
	{
		try
		{
		// TODO Auto-generated constructor stub
		FileWriter out = new FileWriter("result.out");
		// Search for tabs and replace them
		while (in.hasNextLine())
		{
			String line = in.nextLine();
		
			
			try
			{
				out.append(line = replaceTabs(line, tabwidth)+ "\n");
				
			}
			catch (IOException e)
			{
				System.out.println("Bad Output: \"" + line + "\"");
			}
		}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	private String replaceTabs(String line, int tabwidth) 
	{
		String result = new String();
		String tabSpace = new String();
		// TODO Auto-generated method stub
		// check each character in line & replace tabs with spaces
		

		
		for (int i = 0; i < line.length(); i++)
		{
			if (line.charAt(i) == '\t')
			{
				result += tabSpace;
			}
			else
			{
				result += line.charAt(i);
			}
		}
		
		return result;
	}

}
