/**
 * A class to test the BankAccount class.
 * @author Johnny
 *
 */
public class BankAccountTester {

	/**
	 * Tests the methods of the BankAccount class.
	 * @param args not used
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount johnnysChecking = new BankAccount();
		System.out.println(johnnysChecking.getBalance());
		johnnysChecking.deposit(1000);
		System.out.println(johnnysChecking.getBalance());
		johnnysChecking.withdraw(500);
		System.out.println(johnnysChecking.getBalance());
		johnnysChecking.withdraw(400);
		System.out.println(johnnysChecking.getBalance());
		
		System.out.println("Expected: 100");
	}

}
