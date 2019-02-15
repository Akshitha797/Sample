package loop;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number : ");
		
	int i=s.nextInt();
	int rem;
	int rev=0;
	
	while(i>0)
	{
	    rem=i%10;
	    rev=rev*10+rem;
		i=i/10;
	}
	
	System.out.println("Reverse of given number is "+rev);

	}

}
