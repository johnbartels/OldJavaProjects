import java.util.Scanner;
public class BartelsJohnLab7Part1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		int x = 0;
		int counter = 1;
		int max = -1000;
		double avgTotal = 0;
		
		do{
			System.out.println("Please input a Positive number.");
			x = in.nextInt();
			if (x>max)
				max = x;
			if (x>0){
				counter = counter + 1;
				avgTotal = avgTotal + x;
			}
		}
		while (counter<=3);
		
		
		System.out.println("The maximum of the inputted numbers is:  " + max);
		System.out.println("The average of the inputted numbers is:  " + avgTotal/3);
	}

}
