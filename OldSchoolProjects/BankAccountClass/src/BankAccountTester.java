import java.util.Scanner;
public class BankAccountTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		BankAccount johnnyChecking = new BankAccount();
			johnnyChecking.Deposit(500);
			johnnyChecking.Withdrawal(200);
			johnnyChecking.Deposit(700);
		
		System.out.println("Expected Value:  1000");
		
		System.out.println(johnnyChecking.GetBalance());
		
		int i = 1;
		int accountNumber = 100501;
		boolean continueOrNot = true;
		
		do
		{
		
			System.out.println("Please input the name of the new Checking Account:  ");
		
				String checkingAccount;
				checkingAccount = in.next();
				accountNumber ++;
				BankAccount checkingAccount1 = new BankAccount();
				checkingAccount1.AssignAccountName(checkingAccount);
				System.out.println(checkingAccount1.GetAccountName());
		
				System.out.println("The associated account number for this account is:  " + accountNumber);
				System.out.println("The name for this account is as follows:  " + checkingAccount);
		
				String depositChoice;
		
				System.out.println("Would you like to deposit money into your account? (Y/N):  ");
					
					depositChoice = in.next();
		
					if (depositChoice.equalsIgnoreCase("Y"))
						{
							double inputDeposit = 0;
							System.out.println("Please input the amount you are Depositing:");
							inputDeposit = in.nextDouble();
							checkingAccount1.Deposit(inputDeposit);
							System.out.println("Your New Balance is:  " + checkingAccount1.GetBalance());
							
						}
					else System.out.println("Would you like to withdrawal money from your account? (Y/N):  ");
							
							String withdrawalChoice;
							withdrawalChoice = in.next();
							if (withdrawalChoice.equalsIgnoreCase("Y"))
							{
								double inputWithdrawal = 0;
								System.out.println("Please input the amount you are Withdrawing:");
								inputWithdrawal = in.nextDouble();
								checkingAccount1.Withdrawal(inputWithdrawal);
								System.out.println("Your New Balance is:  " + checkingAccount1.GetBalance());
								String userInputContinue = "";
								System.out.println("Would you like to create another account? (Y/N):  ");
								userInputContinue = in.next();
							}
							else System.out.println("You have chosen not to withdrawal money from your account");
							
							String userInputContinue = "";
							if (userInputContinue.equalsIgnoreCase("Y"))
							{
								continueOrNot = true;
							}
							else continueOrNot = false;
								
								System.out.println("Thank you for using the Bank Account Creator and Maintenance Program");
								System.exit(0);
								
			
		}
		while (continueOrNot = true); 
			
	}

}
