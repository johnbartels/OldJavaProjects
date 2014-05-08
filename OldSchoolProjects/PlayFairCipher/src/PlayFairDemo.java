import java.util.Scanner;


public class PlayFairDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// hello i am john
		Scanner in = new Scanner(System.in);
		String key = new String();
		System.out.println("Please enter key value in all caps: ");
		key = in.nextLine();
		PlayFairCipher cipher1 = new PlayFairCipher(key);
		PlayFairCipher.printCharacterMatrix();
	}

}
