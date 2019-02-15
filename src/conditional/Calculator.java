package conditional;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter two numbers : ");
		
		double i1=s.nextDouble();
		double i2=s.nextDouble();
		
		System.out.println("select the operation to be performed : ");
		System.out.println("+  addition"+"\n"+"- subraction"+"\n"+"* multiplication"+"\n"+"/ division");
		
		String ch=s.next();
		
		switch(ch)
		{
		case "+" : System.out.println("addition is : "+(i1+i2));
		break;
		
		case "-" : System.out.println("addition is : "+(i1-i2));
		break;

		case "*" : System.out.println("addition is : "+(i1*i2));
		break;

		case "/" : System.out.println("addition is : "+(i1/i2));
		break;
		
		default : System.out.println("invalid operator");
		
		
		}

	}

}
