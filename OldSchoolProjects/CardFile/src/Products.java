
public class Products

{
	private String shopNumber;
	private String poNumber;
	private String partNumber;
	private String description;
	private String completionDate;
	private String notes;
	
	public Products()
	
	{
		shopNumber = "unknown";
		poNumber = "unknown";
		partNumber = "unknown";
		description = "unknown";
		completionDate = "unknown";
		notes = "unknown";
	}
	
	public Products(String initialShopNumber, String initialPONumber, String initialPartNumber, String initialDescription, String initialCompletionDate, String initialNotes)
	
	{
		shopNumber = initialShopNumber;
		poNumber = initialPONumber;
		partNumber = initialPartNumber;
		description = initialDescription;
		completionDate = initialCompletionDate;
		notes = initialNotes;
	}
	
	public String getProductsShopNumber()
	
	{
		return shopNumber;
	}
	
	public String getProductsPONumber()
	
	{
		return poNumber;
	}
	
	public String getProductsPartNumber()
	
	{
		return partNumber;
	}
	
	public String getProductsDescription()
	
	{
		return description;
	}
	
	public String getProductsCompletionDate()
	
	{
		return completionDate;
	}
	
	public String getProductNotes()
	
	{
		return notes;
	}
	
	public void changeProductsShopNumber(String newShopNumber)
	
	{
		shopNumber = newShopNumber;
	}
	
	public void changeProductsPONumber(String newPONumber)
	
	{
		poNumber = newPONumber;
	}
	
	public void changeProductsPartNumber(String newPartNumber)
	
	{
		partNumber = newPartNumber;
	}
}