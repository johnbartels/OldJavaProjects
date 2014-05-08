import java.util.Scanner;

public class BartelsJohnLab7Part5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		int[] intArray = new int[5];
		
		int x = 0;
		
		for (int  i = 0; i<5; i++){
			
			x = in.nextInt();
			intArray[i]=x;
			
			//System.out.println("intArray[" + i + "]" + " = " + intArray[i]);
		
		}
		
		for (int i = 0; i<5; i++)
			
			System.out.println("intArray[" + i + "]" + " = " + intArray[i]);
			
	}

}
