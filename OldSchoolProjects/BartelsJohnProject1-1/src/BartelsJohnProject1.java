import javax.swing.JOptionPane;
import java.util.Random;

public class BartelsJohnProject1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		// Ask the user for his or her name and then display greeting
		
		String name = JOptionPane.showInputDialog(null, "What is your First and Last Name?");
		JOptionPane.showMessageDialog(null, "Hello " + name + ", I hope you are doing well today.");
		
		// Ask the user for their weekly work hours and parse to numeric value
		
		String weeklyHours = JOptionPane.showInputDialog(null, "How many hours did you work last week?");
		int hours = Integer.parseInt(weeklyHours);
		
		// Ask the user for their rate of pay and parse to numeric value
		
		String rateOfPay = JOptionPane.showInputDialog(null, "What is your current rate of pay?");
		double hourlyrate = Double.parseDouble(rateOfPay);
		
		// Calculate weekly pay by multiplying the weekly hours by the rate of pay
		
		double weeklyPay = hours * hourlyrate;
		
		// Display message dialog informing user of the bad news
		
		JOptionPane.showMessageDialog(null, "Your weekly salary of $" + weeklyPay + "0 is too low. Stay tuned for your lucky lottery numbers!");
		
		// Generate six random Lottery numbers
		
		Random generator = new Random();
		int Lotto1 = generator.nextInt(49);
		int Lotto2 = generator.nextInt(49);
		int Lotto3 = generator.nextInt(49);
		int Lotto4 = generator.nextInt(49);
		int Lotto5 = generator.nextInt(49);
		int Lotto6 = generator.nextInt(49);
		
		// Compensate for possible zero values on Lottery Numbers
		
		int Lotto7 = Lotto1 + 1;
		int Lotto8 = Lotto2 + 1;
		int Lotto9 = Lotto3 + 1;
		int Lotto10 = Lotto4 + 1;
		int Lotto11 = Lotto5 + 1;
		int Lotto12 = Lotto6 + 1;
		
		// Display Lottery numbers to user
		
		JOptionPane.showMessageDialog(null, "Lucky Lottery Numbers are as Follows:  " + Lotto7 + "," + Lotto8 + "," + Lotto9 + "," + Lotto10 + "," + Lotto11 + "," + Lotto12 + ".");
		
		// exit program
		System.exit(0);
	}

}
