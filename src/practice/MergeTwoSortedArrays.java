package practice;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoSortedArrays {
	
	 Scanner s=new Scanner(System.in);
	
	public double[] input1()
	{
		System.out.println("Enter the size of first array :");
		int m=s.nextInt();
		
		double[] arr1=new double[m];
		
		System.out.println("Enter the elements :");
		
		for(int i=0;i<m;i++)
		{
			arr1[i]=s.nextDouble();
		}
		
		Arrays.sort(arr1);
		
		return arr1;
	}
	
	public double[] input2()
	{
		System.out.println("Enter the size of second array :");
		int n=s.nextInt();
		
		double[] arr2=new double[n];
		
		System.out.println("Enter the elements :");
		
		for(int i=0;i<n;i++)
		{
			arr2[i]=s.nextDouble();
		}
		
		Arrays.sort(arr2);
		
		return arr2;
	}
	
	public static void  mergeTwoSortedArrays(double[] arr1,double[] arr2)
	{
		int count=0;
		int a=arr1.length+arr2.length;
		double[] arr=new double[a];
		
		for(int i=0;i<arr1.length;i++)
		{
			arr[i]=arr1[i];
			count++;
		}
		
		for(int j=0;j<arr2.length;j++)
		{	
			arr[count++]=arr2[j];		
		}
		
		Arrays.sort(arr);
		
		for(int k=0;k<a;k++)
		{
			System.out.println(arr[k]);
		}
		
		
	}

	public static void main(String[] args) {

		MergeTwoSortedArrays m=new MergeTwoSortedArrays();
		mergeTwoSortedArrays(m.input1(),m.input2());
	}

}
