package practice;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOdd {
	
	Scanner s=new Scanner(System.in);
	
	public int[] acceptElements()
	{
		System.out.println("Enter the size of array :");
		int n=s.nextInt();
		int[] arr=new int[n];
		
		System.out.println("Enter the elements :");
		
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		
		return arr;
	}
	
	public static void evenAndOdd(int[] arr)
	{
		int count=0;
		int count1=0;
		int count2=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
				count1++;
			else
				count2++;
		}
		
		int[] even=new int[count1];
		int[] odd=new int[count2];
		int c1=0;
		int c2=0;
		
		for(int j=0;j<arr.length;j++)
		{
			
			if(arr[j]%2==0)
			{

				even[c1++]=arr[j];
				
			}
			else
			
				{
					odd[c2++]=arr[j];
				}
			
		}
		
		Arrays.sort(even);
		Arrays.sort(odd);
		
		for(int i=0;i<even.length;i++)
		{
			arr[i]=even[i];
			count++;
		}
		
		for(int j=0;j<odd.length;j++)
		{	
			arr[count++]=odd[j];		
		}
	
		for(int k=0;k<arr.length;k++)
		{
			System.out.println(arr[k]);
		}
		
	}

	public static void main(String[] args) {

		EvenAndOdd e=new EvenAndOdd();
		evenAndOdd(e.acceptElements());
	}

}
