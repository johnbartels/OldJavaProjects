import java.util.Scanner;


public class ExpressionEvaluator 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// Get an expression from the keyboard and evaluate expression
		String expr = getExpression();
		
		// Evaluate the expression
		Expression express1 = new Expression(expr);
		
		// Output the value of the expression
		System.out.println("The value of " + expr + " is " + Expression.value());

	}

	private static String getExpression() 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an arithmetic expression: ");
		String expr = in.nextLine();
		return expr;
	}

}
