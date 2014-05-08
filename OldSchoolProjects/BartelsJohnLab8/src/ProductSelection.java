import java.util.Scanner;

public class ProductSelection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int userchoice = 0;
			do
			{
				Scanner in = new Scanner(System.in);
				System.out.println("Please select one of the following options:");
				System.out.println("Select 1 to create a new account");
				System.out.println("Select 2 to search for an existing account");
				System.out.println("Select 3 to exit the program");
		
				userchoice = in.nextInt();
		
				if (userchoice == 1)
					System.out.println("You have chosen option number 1");
				else if (userchoice == 2)
					System.out.println("You have chosen option number 2");
				else 
					System.out.println("Thank you for using the program.");
		
		}while (userchoice != 3);
		
	}

}
