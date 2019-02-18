package practice;

import java.util.Scanner;


public class DiagonalDifference {
	
	public static void operation(int[][] mat)
	{	
		int sum1=0;
		int sum2=0;
		
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				if(i==j)
				{
					sum1=sum1+mat[i][j];
				}
				
				if(i==mat.length-j-1)
				{
					sum2=sum2+mat[i][j];
				}
			}
		}
		
		
		System.out.println(Math.abs(sum1-sum2));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the row :");
		int row=s.nextInt();
		System.out.println("Enter the column :");
		int col=s.nextInt();
		
		int mat[][]=new int[row][col];
		
		if(row!=col)
		{
			System.out.println("Enter the square matrix only");
		}
		
		else
		{
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					System.out.println("Enter the element :");
					mat[i][j]=s.nextInt();
					
				}
			}
			
			
		}
		
		
		
		operation(mat);
		
		

	}

}
