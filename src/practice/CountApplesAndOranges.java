package practice;

import java.util.Scanner;

public class CountApplesAndOranges {
	
	public static void countApplesAndOranges(int s,int t,int a,int b,int[] apples,int[] oranges)
	{
		int apple=0;
		int orange=0;
		int d1=s-a;
		int d2=b-t;
		
		for(int i=0;i<apples.length;i++)
		{
			if(apples[i]>=d1 && apples[i]<=t-a)
			{
				apple++;
			}
		}
		
		for(int i=0;i<oranges.length;i++)
		{
			if(oranges[i]>=d2 && apples[i]<=b-s)
			{
				orange++;
			}
		}
		
		System.out.println("Number of apples falling in the house :"+apple);
		System.out.println("Number of oranges falling in the house :"+orange);

	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		
		System.out.println("Enter the statrting point of house :");
		int s=sc.nextInt();
		System.out.println("Enter the ending point of the house :");
		int t=sc.nextInt();
		System.out.println("Enter the position of apple tree :");
		int a=sc.nextInt();
		System.out.println("Enter the position of orange tree :");
		int b=sc.nextInt();
		System.out.println("Enter the no of apples falling :");
		int m=sc.nextInt();
		
		int[] apples=new int[m];
		
		System.out.println("Enter the no of oranges falling :");
		int n=sc.nextInt();
		
		int[] oranges=new int[n];
		
		System.out.println("enter the order of apples :");
		
		for(int i=0;i<m;i++)
		{
			apples[i]=sc.nextInt();
		}
		
		System.out.println("enter the order of oranges :");
		
		for(int i=0;i<n;i++)
		{
			oranges[i]=sc.nextInt();
		}
		
		countApplesAndOranges(s,t,a,b,apples,oranges);

	}

}
