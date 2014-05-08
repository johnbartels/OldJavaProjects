import java.util.Scanner;


public class Expression {

	private static int val;
	private String exprStr;
	Scanner inStr;
	private int currPos;
	
	
	public Expression(String expr) 
	{
		exprStr = expr;
		currPos = 0;
		val = getExpression();
		inStr = new Scanner(exprStr);
	}

	private int getExpression() 
	{
		// parse expression to numeric values
		int op1 = getTerm();
		// check to see if next character in expression is a plus or minus
		
		
		char nextChar;
		do
		{
			nextChar = exprStr.charAt(currPos);
			currPos++;
		}
		while (nextChar == ' ' || nextChar == '\t');
		if (nextChar == '+')
			return op1 + getExpression();
		if (nextChar == '-')
			return op1 - getExpression();
		currPos--; // this is incorrect but what we need to do
		return op1;
	}

	private int getTerm() 
	{
		int op1 = getFactor();
		// check to see if next character in expression is a plus or minus
		char nextChar;
		do
		{
			nextChar = exprStr.charAt(currPos);
			currPos++;
		}
		while (nextChar == ' ' || nextChar == '\t');
		if (nextChar == '+')
			return op1 + getTerm();
		if (nextChar == '-')
			return op1 - getTerm();
		currPos--; // this is incorrect but what we need to do
		return op1;
	}

	private int getFactor() {
		// Check for left parentheses
		char nextChar;
		do
		{
			nextChar = exprStr.charAt(currPos);
			currPos++;
		}
		while (nextChar == ' ' || nextChar == '\t');
		
		int op = getExpression();
		if (nextChar == ')')
			return op;
		
		return getNumber();
		// if not, evaluate a number
	}

	private int getNumber() {
		// Gather up a sequence of contiguous digits and evaluate
		// Skip over whitespace
		// evaluate the sequence of digits
		char nextChar;
		do
		{
			nextChar = exprStr.charAt(currPos);
			currPos++;
		}
		while (nextChar == ' ' || nextChar == '\t');
		currPos--;
		return evaluateDigits();
	}

	private int evaluateDigits() 
	{
		int num = 0;
		char nextChar = exprStr.charAt(currPos++);
		while (isDigit(nextChar))
		{
			num *= 10;
			num += (int)nextChar - (int)'0';  // parentheses around integer value causes compiler to 
		}
		return num;
	}

	private boolean isDigit(char nextChar) 
	{
		//check to see if character is a numeric value
		switch (nextChar)
		{
		case '0': case '1': case '2': case '3': case '4': case '5':
		case '6': case '7': case '8': case '9':
			return true;
		}
		return false;
	}

	public static int value()
	{
		return val;
	}
}
