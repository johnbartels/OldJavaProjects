
public class Product {

	private String name;
	private double price;
	private boolean onSale;
	private double weight;
	
	public Product()
	
	{
		name = "unknown";
		price = 0.0;
		onSale = false;
		weight = 0.0;
	}
	
	public Product(String initialName, double initialPrice, boolean initialOnSale, double initialWeight)
	
	{
		name = initialName;
		price = initialPrice;
		onSale = initialOnSale;
		weight = initialWeight;
	}
	
	public String getProductName()
	
	{
		return name;
	}
	
	public double getProductPrice()
	
	{
		return price;
	}
	
	public boolean onSaleOrNot()
	
	{
		return onSale;
	}
	
	public double getProductWeight()
	
	{
		return weight;
	}
	
	public double getSalePrice()
	
	{
		if (onSale)
		return price * 0.85;
		else
		return price;	
	}
	
	public void changeOnSale()
	
	{
		if(!onSale)
			onSale = true;
	}
	
	public void changeProductName(String newName)
	
	{
		name = newName;
	}
	
	public void changeProductWeight(double newWeight)
	
	{
		weight = newWeight;
	}
	
	public void changeProductPrice(double newPrice)
	
	{
		price = newPrice;
	}
}
