import java.io.Console;
import java.util.Scanner;


/**
 * TowersOfHanoi.java - 
 *   Recursive program that will solve a Towers
 *   of Hanoi puzzle.
 *
 * @author Grant William Braught
 * @author Dickinson College
 * @version 2/11/2000
 */
public class TowerOfHanoi 
{
	static Scanner in = new Scanner(System.in);
	public static void main (String[] args) 
	{
		
		char fromPeg, toPeg, auxPeg;
		int numDisks;

		// Display an introductory screen.
		printIntro();
		
		// Get from the user or determine all of the
		// information regarding the puzzle.
		fromPeg = getFromPeg();
		toPeg = getToPeg(fromPeg);
		auxPeg = findAuxPeg(fromPeg, toPeg);
		numDisks = getNumDisks();
	
		System.out.println();
		System.out.println("Move\tFrom\tTo");
		System.out.println("Disk\tPeg\tPeg");
		System.out.println("--------------------");

		// Solve the puzzle.
		towers(fromPeg,toPeg,auxPeg,numDisks);
    }

    /**
     * Recursively solve the towers of Hanoi puzzle by
     * moving numDisks disks from the fromPeg to the 
     * toPeg using the augPeg.
     *
     * @param fromPeg the peg from which the disks need
     *                to be moved.
     * @param toPeg the peg to which the disks are to be
     *              moved.
     * @param auxPeg the other peg.
     * @param numDisks the number of disks to be moved from
     *                 the from peg to the to peg.
     */
    static void towers(char fromPeg, char toPeg, char auxPeg,
		       int numDisks) 
    {

	// Base Case:
	//   If there is only one disk just move it from
	//   the fromPeg to the toPeg and we're done!
	if (numDisks == 1) {
	    System.out.println(numDisks + "\t" +
			       fromPeg + "\t" + 
			       toPeg);	       
	}
	// Recursive Case:
	//   This takes three steps...
	//     1. Move the numDisks-1 disks to the auxPeg.
	//     2. Move the last disk from the fromPeg to the toPeg.
	//     3. Move the numDisk-1 disks from the auxPeg to the toPeg.
	else {
	    
	    // Step 1: Move numDisks-1 disks from the fromPeg
	    //         to the auxPeg using the toPeg.
	    towers(fromPeg, auxPeg, toPeg, numDisks-1);

	    // Step 2: Move 1 disk from the fromPeg to
	    //         the toPeg.
	    System.out.println(numDisks + "\t" +
			       fromPeg + "\t" + 
			       toPeg);	

	    // Step 3: Move the numDisks-1 disks from the auxPeg
	    //         to the toPeg using the fromPeg.
	    towers(auxPeg, toPeg, fromPeg, numDisks-1);
	}
    }

    /**
     * Read the name of the peg that is to
     * contain the disks at the start of the 
     * game.  I.e this is the peg from which
     * the disks should be moved.
     * 
     * @return a character representing the
     *         peg containing the disks at the
     *         start of the game.
     */
    static char getFromPeg() 
    {
	char thePeg = 'z';
	String thePegg = null;
	
	// Prompt the user for a peg until they enter a valid
	// peg.
	while (thePeg != 'a' && thePeg != 'A' &&
	       thePeg != 'b' && thePeg != 'B' &&
	       thePeg != 'c' && thePeg != 'C') {
	    System.out.print("Enter the peg that holds the disks " +
			       "[A, B, C]: ");
	    String.(thePegg);
	    thePegg = in.nextLine();
	    thePeg = String.(thePegg);
	    // The enter key counts as a character
	    // when using readChar.  So we'll read that
	    // here and just throw it away.  Otherwise
	    // it will be read by the next read operation.
	    System.in.read();
	}

	return thePeg;
    }

    /**
     * Read the name of the peg that the disks
     * should end up on at the end of the game.
     * I.e. this is the peg to which the disks
     * should be moved.  This peg must be 
     * different than the toPeg.
     *
     * @param fromPeg the peg containing the disks
     *                at the start of the game.
     *
     * @return a character representing the peg that
     *         should hold the disks at the end of
     *         the game.
     */
    static char getToPeg(char fromPeg) {
	char thePeg = 'z';

	// Prompt the user for a peg until they enter a valid
	// peg.
	while (thePeg != 'a' && thePeg != 'A' &&
	       thePeg != 'b' && thePeg != 'B' &&
	       thePeg != 'c' && thePeg != 'C' ||
	       thePeg == fromPeg) {

	    // Probably a better way to do this would be to only
	    // offer the choice of the two pegs that are not the
	    // fromPeg!  I'll leave that as an exercise for you.
	    System.out.print("Enter the peg to move the disks to " +
			       "[A, B, C]: ");
	    thePeg = in.next();
	    

	    // The enter key counts as a character
	    // when using readChar.  So we'll read that
	    // here and just throw it away.  Otherwise
	    // it will be read by the next read operation.
	    in.nextChar();
	}

	return thePeg;
    }

    /**
     * Find and return the name of the aux. peg 
     * from the  names of the fromPeg and the toPeg.
     *
     * @param fromPeg the peg containing the disks
     *                at the start of the game.
     * @param toPeg the peg containing the disks
     *              at the end of the game.
     *
     * @return a character representing the the 
     *         aux. peg.
     */
    static char findAuxPeg(char fromPeg, char toPeg) {
	char auxPeg;
	
	// Is peg A being used?
	if (fromPeg == 'a' || fromPeg == 'A' ||
	    toPeg == 'a' || toPeg == 'A') {
	    
	    // Is peg B being used?
	    if (fromPeg == 'b' || fromPeg == 'B' ||
		toPeg == 'b' || toPeg == 'B') {

		// The pegs A and B are used so 
		// auxPeg must be C.
		auxPeg = 'C';
	    }
	    else {
		// The pegs A and C are used so
		// auxPeg must be B.
		auxPeg = 'B';
	    }
	}
	else {
	    // peg A is not used so the auxPeg
	    // must be A.
	    auxPeg = 'A';
	}

	return auxPeg;
    }

    /**
     * Ask the user for the number of disks in the game.
     * The number of disks must be greater than 0.
     *
     * @return the number of disks used in the game.
     */
    static int getNumDisks() {
	int numDisks = -1;

	while (numDisks <= 0) {
	    System.out.print("Enter the number of disks [ > 0]: ");
	    numDisks = in.readInt();
	}

	return numDisks;
    }

    /**
     * Print an introductory screen to the 
     * towers of Hanoi solver.
     */
    static void printIntro() {
	System.out.println("Towers of Hanoi!\n\n");
	System.out.println("     |      |      |");
	System.out.println("1    +      |      |");
	System.out.println("2   -+-     |      |");
	System.out.println("3  --+--    |      |");
	System.out.println("4 ---+---   |      |");
	System.out.println("=======================");
	System.out.println("     A      B      C\n");
    }
}
