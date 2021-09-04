package com.bridgelabz.datastructuresproblem;

import java.util.Scanner;
import com.bridgelabz.datastructure.*;

public class PalindromeChecker {
	static Scanner scanner = new Scanner(System.in);
	
	public static boolean isPalindrome(char[] symbols) {
		DeQueue<Character> myDeque = new DeQueue<Character>();
		
		for(char symbol : symbols) {
			NodeImpl<Character> newNode = new NodeImpl<Character>(symbol);
			myDeque.addRear(newNode);
		}
		while(myDeque.size()>1) {
			if(myDeque.removeFront()==myDeque.removeRear()) {
				continue;
			}
			else 
				return false;
		}
		if(myDeque.size()==1)
			return true;
		return myDeque.isEmpty();
	}


	public static void main(String[] args) {
			
			System.out.println("Enter a String");
			String inpuString = scanner.next();
			char[] charArray = inpuString.toCharArray();
			System.out.println(isPalindrome(charArray));
			
		}
}
