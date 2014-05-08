import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class Reverse
{
       private static String infilename = "";
       /**
        * @param args
        */
       public static void main(String[] args)
       {
               Scanner in = null;
               FileWriter out = null;

               try
               {
               // Open a file
               String infilename = getInputFileName();
               in = new Scanner(new FileReader(infilename));
               String outfilename = infilename.substring(0, infilename.indexOf(".", 0)) + ".out";

                       out = new FileWriter(outfilename);

                       while (in.hasNextLine())
                       {
                               // get the line , reverse the line, write the reversed line to output file
                               String line = in.nextLine();
                               for (int indexValue = line.length() - 1;indexValue >= 0; indexValue--)
                               {
                               out.append(line.charAt(indexValue));
                               }
                               out.append('\n');
                       }

                       System.out.println("The File " + outfilename + " is now a mirrored image of the input file: " + infilename + ".");
               }
               catch (FileNotFoundException e)
               {
                       System.out.println("File not Found ...");
                       System.exit(0);
               }
               catch (IOException e) {
                       // TODO Auto-generated catch block
                       e.printStackTrace();
               }
               finally
               {
                       if (in !=null)
                               in.close();
                       try
                       {
                               if (out !=null)
                                       out.close();
                       } catch (IOException e) {
                               // TODO Auto-generated catch block
                               e.printStackTrace();
                       }
               }

       }
       private static String getInputFileName()
       {
           /**JFileChooser chooser1 = new JFileChooser();
           *String filename = null;
           /**if (chooser1.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
           *{
           *    File selectedFile = chooser1.getSelectedFile();
           *    filename = selectedFile.getName();
           *   
           *}
           */
           
    	   
    	   
    	   System.out.println("Please Enter the File Name: ");    
    	   Scanner in = new Scanner(System.in);
           infilename = in.nextLine();
           //filename = infilename;
           return infilename;
       }

}
