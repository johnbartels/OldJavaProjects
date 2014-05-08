import java.util.Scanner;


public class GetMapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Acquiring Source Coordinates...");
		
		getSourceCoordinates();
		
		getDestination();
		
		System.out.println("Acquiring Route with given Coordinates...");


	}

	private static String getSourceCoordinates()
	{
		return null;
	}

	private static String getDestination()
	{
		System.out.println("Destinations can be entered in the form of Room Number, Building Name, Intersection, or Item of Interest.");
		System.out.println("Items of Interest include Bathrooms, Vending Machines, Pop Machines, Public Phones, ATM Machines, Wi-Fi Hot-Spots");
		System.out.print("Please Enter Your Destination:  ");
		Scanner in = new Scanner(System.in);
		String userDestination = in.nextLine();
		getDestCoordinates(userDestination);
		
		System.out.println("Acquiring Destination Coordinates...");

		return null;
	}

	private static String getDestCoordinates(String n)
	{
		String destinationCoordinates = "";

		String destIndexValue = n;

		return null;
		//return destinationCoordinates;
	}
	
}