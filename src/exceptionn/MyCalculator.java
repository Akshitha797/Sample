package exceptionn;

import java.util.Scanner;

public class MyCalculator {

	public static void power(int[] base,int[] power)
	{
		
		for(int i=0;i<base.length;i++)
		{
			for(int j=i;j==i;j++)
			{
				try
				{
					if(base[i]==0)
					{
						throw new Exception();
					}
				}
				catch(Exception e)
				{
					System.out.println(e+": base should not be equal to zero");
				}
				
				try
				{
					if(base[i]==0 && power[j]==0)
					{
						throw new Exception();
					}
				}
				catch(Exception e)
				{
					System.out.println(e+": n and p should not be equal to zero");
				}
				
				try
				{
					if(base[i]<0 || power[j]<0)
					{
						throw new Exception();
					}
				}
				catch(Exception e)
				{
					System.out.println(e+": n or p should not be negative");
				}
				
				try
				{
					if(base[i]<0 && power[j]<0)
					{
						throw new Exception();
					}
				}
				catch(Exception e)
				{
					System.out.println(e+": n and p should not be negative");
				}
				
				if(base[i]>0 && power[j]>=0)
				{
					System.out.println(Math.pow(base[i], power[j]));
				}
				
			}
		}
		
	}
	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the no of elements :");
		int n=s.nextInt();
		
		int[] base=new int[n];
		int[] power=new int[n];
		
		System.out.println("Enter the base elements :");
		
		for(int i=0;i<n;i++)
		{
			base[i]=s.nextInt();
		}
		
		System.out.println("Enter the power elements :");
		
		for(int i=0;i<n;i++)
		{
			power[i]=s.nextInt();
		}
		
		power(base,power);
	}

}
