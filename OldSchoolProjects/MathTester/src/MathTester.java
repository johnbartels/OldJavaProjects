import java.util.Scanner;
public class MathTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner(System.in);
	
		
		boolean MaleorFemale = false;
		System.out.println("Are you Male or Female? (M/F)");
		String sexselection = userInput.nextLine();
		
		if (sexselection.equalsIgnoreCase("M"))
		{	System.out.println("You are Male.");
			MaleorFemale = true;
		}
		else 
		System.out.print("You are Female.");
		
		String greeting = "Hello CS120 Students!";
		System.out.print("You are in the class:  ");
		System.out.println(greeting.substring(6, 12));
		
		System.out.println("Please input two integer values first, pressing enter after each successive input that has been entered.");
		System.out.println("Then, please input two non-integer values while pressing enter after each successive value inputted.");
		
		
		
		int input5 = userInput.nextInt();
		int input6 = userInput.nextInt();
		double input7 = userInput.nextDouble();
		double input8 = userInput.nextDouble();
		
		System.out.println("The following four numbers depict Absolute values of the user values.");
		System.out.print(Math.abs(input5));
		System.out.print(", ");
		System.out.print(Math.abs(input6));
		System.out.print(", ");
		System.out.print(Math.abs(input7));
		System.out.print(", ");
		System.out.println(Math.abs(input8));
		
		System.out.println("The following four numbers depict Ceiling values of the user values.");
		System.out.print(Math.ceil(input5));
		System.out.print(", ");
		System.out.print(Math.ceil(input6));
		System.out.print(", ");
		System.out.print(Math.ceil(input7));
		System.out.print(", ");
		System.out.println(Math.ceil(input8));
		
		System.out.println("The following four numbers depict Floor values of the user values.");
		System.out.print(Math.floor(input5));
		System.out.print(", ");
		System.out.print(Math.floor(input6));
		System.out.print(", ");
		System.out.print(Math.floor(input7));
		System.out.print(", ");
		System.out.println(Math.floor(input8));
		
		System.out.println("Please input two non-integer negative values.");
		
		double input9 = userInput.nextDouble();
		double input10 = userInput.nextDouble();
		
		System.out.println("The following four numbers depict the rounded values of the inputted values.");
		System.out.print(Math.round(Math.ceil(input7)));
		System.out.print(", ");
		System.out.print(Math.round(Math.floor(input8)));
		System.out.print(", ");
		System.out.print(Math.round(Math.ceil(input9)));
		System.out.print(", ");
		System.out.println(Math.round(Math.floor(input10)));
		
		System.out.println("The following two numbers depict Min and Max values of the inputted non-integer values.");
		System.out.print(Math.min(input7, input8));
		System.out.print(", ");
		System.out.println(Math.max(input7, input8));
		
		System.out.println("The following two numbers depict Power values of the user values.");
		System.out.print(Math.pow(input5, input6));
		System.out.print(", ");
		System.out.println(Math.pow(input7, input8));
		
		System.out.println("The following number is the square root of the inputted number: 225");
		System.out.println(Math.sqrt(225));
	}

}
