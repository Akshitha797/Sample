package practice;

import java.util.Scanner;

public class RightTriangle {
	
	public static void rightTriangle(int l1,int l2,int l3)
	{
		int a=0;
		int b=0;
		int c=0;
		
		if(l1>l2)
		{
			if(l2>l3)
			{
				a=l1;
				b=l2;
				c=l3;
			}
		}
		else if(l2>l3)
		{
			a=l2;
			b=l1;
			c=l3;
		}
		
		else
		{
			a=l3;
			b=l1;
			c=l2;
		}
		
		int d= b*b + c*c;
		
		if(a*a == d)
		{
			System.out.println("It forms a right triangle");
		}
		else
		{
			System.out.println("It does not form a right triangle");
		}
		
		
	}

	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter 3 lengths of the triangle :");
		
		int l1=s.nextInt();
		int l2=s.nextInt();
		int l3=s.nextInt();
		
		rightTriangle(l1,l2,l3);

	}

}
