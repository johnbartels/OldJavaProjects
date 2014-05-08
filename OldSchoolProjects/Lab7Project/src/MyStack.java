import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyStack<E>
{
	private ArrayList<E> stack1 = new ArrayList<E>();
	
	public MyStack()
	{
		stack1 = new ArrayList<E>();
	}
	public MyStack(ArrayList<E> s)
	{
		for (E element : s)
		{
			stack1.add(element);
		}
	}
	
	public void printAllElements()
	{
		for (E element : stack1)
		{
			System.out.println("Value: " + element);
		}
	}
	
	public void popFromStack()
	{
		stack1.remove(0);
	}
	public void pushOntoStack(E r)
	{
		stack1.add(0, r);
	}
	public E viewTopOfStack()
	{
		return stack1.get(0);
		
	}
	public E viewBottomOfStack()
	{
		return stack1.get(stack1.size()-1);
	}
	public boolean isEmpty()
	{
		if(stack1.size() == 0)
		{
			return true;
		}
		return false;
	}
	

}
