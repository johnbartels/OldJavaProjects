import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class ManageXML {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub

		FileReader XMLfile = new FileReader("XMLexample.txt");
		
		BufferedReader br = new BufferedReader(XMLfile);
		
		ArrayList<String> inFileXMLStringList = new ArrayList<String>();
		ArrayList<String> fromXMLlocation = new ArrayList<String>();
		
		ArrayList<Integer> temperatureIndexLocations = new ArrayList<Integer>();
		ArrayList<Integer> timelayoutIndexLocations = new ArrayList<Integer>();
		ArrayList<Integer> timelayout2IndexLocations = new ArrayList<Integer>();
		ArrayList<Integer> locationIndexLocations = new ArrayList<Integer>();
		ArrayList<Integer> windSpdIndexLocations = new ArrayList<Integer>();
		ArrayList<Integer> dayCheckIndexLocations = new ArrayList<Integer>();
		
		ArrayList<String> temperatureStringArray = new ArrayList<String>();
		ArrayList<String> timelayoutMainStringArray = new ArrayList<String>();
		ArrayList<String> timelayout1StringArray = new ArrayList<String>();
		ArrayList<String> timelayout2StringArray = new ArrayList<String>();
		ArrayList<String> timelayout3StringArray = new ArrayList<String>();
		ArrayList<String> timelayout2inDaysStringArray = new ArrayList<String>();
		ArrayList<String> locationStringArray = new ArrayList<String>();
		ArrayList<String> windSpdStringArray = new ArrayList<String>();
		
		String s;
		
		while((s = br.readLine()) != null) 
		{ 
			
			inFileXMLStringList.add(s);
			
			System.out.print(inFileXMLStringList.indexOf(s));
			
			System.out.println(s); 
			
		}
		
		XMLfile.close();
		
		
		
		String tempBeginIndex = "<temperature";
		String tempEndIndex = "/temperature";
		String timelayoutBeginIndex = "<time-layout";
		String timelayoutEndIndex = "<parameters";
		String locationBeginIndex = "<location";
		String locationEndIndex = "moreWeatherInformation";
		String windSpdBeginIndex = "<wind-speed";
		String windSpdEndIndex = "</wind-speed";
		
		
		for (int i = 0; i < inFileXMLStringList.size(); i++)
		{
			String tempString = inFileXMLStringList.get(i);
			
			if (tempString.contains(tempBeginIndex))
			{
				temperatureIndexLocations.add(inFileXMLStringList.indexOf(tempString));
			}
			else if (tempString.contains(tempEndIndex))
			{
				temperatureIndexLocations.add(inFileXMLStringList.indexOf(tempString));
			}
			else if (tempString.contains(timelayoutBeginIndex))
			{
				timelayoutIndexLocations.add(inFileXMLStringList.indexOf(tempString));
			}
			else if (tempString.contains(timelayoutEndIndex))
			{
				timelayoutIndexLocations.add(inFileXMLStringList.indexOf(tempString));
			}
			else if (tempString.contains(locationBeginIndex))
			{
				locationIndexLocations.add(inFileXMLStringList.indexOf(tempString));
			}
			else if (tempString.contains(locationEndIndex))
			{
				locationIndexLocations.add(inFileXMLStringList.indexOf(tempString));
			}
			else if (tempString.contains(windSpdBeginIndex))
			{
				windSpdIndexLocations.add(inFileXMLStringList.indexOf(tempString));
			}
			else if (tempString.contains(windSpdEndIndex))
			{
				windSpdIndexLocations.add(inFileXMLStringList.indexOf(tempString));
			}
			
		}
		
		
		// Adds all strings between two Previously Identified Index Locations to a new Array
		// Specifically Dedicated to that Particular Information
		
		for (int i = temperatureIndexLocations.get(0);i < temperatureIndexLocations.get(1); i++)
		{
			temperatureStringArray.add(inFileXMLStringList.get(i));
		}
		
		// Prints Temperature Information from Temperature Array List
		
		for (int i = 0; i < temperatureStringArray.size(); i++)
		{
			System.out.println(temperatureStringArray.get(i));
		}
		
		// Adds all strings between two Previously Identified Index Locations to a new Array
		// Specifically Dedicated to that Particular Information
		
		for (int i = timelayoutIndexLocations.get(0);i < timelayoutIndexLocations.get(timelayoutIndexLocations.size()-1); i++)
		{
			timelayoutMainStringArray.add(inFileXMLStringList.get(i));
		}
		
		timelayout2inDaysStringArray.add(timelayoutMainStringArray.get(2));
		timelayout2inDaysStringArray.add(timelayoutMainStringArray.get(4));
		timelayout2inDaysStringArray.add(timelayoutMainStringArray.get(6));
		timelayout2inDaysStringArray.add(timelayoutMainStringArray.get(8));
		timelayout2inDaysStringArray.add(timelayoutMainStringArray.get(10));
		timelayout2inDaysStringArray.add(timelayoutMainStringArray.get(12));
		
		
		// Prints Time-Layout Information from TimeLayout Array List
		
		for (int i = 0; i < timelayoutMainStringArray.size(); i++)
		{
			System.out.println(timelayoutMainStringArray.get(i));
		}
		
		// Adds all strings between two Previously Identified Index Locations to a new Array
		// Specifically Dedicated to Location Information
		
		for (int i = locationIndexLocations.get(0);i < locationIndexLocations.get(locationIndexLocations.size()-1); i++)
		{
			locationStringArray.add(inFileXMLStringList.get(i));
		}
		
		// Prints Location Information from Location Array List
		// trimmed to not print <location and </location
		
		for (int i = 1; i < locationStringArray.size()-1; i++)
		{
			System.out.println(locationStringArray.get(i));
		}
		
		// Adds all strings between two Previously Identified Index Locations to a new Array
		// Specifically Dedicated to Wind Speed Information
		
		for (int i = windSpdIndexLocations.get(0);i < windSpdIndexLocations.get(windSpdIndexLocations.size()-1); i++)
		{
			windSpdStringArray.add(inFileXMLStringList.get(i));
		}
		
		// Prints Wind Speed Information from Location Array List
		
		System.out.println("Here is the Wind Speed Array Information:");
		
		for (int i = 1; i < windSpdStringArray.size(); i++)
		{
			System.out.println(windSpdStringArray.get(i));
		}
		
		
		// Helps Identify Beginning and Ending Index Locations for Different Array Lists
		System.out.println("Wind Speed Index Locations:");
		
		for (int i = 0; i < windSpdIndexLocations.size(); i++)
		{
			System.out.print(i);
			System.out.println(windSpdIndexLocations.get(i));
		}
		
		System.out.println();
		
		
		
		for (int i = 0; i < temperatureStringArray.size(); i++)
		{
			//System.out.print(timelayout2inDaysStringArray.get(i));
		
			System.out.print(temperatureStringArray.get(i));
	
			System.out.println();
		}
		
		
		String timeLayout1 = "k-p24h-n6-1";
		String timeLayout2 = "k-p3h-n18-2";
		String timeLayout3 = "k-p1h-n61-3";
		
		for (int i = 0; i < timelayoutMainStringArray.size(); i++)
		{
			
			String tempString = timelayoutMainStringArray.get(i);
			
			if (tempString.contains(timeLayout1))
			{
				timelayout2IndexLocations.add(timelayoutMainStringArray.indexOf(tempString));
			}
			else if (tempString.contains(timeLayout2))
			{
				timelayout2IndexLocations.add(timelayoutMainStringArray.indexOf(tempString));
			}
			else if (tempString.contains(timeLayout3))
			{
				timelayout2IndexLocations.add(timelayoutMainStringArray.indexOf(tempString));
			}
			
		}
		System.out.println();
		System.out.println("   " + temperatureStringArray.get(0));
		System.out.println("              " + temperatureStringArray.get(1));
		System.out.println();
		
		for (int i = 0; i < timelayout2inDaysStringArray.size(); i++)
		{
			System.out.print(timelayout2inDaysStringArray.get(i));
			System.out.println(temperatureStringArray.get(i+2));
		}
		
		// Prints index locations for timelayout2 Index Array List
		
		for (int i = 0; i < timelayout2IndexLocations.size(); i++)
		{
			System.out.println(timelayout2IndexLocations.get(i));
		}
		
		
		// next following statements split up Time Array into three different Time Arrays
		
		String timelayouttemp;
		for (int i = 0; i < timelayout2IndexLocations.get(1); i++)
		{
			timelayouttemp = timelayoutMainStringArray.get(i);
			
			timelayout1StringArray.add(timelayouttemp);
			
			
		}
		for (int i = 16; i < timelayout2IndexLocations.get(2); i++)
		{
			timelayouttemp = timelayoutMainStringArray.get(i);
			
			timelayout2StringArray.add(timelayouttemp);
		}
		for (int i = 37; i < timelayoutMainStringArray.size(); i++)
		{
			timelayouttemp = timelayoutMainStringArray.get(i);
			
			timelayout3StringArray.add(timelayouttemp);
		}
		
		// the following statements will print out the split up time layouts
		
		System.out.println("Here is the First Time Layout Data Array");
		for (int i = 0; i < timelayout1StringArray.size(); i++)
		{
			System.out.println(timelayout1StringArray.get(i));
		}
		System.out.println("Here is the Second Time Layout Data Array");
		for (int i = 0; i < timelayout2StringArray.size()-2; i++)
		{
			System.out.print(timelayout2StringArray.get(i));
			System.out.println(windSpdStringArray.get(i+1));
		}
		System.out.println("Here is the Third Time Layout Data Array");
		for (int i = 0; i < timelayout3StringArray.size(); i++)
		{
			System.out.println(timelayout3StringArray.get(i));
		}
		System.out.println(inFileXMLStringList.get(63));
	}

}
