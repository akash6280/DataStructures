package com.bridgelabz.datastructuresproblem;

import java.util.Arrays;
import com.bridgelabz.datastructure.*;
public class PrimeAnagramsStack {
	public static  int startNumber=1;
	public static  int endNumber=1000;
	
	static boolean isAnagram(String string1, String string2) {  
	      
        if (string1.length() != string2.length()) {  
            return false; 
        } 
        else {  
            char[] string1Array = string1.toCharArray();  
            char[] string2Array = string2.toCharArray();  
            
            Arrays.sort(string1Array);  
            Arrays.sort(string2Array);  
           
           if (Arrays.equals(string1Array,string2Array))
        	   return true;
           else
        	   return false;
        }
	}
  
	public static boolean isPrime(int number) {
		for (int factor = 2; factor<= Math.sqrt(number); factor++) {
			if (number % factor == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void isPrimeAnagram() {
		Stack<Integer> myStack=new Stack<>();
		for(int number1=startNumber;number1<=endNumber;number1++)
			for(int number2=number1+1;number2<=endNumber;number2++)
				
				if(isPrime(number1)&&isPrime(number2)) {
				
					if(isAnagram(Integer.toString(number2),Integer.toString(number1))) {
						myStack.push(new NodeImpl<Integer>(number1));
						myStack.push(new NodeImpl<Integer>(number2));
					
				}
			}
				myStack.popAll();
	}
	public static void main(String[] args) {
		isPrimeAnagram();
	}
}
