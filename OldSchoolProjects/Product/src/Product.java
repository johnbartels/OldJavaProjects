
public class Product {
	
	/**
	 * Constructs a product 
	 * @param name and price
	 */
	public Product(String itemName, double itemPrice)
	{
		
		price = itemPrice;
		name = itemName;
	}
	
	/**
	 * Calls for name of product
	 * @return 
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * Calls for the price of the product
	 * @return 
	 */
	public double getPrice()
	{
		return price;
	}
	
	/**
	 * Reduces the price of the product
	 * @return 
	 */
	public double reducePrice(double amount)
	{
		price = price - amount;
		return price;
	}
	

    private double price;
    private String name;
    

}
