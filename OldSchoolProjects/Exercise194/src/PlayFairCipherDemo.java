import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;


public class PlayFairCipherDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		try
		{
			System.out.print("Input file: ");
			String inFile = in.next();
			System.out.print("Output file: ");
			String outFile = in.next();
			System.out.print("Encryption key: ");
			String key = in.next();
			
			InputStream inStream = new FileInputStream(inFile);
			OutputStream outStream = new FileOutputStream(outFile);
			
			PlayFairCipher cipher = new PlayFairCipher(key);
			cipher.encryptStream(inStream, outStream);
			
			inStream.close();
			outStream.close();
			
			String decryptedFile = outFile.substring(0, outFile.lastIndexOf('.')) + ".dcp";
			inStream = new FileInputStream(outFile);
			outStream = new FileOutputStream(decryptedFile);
			
			cipher.decryptStream(inStream, outStream);
			
			inStream.close();
			outStream.close();
		}
		catch (IOException e) 
		{
			System.out.println("Error processing file: " + e);
		}
	}

}

