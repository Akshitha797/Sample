package loop;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the number :");
		
		int num=s.nextInt();
		
		int i=1;
		
		while(i<=10)
		{
			System.out.println(num+"*"+i+"="+(num*i));
			i++;
		}

	}

}
