import java.util.ArrayList;

public class ArrayListTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<BankAccount> accounts 
         = new ArrayList<BankAccount>();
   accounts.add(new BankAccount(1001));
   accounts.add(new BankAccount(1015));
   accounts.add(new BankAccount(1729));
   accounts.add(1, new BankAccount(1008));
   accounts.add(new BankAccount(100000));
   accounts.remove(0);

   System.out.println("Size: " + accounts.size());
   System.out.println("Expected: 4");
   BankAccount first = accounts.get(0);
   System.out.println("First account number: " 
         + first.getAccountNumber());
   System.out.println("Expected: 1008");                  
   BankAccount last = accounts.get(accounts.size() - 1);
   System.out.println("Last account number: " 
         + last.getAccountNumber());
   System.out.println("Expected: 100000");  
   BankAccount middle = accounts.get(1);
   System.out.println("Second account number: "
		 + middle.getAccountNumber());
   BankAccount four = accounts.get(3);
   System.out.println("fourth account balance: "
		   + four.getAccountNumber());
   
	}

}
