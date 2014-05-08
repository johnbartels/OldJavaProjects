
public class Machines

{
	private String description;
	private String modelNumber;
	private String repairInfo;
	private String partsSuppliers;
	private String notes;

	
	
	public Machines()
	{
		description = "unknown";
		modelNumber = "unknown";
		repairInfo = "unknown";
		partsSuppliers = "unknown";
		notes = "unknown";
	}
	
	public Machines(String initialDescription, String initialModelNumber, String initialRepairInfo, String initialPartsSuppliers, String initialNotes)
	{
		description = initialDescription;
		modelNumber = initialModelNumber;
		repairInfo = initialRepairInfo;
		partsSuppliers = initialPartsSuppliers;
		notes = initialNotes;
	}
	
	public String getMachinesDescription()
	{
		return description;
	}
	
	public String getMachinesModelNumber()
	{
		return modelNumber;
	}
	
	public String getMachinesRepairInfo()
	{
		return repairInfo;
	}
	
	public String getMachinesPartsSuppliers()
	{
		return partsSuppliers;
	}
	
	public String getMachinesNotes()
	{
		return notes;
	}

	
}