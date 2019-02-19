package practice;

import java.util.Scanner;

public class BirthdayCakeCandles {
	
	public static int birthdayCakeCandles(int[] arr)
	{
		int s=0;
		int count=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>s)
			{
				s=arr[i];
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==s)
			{
				count++;
			}
		}
	
		return count;
	}

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the no of candles :");
		int n=s.nextInt();
		
		int[] arr=new int[n];
		
		System.out.println("Length of the candles are :");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		
		int count=birthdayCakeCandles(arr);
		System.out.println("the no of candles she can blow is :"+count);

	}

}
