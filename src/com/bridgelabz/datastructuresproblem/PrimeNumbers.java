package com.bridgelabz.datastructuresproblem;

public class PrimeNumbers {
	public static  int noOfRow=10;
	public static int noOfColumn=100;
	public static  int startNumber=1;
	public static  int endNumber=1000;
	
	public static boolean isPrime(int number) {
		for (int factor = 2; factor<= Math.sqrt(number); factor++) {
			if (number % factor == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[][] primeNumbers = new int[noOfRow][noOfColumn];
		for ( startNumber = 2; startNumber <= endNumber;startNumber++) {
			if (isPrime(startNumber)) {
				primeNumbers[startNumber/100][startNumber%100] = startNumber;
			}
		}

		printNumbers(primeNumbers);
	}

	public static void printNumbers(int[][] primeNumbers) {
		for(int i=0;i<primeNumbers.length;i++) {
			for(int j=0;j<primeNumbers[i].length;j++) {
				if(primeNumbers[i][j]!=0) {
					System.out.print(primeNumbers[i][j]+" ");
				}
			}
			System.out.println();
		}
	}
}