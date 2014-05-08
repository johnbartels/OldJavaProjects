import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * This class encrypts files using the Vigenere Cipher.  It uses the same
 * key for both encryption and decryption. 
 * @author mcgrew
 *
 */
public class PlayFairCipher {
	// Data
	private String keywd;
	private int klen;      // Cycle length of the cipher
	private static ArrayList<Character> alphabet = new ArrayList<Character>();
	private static ArrayList<Character> characterList = new ArrayList<Character>();
	static Map<Character, Boolean> characterMap = new HashMap<Character, Boolean>();
	private static final int ROWS = 5;
	private static final int COLUMNS = 5;
	private static Character[][] characterMatrix;
	/**
	 * Constructs a cipher object with a given key.
	 * @param k	the encryption key
	 */
	public PlayFairCipher(String k) 
	{ // Specify the keyword for the cipher
		
		//Contruct map with all character values included.. and also contains
		//boolean element which keeps track of whether character has been 
		//added to playFair cipher Character Array
		
		characterMap.put('A', false); alphabet.add('A');
		characterMap.put('B', false); alphabet.add('B');
		characterMap.put('C', false); alphabet.add('C');
		characterMap.put('D', false); alphabet.add('D');
		characterMap.put('E', false); alphabet.add('E');
		characterMap.put('F', false); alphabet.add('F');
		characterMap.put('G', false); alphabet.add('G');
		characterMap.put('H', false); alphabet.add('H');
		characterMap.put('J', false); alphabet.add('J');
		characterMap.put('K', false); alphabet.add('K');
		characterMap.put('L', false); alphabet.add('L');
		characterMap.put('M', false); alphabet.add('M');
		characterMap.put('N', false); alphabet.add('N');
		characterMap.put('O', false); alphabet.add('O');
		characterMap.put('P', false); alphabet.add('P');
		characterMap.put('Q', false); alphabet.add('Q');
		characterMap.put('R', false); alphabet.add('R');
		characterMap.put('S', false); alphabet.add('S');
		characterMap.put('T', false); alphabet.add('T');
		characterMap.put('U', false); alphabet.add('U');
		characterMap.put('V', false); alphabet.add('V');
		characterMap.put('W', false); alphabet.add('W');
		characterMap.put('X', false); alphabet.add('X');
		characterMap.put('Y', false); alphabet.add('Y');
		characterMap.put('Z', false); alphabet.add('Z');
		
		characterMatrix = new Character[ROWS][COLUMNS];
		keywd = k.toUpperCase();
		klen = k.length();
		
		String newKey = new String();
		characterList.add(keywd.charAt(0));
		
		for(int j = 0; j < klen; j++)
		{
			
			char addedChar = keywd.charAt(j);
			
			if(characterList.contains(addedChar))
			{
				System.out.println();
			}
			else
			{
				characterList.add(addedChar);
			}
			
		}
		
		int counter1 = 0;
		int counter2 = 0;
			
		for(int a = 0; a < ROWS; a++)
		{
			for(int b = 0; b < COLUMNS; b++)
			{
				
				if(counter1 < characterList.size())
				{
					char addChar = characterList.get(counter1);
					characterMap.put(addChar, true);
					characterMatrix[a][b] = addChar;
					counter1++;
							
				}
				else
				{
					characterMatrix[a][b] = addNextChar();
					
				}
					
					
				
			}
			
				
		}
		
		
	}
	private Character addNextChar() 
	{
		// TODO Auto-generated method stub
		char toBeAdded = 'A';
		for (int i = 0; i < alphabet.size(); i++)
		{
			toBeAdded = alphabet.get(i);
			boolean addedOrNot = characterMap.get(toBeAdded);
		
		
			if(addedOrNot == false)
			{
				characterMap.put(toBeAdded, true);
				return toBeAdded;
				
			}
		}
		return null;
		//return toBeAdded;
	}
	public static void printCharacterMatrix()
	{
		char toBePrinted = 0;
		int characterNumber = 1;
		System.out.println("Character Matrix Printout: ");

		for(int a = 0; a < ROWS; a++)
		{
			for(int b = 0; b < COLUMNS;)
			{
				toBePrinted = characterMatrix[a][b];
				System.out.println("Character Number: " + characterNumber + " at Index Value: " + a + "," + b + " :" + toBePrinted);
				characterNumber++;
				b++;
			}
		}
		System.out.println("Character List on File: ");
		for(int i = 0; i < characterList.size(); i++)
		{
			char tobeprinted = characterList.get(i);
			System.out.println("Character : " + tobeprinted);
		}
		System.out.println("Alphabet on File: ");
		for(int i = 0; i < alphabet.size(); i++)
		{
			char tobeprinted = alphabet.get(i);
			System.out.println("Character : " + tobeprinted);
		}
		System.out.println("Character Map Boolean Values: ");
		
		for(int i = 0; i < alphabet.size(); i++)
		{
			char lookupChar = alphabet.get(i);
			
			boolean addedOrNot = characterMap.get(lookupChar);
			System.out.println("Character: " + lookupChar + " is set to: " + addedOrNot);
		}
	}
}