
public class Reverser 
{
	String reversedString = new String();
	public Reverser(String reverse1) 
	{
		if (reverse1.length() < 0)
			return;
		if (reverse1.length() == 0)
			return;
		int lastindex = reverse1.length();
		String subReverse1 = reverse1.substring(1, lastindex);
		Reverser reverse2 = new Reverser(subReverse1);
		reversedString = reverse2.getText() + reverse1.charAt(0);
		
	}
	public String getText() 
	{
		
		return reversedString;
	}

}
