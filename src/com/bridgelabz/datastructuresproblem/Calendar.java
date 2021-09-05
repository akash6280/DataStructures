package com.bridgelabz.datastructuresproblem;
import java.util.Scanner;

public class Calendar{
	
	public static void calendar(int month,int day,int year){
	
	 int y0,x,m0,d0;
	
	 y0 = year-(14-month)/12;
	 x = y0 + y0/4 - y0/100+y0/400;
	 m0 =month + 12 * ((14 - month) / 12) - 2;
	 d0 =(day + x + (31*m0)/12) % 7;
	 
	 int calendar[][]=new int[6][7];
	 int daysOfMonth[]= { 31, 29, 31, 30, 31, 30,
             31, 31, 30, 31, 30, 31 };
	 
	 int dayinmonth=daysOfMonth[month];
	 calendar[0][d0]=1;
	 int daycount=1;
	 for(int days=d0+1;days<=6;days++)
		 calendar[0][days]=++daycount;

	 for(int week=1;week<=5;week++) {
		 for(int days=0;days<=6;days++){
			 
		  calendar[week][days]=++daycount;
		  if(daycount==dayinmonth)
			 break;
		 }
		 if(daycount==dayinmonth)
			 break;
	 }
	
	 
	 for(int week=0;week<=5;week++) {
		 for(int days=0;days<=6;days++) {
			 if((calendar[week][days]!=0) && (calendar[week][days]>=1 && calendar[week][days]<=9))
				 System.out.print(" "+calendar[week][days]+" ");
			 
			 else if((calendar[week][days]!=0) && (calendar[week][days]>=10 && calendar[week][days]<=31))
			     System.out.print(calendar[week][days]+" ");
			 else 
				 System.out.print("  ");
		 }
		 System.out.println();
	 }

	}
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter month and year");
		int month=scanner.nextInt();
		int year=scanner.nextInt();
		
		calendar(month,1,year);
		scanner.close();
	}
}