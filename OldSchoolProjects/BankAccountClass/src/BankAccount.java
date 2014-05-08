
public class BankAccount {

	public BankAccount()
	{
		balance = 0;
	}
	
	String name = "";
	
	public BankAccount(double initialBalance)
	{
		initialBalance = balance;
	}
	
	public void Deposit(double amount)
	{
		double newBalance = balance + amount;
		balance = newBalance;
	}
	
	public void Withdrawal(double amount)
	{
		double newBalance = balance - amount;
		balance = newBalance;
	}
	public void AssignAccountName(String initialName)
	{
		name = initialName;
	}
	public String GetAccountName()
	{
		return name;
	}
	public double GetBalance()
	{
		return balance;
	}
	private double balance;
}
