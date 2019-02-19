package practice;

import java.util.Scanner;

public class GreaterThanAvg {

	
	Scanner s=new Scanner(System.in);
	
	private double[] acceptElements()
	{
		System.out.println("Enter the size of array :");
		int n=s.nextInt();
		
		double[] arr=new double[n];
		
		System.out.println("Enter the elements :");
		
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextDouble();
		}
		
		return arr;
		
	}

	public static void  greaterThanAvg(double[] arr)
	{

		
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
	
		double avg=sum/arr.length;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>avg)
			{
				System.out.println(arr[i]);
			}
		}
	}
	

	public static void main(String[] args) {

		GreaterThanAvg g=new GreaterThanAvg();
		
		greaterThanAvg(g.acceptElements());
	}

}
