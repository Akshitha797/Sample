package practice;

import java.util.Scanner;

public class SmallestAndLargest {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the size of the array :");
		int n=s.nextInt();
		
		int arr[]=new int[n];
		
		System.out.println("Enter the elements :");
		
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		

		System.out.println("Enter the position :");
		int pos=s.nextInt();
		
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}	
			
		
		}
		
		int sm=smallest(arr,pos);
		int l=Largest(arr,pos);
		System.out.println("The largest number is :"+arr[l]);
		System.out.println("The smallest number is :"+arr[sm]);


	}

	private static int Largest(int[] arr,int pos) {
					
				int l=arr.length - pos;
				return l;
						
		}
		
		
	private static int smallest(int[] arr,int pos) {
		
				int s=pos-1;
				return s;
		}
}	
