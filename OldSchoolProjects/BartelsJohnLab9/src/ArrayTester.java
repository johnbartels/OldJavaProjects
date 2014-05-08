import java.util.Scanner;
import java.util.ArrayList;
public class ArrayTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int[] intArray = new int[6];
		int userInput = 0;
		int loopCounter = 0;
		ArrayList<Integer> intList = new ArrayList<Integer>();
		int temp = 0;
		boolean found = false;
		
		for (int i =0; i < 6; i++)
		{
			System.out.println("Please input the value for " + i + " location: ");
			userInput = in.nextInt();
			intArray[i] = userInput;
		}
		
		for (int i = 0; i < 5; i++)
		{
		
			for (int j = i; j < 6; j++)
			{
				if (intArray[i] > intArray[j])
				{
					temp = intArray[i];
					intArray[i] = intArray[j];
					intArray[j] = temp;
				}
				
			}
			
		}
		System.out.println("first number: " + intArray[0]);
		System.out.println("second number: " + intArray[1]);
		System.out.println("third number: " + intArray[2]);
		System.out.println("fourth number: " + intArray[3]);
		System.out.println("fifth number: " + intArray[4]);
		System.out.println("sixth number: " + intArray[5]);
		
		System.out.println("What number would you like to search for?");
		userInput = in.nextInt();
		
		for (int i = 0; i < 6; i++)
		{
			if (intArray[i] == userInput)
				found = true;
		}
		if (found == true)
			System.out.println("We have this number.");
		else
			System.out.println("We do not have this number");
	}

}
