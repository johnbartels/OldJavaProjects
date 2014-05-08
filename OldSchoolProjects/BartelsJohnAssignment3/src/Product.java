
public class Product 

{

	private String name;
	private double price;
	private double weight;
	
	public Product()
	
	{
		name = "unknown";
		price = 0.0;
		weight = 0.0;
	}
	
	public Product(String initialName, double initialPrice, double initialWeight)
	
	{
		name = initialName;
		price = initialPrice;
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
	
	public double getProductWeight()
	
	{
		return weight;
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