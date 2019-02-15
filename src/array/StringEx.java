package array;

import java.util.Scanner;

public class StringEx {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		
		
		//1D
		
		int accNo[] = new int[5];
		
		for(int i=0;i<accNo.length;i++)
		{
			System.out.println("Enter the number : ");
			accNo[i]=s.nextInt();
		}
		
		for(int i=0;i<accNo.length;i++)
		{
			System.out.println(accNo[i]);
		} 
		
		
		
		
		
		// 2D
		
		System.out.println("Enter rows and columns : ");
		int row =s.nextInt();
		int col=s.nextInt();
		int mat1[][]=new int[row][col];
	     
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.println("Enter the element :");
				mat1[i][j]=s.nextInt();
				
			}
		}
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(mat1[i][j]+" ");
			}
			
			System.out.println();
		}
	}

}
