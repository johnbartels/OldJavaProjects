import java.util.ArrayList;
import java.util.Scanner;

public class NewTowers
{
	static Scanner in = new Scanner(System.in);
	static int numberofMoves = 0;
	static int totalDisks = 0;
	static int fromNeedle = 3;
	static int toNeedle = 2;
	
	private static ArrayList<Integer> Needle1 = new ArrayList<Integer>();
	private static ArrayList<Integer> Needle2 = new ArrayList<Integer>();
	private static ArrayList<Integer> Needle3 = new ArrayList<Integer>();
	
	public static void main (String[] args)
	{
		int disks;
		
		System.out.print("How Many Disks?: ");
		int userSpecifiedDisks = in.nextInt();
		totalDisks = userSpecifiedDisks;
		
		
		System.out.print("What Needle Do You Want Them to Start On? [-1 for Random Assignment]: ");
		fromNeedle = in.nextInt();
		int userInputNeedle = fromNeedle;
		
		
		if (fromNeedle == -1)
		{
			System.out.println("Assigning the disks randomly to needles...");
			applyDisksToRandomNeedle(userSpecifiedDisks);
			fromNeedle = locateLargestDisk();
		}
		else if(fromNeedle == 1)
		{
			fromNeedle = 1;
			for (int i = totalDisks; i > 0; i--)
			{
				Needle1.add(i);
			}
		}
		else if(fromNeedle == 2)
		{
			fromNeedle = 2;
			for (int i = totalDisks; i > 0; i--)
			{
				Needle2.add(i);
			}
		}
		else if(fromNeedle == 3)
		{
			fromNeedle = 3;
			for (int i = totalDisks; i > 0; i--)
			{
				Needle3.add(i);
			}
		}
		
	
		System.out.println("Initial Configuration:");
		System.out.print("	[Needle 1]: ");
		for(int i= 0; i < Needle1.size(); i++)
		{
			System.out.print(Needle1.get(i) + ",");
		}
		System.out.println();
		System.out.print("	[Needle 2]: ");
		for(int i= 0; i < Needle2.size(); i++)
		{
			System.out.print(Needle2.get(i) + ",");
		}
		System.out.println();
		System.out.print("	[Needle 3]: ");
		for(int i= 0; i < Needle3.size(); i++)
		{
			System.out.print(Needle3.get(i) + ",");
		}
		
		System.out.println();
		System.out.println("FromNeedle:" + fromNeedle);
		
		System.out.print("What Needle Do You Want Them To End Up On? [1, 2, or 3]:");
		toNeedle = in.nextInt();
		int auxNeedle = getAuxNeedle(fromNeedle, toNeedle);
		System.out.println("Solution:");
		
		solveHanoi(totalDisks, fromNeedle, toNeedle, auxNeedle);
		
		
		
		
		System.out.println("Solution completed in " + numberofMoves + " moves.");
		
		System.out.println("Final Configuration:");
		System.out.print("	[Needle 1]: ");
		System.out.println();
		System.out.print("	[Needle 2]: ");
		System.out.println();
		System.out.print("	[Needle 3]: ");
		
		
	}
	private static int locateLargestDisk() 
	{
		// TODO Auto-generated method stub
		int returnedNeedle = 0;
		for (int i = 0; i<Needle1.size(); i++)
		{
			int tempInt = Needle1.get(i);
			if (tempInt == totalDisks)
			{
				returnedNeedle = 1;
			}
		}
		for (int i = 0; i<Needle2.size(); i++)
		{
			int tempInt = Needle2.get(i);
			if (tempInt == totalDisks)
			{
				returnedNeedle = 2;
			}
		}
		for (int i = 0; i<Needle3.size(); i++)
		{
			int tempInt = Needle3.get(i);
			if (tempInt == totalDisks)
			{
				returnedNeedle = 3;
			}
		}
		
		return returnedNeedle;
	}
	private static void applyDisksToRandomNeedle(int userSpecifiedDisks) 
	{
		// TODO Auto-generated method stub
		int needleNumber = 0;
		do
		{
			needleNumber = nextInt();
			if (needleNumber == 1)
			{
				Needle1.add(userSpecifiedDisks);
				userSpecifiedDisks--;
			}
			else if (needleNumber == 2)
			{
				Needle2.add(userSpecifiedDisks);
				userSpecifiedDisks--;
			}
			else if (needleNumber == 3)
			{
				Needle3.add(userSpecifiedDisks);
				userSpecifiedDisks--;
			}
		}
		while (userSpecifiedDisks != 0);
	}
	private static int nextInt() 
	{
		int randomInt =(int) ((Math.random() * 3) + 1);
		
		   return randomInt;
	}
	private static int getAuxNeedle(int fromNeedle, int toNeedle) 
	{
		// TODO Auto-generated method stub
		return 6 - (fromNeedle + toNeedle);
	}
	private static void solveHanoi(int disks, int fromneedle, int toneedle,
			int auxneedle) 
	{
		// TODO Auto-generated method stub
		numberofMoves++;
		if (disks == 1) 
		{
			//solveHanoi(disks-1, fromneedle, auxneedle, toneedle);
			//moveDisk(fromneedle, toneedle);
			//solveHanoi(disks-1, auxneedle, toneedle, fromneedle);
			System.out.println(" Moved Disk: " + disks + "\t" + " From Needle: " +
				       fromneedle + "\t" + " To Needle: " +
				       toneedle);
		}
		else
		{
			// Step 1: Move numDisks-1 disks from the fromPeg
		    //         to the auxPeg using the toPeg.
		    solveHanoi(disks - 1, fromneedle, auxneedle, toneedle);

		    // Step 2: Move 1 disk from the fromPeg to
		    //         the toPeg.
		    System.out.println(" Moved Disk: " + disks + "\t" + " From Needle: " +
				       fromneedle + "\t" + " To Needle: " +
				       toneedle);

		    // Step 3: Move the numDisks-1 disks from the auxPeg
		    //         to the toPeg using the fromPeg.
		    solveHanoi(disks-1, auxneedle, toneedle, fromneedle);
		}
	}
	private static void moveDisk(int fromneedle, int toneedle) 
	{
		// TODO Auto-generated method stub
		numberofMoves++;
		if(totalDisks <= 10){
			System.out.print("Move disk from needle " + fromneedle + " to needle " + toneedle  );
			
			if (numberofMoves%1 == 0){
				;
				System.out.println();
				
				}
			}
			else 
			{
			
				if (numberofMoves%1 == 0)
				{
					System.out.println();
				}
			}
	}
}