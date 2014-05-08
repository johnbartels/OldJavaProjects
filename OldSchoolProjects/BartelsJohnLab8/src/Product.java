
public class Product {

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
	
	public String getName()
	
	{
		return name;
	}
	
	public double getPrice()
	
	{
		return price;
	}
	
	public double getWeight()
	
	{
		return weight;
	}
	
	public void changeName(String newName)
	
	{
		name = newName;
	}
	
	public void changeWeight(double newWeight)
	
	{
		weight = newWeight;
	}
	
	public void changePrice(double newPrice)
	
	{
		price = newPrice;
	}
}