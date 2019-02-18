package practice;

import java.util.Scanner;

public class PlusMinus {
	
	public static void plusMinus(int[] arr)
	{
		
		double count1=0;
		double count2=0;
		double count3=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				count1++;
			}
			
			else if(arr[i]==0)
			{
				count2++;
			
			}
			
			else if(arr[i]>0)
			{
				count3++;
			}
		}
		
		
		System.out.println("the average of negative numbers is :"+(count1/arr.length));
		System.out.println("the average of zeroes is :"+(count2/arr.length));
		System.out.println("the average of positive numbers is :"+(count3/arr.length));
	}

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the size of the array :");
		
		int n=s.nextInt();
		
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
		
			System.out.println("Enter the element");
			arr[i]=s.nextInt();
		}
		
		plusMinus(arr);
	}

}
