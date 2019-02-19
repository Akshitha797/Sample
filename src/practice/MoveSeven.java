package practice;

import java.util.Scanner;

public class MoveSeven {
	
	Scanner s=new Scanner(System.in);
	
	private int[] acceptElements()
	{
		System.out.println("Enter the size of the array :");
		int n=s.nextInt();
		
		int[] arr=new int[n];
		
		System.out.println("Enter the elements :");
		
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		return arr;
		
	}
	
	private static void moveSeven(int[] arr)
	{
		int temp=0;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
			if(arr[i]==7)
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {

		MoveSeven ms=new MoveSeven();
		
		moveSeven(ms.acceptElements());
	}

}
