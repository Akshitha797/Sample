package array;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		long[] customerDetails=new long[4];
		
	//	long kotak=customerDetails[4];
		
	
		for(int i=0;i<customerDetails.length;i++)
		{
			System.out.println("Enter Account Number :");
			long accNo=s.nextLong();
			customerDetails[0]=accNo;
			
			System.out.println("Enter Aadhar Card Number :");
			long aadharCard=s.nextLong();
			customerDetails[1]=aadharCard;
			
			System.out.println("Enter the balance :");
			long balance=s.nextLong();
			customerDetails[2]=balance;
			
			System.out.println("Enter Contact Number :");
			long contact=s.nextLong();
			customerDetails[3]=contact;
		}
		
		
		
		
		for(int i=0;i<customerDetails.length;i++)
		{
			System.out.println(customerDetails[i]);
		}
		
		
		
	}

}
