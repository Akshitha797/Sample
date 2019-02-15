package basics;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter first number : ");
		short num1=s.nextShort();
		System.out.println("Enter second number : ");
		short num2=s.nextShort();
		
		System.out.println("the addition is : "+(num1+num2));

	}

}
