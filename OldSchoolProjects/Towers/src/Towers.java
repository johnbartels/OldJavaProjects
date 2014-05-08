/**
 * TowersOfHanoi.java
 * Created by Stijn Strickx on Aug. 12 2006
 * Copyright 2006 Stijn Strickx, All rights reserved
 */

import java.io.*;
import java.util.Scanner;

public class Towers {

	static int moves = 0;
	static int totalDisks = 0;
	static int fromneedle = 1;
	static int auxNeedle = 0;
	public static void main(String[] arguments) throws java.io.IOException {
		int disks;
		
		Scanner in = new Scanner(System.in);
		
		disks = getNumber("How many disks? ");
		System.out.println("What needle do you want them to start on? [-1 for random assignment] : ");
		int needle = in.nextInt();
		totalDisks = disks;
		fromneedle = needle;
		char fromneedle = '1';
		char withneedle = '2';
		char toneedle = '3';
		
		if(totalDisks > 10){
			System.out.println("Working...");
			}
		FileOutputStream fos = new FileOutputStream("TowersOfHanoiSolution.txt");
		PrintStream ps = new PrintStream(fos);
		getAuxNeedle(fromneedle, toneedle);
		solveHanoi(disks, fromneedle, toneedle, withneedle, ps);
		ps.close();
		System.out.println();
		System.out.println("\nSolution completed in " + moves + " moves." + "\n");
		System.out.print("Final configuration:\n");
		System.out.println("     Needle 1:");
		}
	
	private static int getAuxNeedle(int src, int dest) 
	{
		// TODO Auto-generated method stub
		return 6 - (src + dest);
	}

	static void solveHanoi(int disks, char fromneedle, char toneedle, char withneedle, PrintStream ps) {
		if (disks >= 1) {
			solveHanoi(disks-1, fromneedle, withneedle, toneedle, ps);
			moveDisk(fromneedle, toneedle, ps);
			solveHanoi(disks-1, withneedle, toneedle, fromneedle, ps);
			}
		}
		
	static void moveDisk(char fromneedle, char toneedle, PrintStream ps) 
	{
		moves++;
		if(totalDisks <= 10){
			System.out.print("Move disk from needle " + fromneedle + " to needle " + toneedle  );
			ps.print("Move disk from needle " + fromneedle + " to needle " + toneedle);
			if (moves%1 == 0){
				;
				System.out.println();
				ps.println();
				}
			}
			else {
			ps.print("Move disk from needle " + fromneedle + " to needle " + toneedle);
			if (moves%1 == 0){
				ps.println();
				}
			}
		}
	
	static int getNumber(String question) throws java.io.IOException {
		String theNumber;
		int number = 0;
		BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
		System.out.print(question);
		theNumber = in.readLine();
		System.out.println();
		number = Integer.parseInt(theNumber);
		return number;
		}
	
static char getneedle(String question) throws java.io.IOException {
	String theneedle;
	char needle = 0;
	BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
	System.out.print(question);
	theneedle = in.readLine();
	System.out.println();
	needle = (char) Integer.parseInt(theneedle);
	return needle;
	}
}