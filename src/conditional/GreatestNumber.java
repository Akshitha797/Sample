package conditional;

import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter three numbers : ");
		int num1=s.nextInt();
		int num2=s.nextInt();
		int num3=s.nextInt();
		
		if(num1==num2 && num2==num3)
			System.out.println("three numbers are identical");
		else
		{
		
		if(num1 > num2)
		{
			if(num1 > num3)
				System.out.println("the greatest number is "+num1);
		}
		else if(num2>num3)
		{
				System.out.println("the greatest number is "+num2);
		}
		else 
			System.out.println("the greatest number is "+num3);

		}
	}

}
