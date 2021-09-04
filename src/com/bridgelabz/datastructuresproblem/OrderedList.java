package com.bridgelabz.datastructuresproblem;
import com.bridgelabz.datastructure.*;

import java.util.Scanner;

public class OrderedList {
	 static Scanner scanner=new Scanner(System.in);
	 
	private static void searchNumber(int[] listOFNumbers,int key) {
		
		LinkedList<Integer> linkedList=new LinkedList<Integer>();	
		for(int number : listOFNumbers) {
			NodeImpl<Integer> newNode = new NodeImpl<Integer>(number);
			linkedList.sortedInsert(newNode);
		}
		
		NodeIF<Integer> foundedNode=linkedList.find(key);
		if(foundedNode!=null) {
			linkedList.deleteNode(key);
			linkedList.printMyNodes();
		}
		else {
			
			linkedList.sortedInsert(new NodeImpl<Integer>(key));
			linkedList.printMyNodes();
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter the number of elements");
		int count  = scanner.nextInt();
		System.out.println("Enter the elements");
		int[] listOFNumbers=new int[count];
		for(int index=0;index<count;index++) {
			listOFNumbers[index]=scanner.nextInt();
		}
		System.out.println("enter key");
		int key=scanner.nextInt();
		searchNumber(listOFNumbers,key);
	}
}

