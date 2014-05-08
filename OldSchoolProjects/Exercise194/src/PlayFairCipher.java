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
	private ArrayList<Character> alphabet = new ArrayList<Character>();
	private ArrayList<Character> characterList = new ArrayList<Character>();
	static Map<Character, Boolean> characterMap = new HashMap<Character, Boolean>();
	final int ROWS = 5;
	final int COLUMNS = 5;
	private int rememberRow = 0;
	private int rememberColumn = 0;
	private char[][] characterMatrix = new char[ROWS][COLUMNS];
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
		
		
		keywd = k.toUpperCase();
		klen = k.length();
		
		String newKey = new String();
		
		characterList.add(keywd.charAt(0));
		
		for(int j = 0; j < klen; j++)
		{
			
			char addedChar = keywd.charAt(j);
			
			for(int h = 0; h < characterList.size(); h++)
			{
				
				if(addedChar != characterList.get(h))
				{
					characterList.add(addedChar);
					
				}
			}
			
		}
		newKey = characterList.toString();
		int newKeyLength = newKey.length();
		
		for (int i = 0; i < newKeyLength; i++)
		{	
			
			for(int a = 0; a < 5; a++)
			{
				for(int b = 0; b < 5; b++)
				{
					characterMatrix[a][b] = newKey.charAt(i);
					characterMap.put(newKey.charAt(i), true);
					if(i == newKeyLength - 1)
					{
						rememberRow = a;
						b++;
						rememberColumn = b;
					}
				}
			}
				
		}
		for (int c = 0; c < characterMap.size(); c++)
		{
			char toBeAdded = alphabet.get(c);
			boolean addedOrNot = characterMap.get(toBeAdded);
			if(addedOrNot == false)
			{
				for(int a = rememberRow; a < 5; a++)
				{
					for(int b = rememberColumn; b < 5; b++)
					{
						characterMatrix[a][b] = toBeAdded;
						characterMap.put(toBeAdded, true);
					}
				}
			}
		}
		
		
	}

	/**
	 * Encrypts the contents of a stream
	 * @param in the input stream
	 * @param out the output stream
	 * @throws IOException
	 */
	public void encryptStream(InputStream in, OutputStream out)
			throws IOException
	{
		
		boolean done = false;
		int pos = 0;
		while (!done) {
			int next = in.read();
			if (next == -1) done = true;
			else {
				//next = Character.toUpperCase(next);
				byte b = (byte) next;
				byte c = encrypt(b, pos);
				out.write(c);
				pos++;
			}
		}
	}

	private byte encrypt(byte b, int p) {
		// TODO Auto-generated method stub
		return (byte)((b-' ' + (int)(keywd.charAt(p%klen) - 'A'))%95 + ' ');
	}

	/**
	 * Decrypts the contents of a stream
	 * @param in the input stream (an encrypted file)
	 * @param out the output stream (plain text)
	 * @throws IOException
	 */
	public void decryptStream(InputStream in, OutputStream out)
	throws IOException
	{
		boolean done = false;
		int pos = 0;
		while (!done) {
			int next = in.read();
			if (next == -1) done = true;
			else {
				byte b = (byte) next;
				byte c = decrypt(b, pos);
				out.write(c);
				pos++;
			}
		}
	}

	private byte decrypt(byte b, int p) {
		// 	TODO Auto-generated method stub
		int key = (int)(keywd.charAt(p%klen)-'A');
		return (byte)((b-' ' - key + 95)%95 + ' ');
	}

}

