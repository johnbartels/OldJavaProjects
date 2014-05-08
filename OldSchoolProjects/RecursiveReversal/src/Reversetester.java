import java.util.Scanner;
public class Reversetester {

	/**
	 * @param args
	 */
	static String reverse1 = null;
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter a String that you would like to Recursively Reverse: ");
		
		reverse1 = in.nextLine();
		
		Reverser firstReverse = new Reverser(reverse1);
		
		System.out.println(firstReverse.getText());

	}

}
