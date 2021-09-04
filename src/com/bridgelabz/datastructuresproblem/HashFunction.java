package com.bridgelabz.datastructuresproblem;
import java.util.*;

import com.bridgelabz.datastructure.*;

public class HashFunction {
	
	 static Scanner scanner=new Scanner(System.in);
	
		public static void printMap(LinkedList<Integer>[] linkedList) {
			for(int index=0;index<11;index++) {
				System.out.print(index+" --> ");
				linkedList[index].printMyNodes();
				System.out.println();
			}
		}
	 
		public static void main(String[] args) {
			
			LinkedList<Integer> linkedList[] = new LinkedList[11];
			
			for(int index=0;index<11;index++) {
			linkedList[index] = new LinkedList<Integer>();
			}
			
			System.out.println("Enter number of elements");
			int count=scanner.nextInt();
			for(int i=0;i<count;i++) {
				int number=scanner.nextInt();
				linkedList[number%11].add(new NodeImpl<Integer>(number));
			}
			
			System.out.println("Enter number to search:");

			int key =scanner.nextInt();
			int keyIndex =key%11;
			
			if(linkedList[keyIndex].find(key)!=null) {
				linkedList[keyIndex].deleteNode(key);
			} else {
				linkedList[keyIndex].add(new NodeImpl<Integer>(key));
			}
			printMap(linkedList);
		}
		
}
