import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class VendingMachine 
{
	ArrayList<Bin> list = new ArrayList<Bin>();
	ArrayList<String> plist = new ArrayList<String>();
	Scanner inFile = null;
	private String stFileName;
	private String passcd;
	private double amtPending = 0;
	private double totAmt = 0;
	
	public VendingMachine(String startupFile)
	{
		stFilename = startupFile;
		try
		{
			inFile = new Scanner(new FileReader(startupFile));
		}
		
	}
	public void saveState()
	{
		try
		{
			FileWriter out = new FileWriter(stFileName);
			out.write(passcd + '\n');
			out.write(totAmt + "");
			int len = list.size();
			for (int i=0; i<len; i++)
			{
				out.write("\n" + list.get(i).getProduct().getDescription() + '\n');
				out.write(list.get(i).getProduct().getPrice() + "\n");
				out.write(list.get(i).getQuantity() + "\n");
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		
	}
	public ArrayList<String> getProductList()
	{
		return plist;
	}
	public void updateCoinsPending(double amt)
	{
		amtPending += amt;
	}
	public double getInsertedAmount()
	{
		return amtPending;
	}
	public boolean dispenseItem(int binNumber)
	{
		// access the bin 
		if ((binNumber >= list.size()) || binNumber < 0)
		{
			return false;
		}
		Bin currBin = list.get(binNumber);
		// if amtPending < price of product return false
		if (amtPending < currBin.getProduct().getPrice())
		{
			return false;
		}
		// if qty > 0 , reduce the quantity by one; else signal empty bin
		if (currBin.getQuantity < 1)
		{
			return false;
		}
		// reduce quantity in bin
		currBin.setQuantity(currBin.getQuantity() - 1);
		totAmt += amtPending;
		amtPending = 0;
		// dispense the item
		return true;
	}
	public void returnCoins()
	{
		amtPending = 0;
	}
	
}
