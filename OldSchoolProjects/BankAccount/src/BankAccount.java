
public class BankAccount {
		
		/**
		 * Constructs a bank account with a zero balance
		 */
		public BankAccount()
		{
			balance = 0;
		}
	
		/**
		 * Constructs a bank account with a given balance.
		 * @param initialBalance is the beginning balance.
		 */
		public BankAccount(double initialBalance)
		{
			balance = initialBalance;
		}
		
		/**
		 * Deposits money  into the bank account.
		 * @param amount is the amount to deposit
		 */
		public void deposit(double amount)
		{
			double newBalance = balance + amount;
			this.balance = newBalance;
		}
		
		/**
		 * Withdraws money from the bank account.
		 * @param amount is the amount to withdraw.
		 */
		public void withdraw(double amount)
		{
			double newBalance = balance - amount;
			balance = newBalance;
		}
		
		/**
		 * Gets the current balance of the bank account.
		 * @return returns the current balance
		 */
		public double getBalance()
		{
			return balance;
		}
		
		private double balance;
	
	}
