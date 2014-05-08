import javax.swing.JOptionPane;

public class ProductTester {

	/**Tests methods of the Product class
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product item1 = new Product("Toaster", 29.95);
		System.out.print(item1.getName());
		System.out.println(item1.getPrice());
		Product item2 = new Product("Coffee Maker", 19.95);
		System.out.print(item2.getName());
		System.out.println(item2.getPrice());
		System.out.println(1+2+3+4);
		
		String itemName = JOptionPane.showInputDialog(null, "Please input the name of the item");
		String itemPrice = JOptionPane.showInputDialog(null, "Please input the price of the item");
		
		double item3Price = Double.parseDouble(itemPrice);
		
		Product item3 = new Product(itemName, item3Price);
		item1.reducePrice(5.00);
		System.out.println(item1.getPrice());
		item2.reducePrice(5.00);
		System.out.println(item2.getPrice());
		System.out.println(itemName);
		System.out.println(itemPrice);
		item3.reducePrice(5.00);
		System.out.println(item3.getPrice());
		

	}

}
