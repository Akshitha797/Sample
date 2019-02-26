package practice;

import java.util.Scanner;

public class BrickGame {
	
	Scanner s=new Scanner(System.in);
	
	public int input()
	{
		System.out.println("Enter the number of bricks :");
		int n=s.nextInt();
		return n;
	}
	
	public static void brickGame(int n)
	{
		
	   int a=0,b=0;
	   a=n%3;
	   b=n/3;
	   
	   if(a+b-1<=b)
		   System.out.println("Patlu");
	   else
		   System.out.println("Motu");
	}

	public static void main(String[] args) {

		BrickGame b=new BrickGame();
		brickGame(b.input());
	}

}
