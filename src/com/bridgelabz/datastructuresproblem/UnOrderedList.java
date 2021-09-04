package com.bridgelabz.datastructuresproblem;

import com.bridgelabz.datastructure.*;

import java.util.Scanner;

public class UnOrderedList {
	 static Scanner scanner=new Scanner(System.in);
	 
	private static void searchWord(String[] listOFWords, String key) {
		
		LinkedList<String> linkedList=new LinkedList<>();	
		for(String word : listOFWords) {
			NodeImpl<String> newNode = new NodeImpl<String>(word);
			linkedList.append(newNode);
		}
		
		NodeIF<String> foundedNode=linkedList.find(key);
		if(foundedNode!=null) {
			linkedList.deleteNode(key);
			linkedList.printMyNodes();
		}
		else {
			
			linkedList.append(new NodeImpl<String>(key));
			linkedList.printMyNodes();
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the setence");
		String sentence = scanner.nextLine(); 
		String[] listOFWords = sentence.toLowerCase().split(" ");
		System.out.println("Enter the word to be searched");
		String key = scanner.next();
		searchWord(listOFWords,key);
		
	}

	
}
