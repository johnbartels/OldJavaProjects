import java.util.Scanner;
public class BartelsJohnLab7part7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner in= new Scanner(System.in);
		
		final double pi = 3.14159;
		int x=0;
		
		System.out.println("Please input the radius value: ");
		x = in.nextInt();
		
		System.out.println("The area of radius " + x + " is = " + pi * Math.pow(x, 2));
		
		System.out.println("The area of radius " + x + " is = " + Math.PI * Math.pow(x, 2));
	}

}
