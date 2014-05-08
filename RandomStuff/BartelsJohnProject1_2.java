import javax.swing.JOptionPane;
public class BartelsJohnProject1_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Get user name data 
		String name = JOptionPane.showInputDialog(null, "What is your First and Last name?");
		
		// User Greeting
		JOptionPane.showMessageDialog(null, "Hello " + name + ".  I hope you are well today.");
		
		// Gather Request From User 
		String request = JOptionPane.showInputDialog(null, "Please state your request, " + name + ".");
		
		// Disappoint User By Denying Request
		JOptionPane.showMessageDialog(null, "I'm sorry, " + name + " I'm afraid I will not be able to do that for you.");
	}

}
