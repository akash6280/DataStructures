package com.bridgelabz.datastructuresproblem;
import com.bridgelabz.datastructure.*;
import java.util.Scanner;

public class BalancedParentheses {
	static Scanner scanner = new Scanner(System.in);
	
	public static boolean isParenthesesBalanced(char[] symbols) {
		Stack<Character> myStack = new Stack<Character>();
		for(char symbol : symbols) {
			
			if(symbol == '(' ) {
				myStack.push( new NodeImpl<Character>(symbol));
			}
			if(symbol == ')') {
				if(myStack.isEmpty())
					return false;
				myStack.pop();
			}
		}
		return myStack.isEmpty();
	}

	public static void main(String[] args) {
	
		System.out.println("Enter the expression");
		String expression = scanner.nextLine();
		
		char[] symbols = expression.toCharArray();

		System.out.println(isParenthesesBalanced(symbols));
		scanner.close();
	}
}
