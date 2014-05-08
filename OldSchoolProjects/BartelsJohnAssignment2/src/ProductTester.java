//import java.util.Scanner;
import javax.swing.JOptionPane;

public class ProductTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scanner in = new Scanner(System.in);
		
		// Declare variables for later use
		
		String newProductName = "";
		double newProductPrice = 0.0;
		boolean newProductOnSale = false;
		double newProductWeight = 0.0;
		String onSaleChoice = "";
		double percentDiscount = 0.85;
		double taxRate = 0.07;
		
		//System.out.println("Please input the Product Name.");
		
		// user will input the product name for product one
		
		String newProductName1 = JOptionPane.showInputDialog(null, "Please input the First Product's Name.");
		
			//newProductName = in.nextLine();
			System.out.println(newProductName1);
		
		// user will input the product price for product one	
			
		//System.out.println("Please input the Product Price.");
		
		String productPriceString = JOptionPane.showInputDialog(null, "Please input the " + newProductName1 + "'s Price.");
			newProductPrice = Double.parseDouble(productPriceString);
		
			//newProductPrice = in.nextDouble();
			System.out.println(newProductPrice);
			
		//System.out.println("Is the " + newProductName + " on Sale?  Y/N:");
		
		String onSaleChoice1 = JOptionPane.showInputDialog(null, "Is the " + newProductName1 + " on Sale? Y/N");
		
			//onSaleChoice = in.next();
		
		if (onSaleChoice1.equalsIgnoreCase("Y"))
	
			newProductPrice = newProductPrice * percentDiscount;
			
				else System.out.println(newProductPrice);
			
		//System.out.println("Please input the Product's Weight in Pounds.");
		
		String productWeightString = JOptionPane.showInputDialog(null, "Please input the " + newProductName1 + "'s Weight in Pounds");
			newProductWeight = Double.parseDouble(productWeightString);
			
			//newProductWeight = in.nextDouble();
			System.out.println(newProductWeight);
		
		Product firstProduct = new Product(newProductName1, newProductPrice, newProductOnSale, newProductWeight); 	
		
		//System.out.println("Please input the Second Product's Name.");
		String newProductName2 = JOptionPane.showInputDialog(null, "Please input the Second Product's name");
		
			//newProductName = in.next();
			System.out.println(newProductName2);
		
		//System.out.println("Please input the Product Price.");
		String productPriceString2 = JOptionPane.showInputDialog(null, "Please input the " + newProductName2 + "'s Price");
			newProductPrice = Double.parseDouble(productPriceString2);
			//newProductPrice = in.nextDouble();
		
		//System.out.println("Is the Product on Sale?  (Y/N):");
		String onSaleChoice2 = JOptionPane.showInputDialog(null, "Is the " + newProductName2 + " on Sale? (Y/N)");
		//onSaleChoice = in.next();
			
			if (onSaleChoice2.equalsIgnoreCase("Y"))
		
				newProductPrice = newProductPrice * percentDiscount;
				
				else System.out.println(newProductPrice);
			
		//System.out.println("Please input the Product's Weight in Pounds.");
		String productWeightString2 = JOptionPane.showInputDialog(null, "Please input the " + newProductName2 + "'s Weight in Pounds");
			newProductWeight = Double.parseDouble(productWeightString2);
			//newProductWeight = in.nextDouble();
			System.out.println(newProductWeight);
		
		Product secondProduct = new Product(newProductName2, newProductPrice, newProductOnSale, newProductWeight);
		
		//System.out.println("Please input the Product Name.");
		String newProductName3 = JOptionPane.showInputDialog(null, "Please input the Third Product's Name");
		
			//newProductName = in.next();
			System.out.println(newProductName3);
		
		//System.out.println("Please input the Product Price.");
		String productPriceString3 = JOptionPane.showInputDialog(null, "Please input the " + newProductName3 + "'s Price");
			newProductPrice = Double.parseDouble(productPriceString3);
		
			//newProductPrice = in.nextDouble();
		
		//System.out.println("Is the Product on Sale?  (Y/N):");
		String onSaleChoice3 = JOptionPane.showInputDialog(null, "Is the " + newProductName3 + " on Sale? (Y/N)");
			//onSaleChoice = in.next();
	
			if (onSaleChoice3.equalsIgnoreCase("Y"))
		
				newProductPrice = newProductPrice * percentDiscount;
				
				else System.out.println(newProductPrice);
		
		//System.out.println("Please input the Product's Weight in Pounds.");
		String productWeightString3 = JOptionPane.showInputDialog(null, "Please input the " + newProductName3 + "'s Weight in Pounds");
			newProductWeight = Double.parseDouble(productWeightString3);
		
			//newProductWeight = in.nextDouble();
			System.out.println(newProductWeight);
		
		Product thirdProduct = new Product (newProductName3, newProductPrice, newProductOnSale, newProductWeight);
		
		double moneyInPocket = 0.0;
		double weightCustomerCanCarry = 0.0;
		
		//System.out.println("How much money do you have in your pocket?");
		String moneyInPocketString = JOptionPane.showInputDialog(null, "How much money do you have in your pocket?");
			moneyInPocket = Double.parseDouble(moneyInPocketString);
		
		//moneyInPocket = in.nextDouble();
		
		//System.out.println("How much weight can you carry?");
		String weightCustomerCanCarryString = JOptionPane.showInputDialog(null, "How much weight (in pounds) can you Carry?");
			weightCustomerCanCarry = Double.parseDouble(weightCustomerCanCarryString);
		
		//weightCustomerCanCarry = in.nextDouble();
		
		double totalCost = firstProduct.getProductPrice() + secondProduct.getProductPrice() + thirdProduct.getProductPrice();
		double totalWeight = firstProduct.getProductWeight() + secondProduct.getProductWeight() + thirdProduct.getProductWeight();
		double transactionTax = totalCost * taxRate;
		double transactionTotal = totalCost + transactionTax;
		
		if (transactionTotal > moneyInPocket)
		{
			System.out.println("Sorry you do not have enough money to complete this transaction.");
			System.out.println("Please visit our ATM on the North side of the store and you can complete this transaction today!");
			System.exit(0);
		}
			
		System.out.println();
		
		System.out.println("-----Item Name-----" + "-----Item Price-----" + "-----Item Weight-----");
		
		System.out.println();
		
		System.out.println("     " + firstProduct.getProductName() + "                " + firstProduct.getProductPrice() + "              " + firstProduct.getProductWeight());
		System.out.println("     " + secondProduct.getProductName() + "                " + secondProduct.getProductPrice() + "                " + secondProduct.getProductWeight());
		System.out.println("     " + thirdProduct.getProductName() + "               " + thirdProduct.getProductPrice() + "                " + thirdProduct.getProductWeight());
		
		System.out.println();
		
		System.out.println("               Subtotal: " + totalCost + " " + "Total Weight: " + totalWeight);
		System.out.println("                    Tax:  " + transactionTax);
		System.out.println("                  Total: " + transactionTotal);
		System.out.println();
		
		//JOptionPane.showMessageDialog(null,"   Subtotal: " + totalCost + "   " +
				//" " + "Total Weight: " + totalWeight +
				//"             Tax:  " + transactionTax           +
				//"             Total: " + transactionTotal                   );
		if (totalWeight > 200 || weightCustomerCanCarry < totalWeight)
		{
			System.out.println("Would you like some assistance carrying your items to your vehicle?");
			System.out.println("Thank you for shopping at our store. Have a nice day!");
			System.out.println("Questions or Comments? We want to hear from you!");
			System.out.println("Visit our website: http://www.ourwebsite.com");
		}
			
		else
		{
			System.out.println("Thank you for shopping at our store. Have a nice day!");
			System.out.println("Questions or Comments? We want to hear from you!");
			System.out.println("Visit our website: http://www.ourwebsite.com");
		}
	}

}
