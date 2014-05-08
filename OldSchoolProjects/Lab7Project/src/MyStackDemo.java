import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class MyStackDemo {

	/**
	 * @param args
	 * Author - John Bartels and Dietrich Eherenmen
	 */
	final static MyStack<Integer> stack1 = new MyStack<Integer>();
	final static MyStack<String> stack2 = new MyStack<String>();
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
			getUserInput();
		stack1.printAllElements();
		
		stack1.popFromStack();
		int userInt = 0;
		System.out.println("Please enter a value to add to the stack: ");
		userInt = in.nextInt();
		stack1.pushOntoStack(userInt);
		stack1.printAllElements();
		
		getStringList();
		stack2.printAllElements();
		
	}

	private static void getUserInput() {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter list of integers [Q to quit]: ");
		do
		{
			String line = in.nextLine();
			if (line.charAt(0) == 'Q' || line.charAt(0) == 'q')
				return;
			stack1.pushOntoStack(Integer.parseInt(line));
		}
		while (true);
	
	}

	private static void getStringList() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter list of String [Q to quit]: ");
		do
		{
			String line = in.nextLine();
			if (line.charAt(0) == 'Q' || line.charAt(0) == 'q')
				return;
			stack2.pushOntoStack(line);
		}
		while (true);
		
	}

	private static ArrayList<Integer> getIntegerList() 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner in = new Scanner(System.in);
			System.out.println("Please enter list of integers [Q to quit]: ");
			do
			{
				String line = in.nextLine();
				if (line.charAt(0) == 'Q' || line.charAt(0) == 'q')
					break;
				stack1.pushOntoStack(Integer.parseInt(line));
			}
			while (true);
			return list;

	}

}
