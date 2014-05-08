import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;


public class Hanoi 
{
	private static int lineNumber = 0;
	private static int userDisks = 0;
	private static ArrayList<Integer> Needle1 = new ArrayList<Integer>();
	private static ArrayList<Integer> Needle2 = new ArrayList<Integer>();
	private static ArrayList<Integer> Needle3 = new ArrayList<Integer>();
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int ndisks = getDisks();
		userDisks = ndisks;
		applyDiskToRandomNeedle();
		System.out.println("The size of Needle 1 is: " + Needle1.size());
		System.out.println("The size of Needle 2 is: " + Needle2.size());
		System.out.println("The size of Needle 3 is: " + Needle3.size());

		for (int i = 0; i < Needle1.size(); i++)
		{
			System.out.println("Needle1 Index Location: " + i + " is " + Needle1.get(i));
			

		}
		for (int j = 0; j < Needle2.size(); j++)
		{
			System.out.println("Needle2 Index Location: " + j + " is " + Needle2.get(j));
			

		}
		for (int k = 0; k < Needle3.size(); k++)
		{
			System.out.println("Needle3 Index Location: " + k + " is " + Needle3.get(k));
			

		}
		int dest = getDestinationNeedle();
		
		moveDisks(ndisks, dest);
		
		// TODO Auto-generated method stub
		//move(ndisks, dest);
		for (int i = 0; i < Needle1.size(); i++)
		{
			System.out.println("Needle1 Index Location: " + i + " is " + Needle1.get(i));
			

		}
		for (int j = 0; j < Needle2.size(); j++)
		{
			System.out.println("Needle2 Index Location: " + j + " is " + Needle2.get(j));
			

		}
		for (int k = 0; k < Needle3.size(); k++)
		{
			System.out.println("Needle3 Index Location: " + k + " is " + Needle3.get(k));
			

		}
	}

	private static int getAuxiliaryNeedle(int src, int dest) 
	{
		// TODO Auto-generated method stub
		return 6 - (src + dest);
	}

	private static int findLargestDisk(int userDisks) 
	{
		// method to locate the largest Disk
		for (int i = 0; i < Needle1.size(); i++)
		{
			if (Needle1.get(i) == userDisks)
			{
				System.out.println("Needle1 Index Location: " + i + " is " + Needle1.get(i));
				return 1;
			}

		}
		for (int j = 0; j < Needle2.size(); j++)
		{
			if (Needle2.get(j) == userDisks)
			{
				System.out.println("Needle2 Index Location: " + j + " is " + Needle2.get(j));
				return 2;
			}

		}
		for (int k = 0; k < Needle3.size(); k++)
		{
			if (Needle3.get(k) == userDisks)
			{
				System.out.println("Needle3 Index Location: " + k + " is " + Needle3.get(k));
				return 3;
			}

		}
		userDisks--;
		return 0;
		
	}

	private static int getDestinationNeedle() 
	{
		// TODO Auto-generated method stub
		int dest = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the numerical value of the Destination Needle: ");
		dest = in.nextInt();
		return dest;
	}

	private static void moveDisks(int nDisks, int dest) 
	{
		// TODO Auto-generated method stub
		int src = findLargestDisk(nDisks);
		int aux = getAuxiliaryNeedle(src, dest);
		
		if (nDisks > 1)
			moveDisks(nDisks - 1, dest);
		if (nDisks == 0)
			return;
	}

	private static int getDisks() {
		int userDisks = 0;
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Please Enter the amount of Disks to move: ");
		userDisks = in.nextInt();
		return userDisks;
	}
	private static void applyDiskToRandomNeedle()
	{
		int userDisks2 = 0;
		userDisks2 = userDisks;
		int needleNumber = 0;
		do
		{
			needleNumber = nextInt();
			if (needleNumber == 1)
			{
				Needle1.add(userDisks2);
				userDisks2--;
			}
			else if (needleNumber == 2)
			{
				Needle2.add(userDisks2);
				userDisks2--;
			}
			else if (needleNumber == 3)
			{
				Needle3.add(userDisks2);
				userDisks2--;
			}
		}
		while (userDisks2 != 0);
	}

	private static void move(int ndisks, int src, int dest, int aux) 
	{
		// move ndisks -1 out of the way
		if (ndisks > 1)
			move(ndisks-1, src, aux, dest);
		// move nth disk from src to dest
		lineNumber++;
		System.out.println("disks: " + ndisks);
			System.out.println(lineNumber + " Move disk from Needle " + src + " to needle " + dest + ".");
			// move ndisks -1 to dest
		if (ndisks > 1)
			move(ndisks-1, aux, dest, src);
		
	}
	 public static int nextInt() 
	 {
		   
		 int randomInt =(int) ((Math.random() * 3) + 1);
		
		   return randomInt;
	 }


}
