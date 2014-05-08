import java.util.Scanner;
public class SwitchTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		int choice = 0;
		System.out.println("Please input an option value.");
		choice = in.nextInt();
		switch (choice)
		{
		case 1:
			System.out.println("choice made is one.");
			break;
		case 2:
			System.out.println("choice made is two.");
			break;
		case 3:
			System.out.println("choce made is three.");
			break;
		case 4:
			System.out.println("choice made is four.");
			break;
		default:
			System.out.println("We do not have that option.");
			
		
		
		}
	}

}
