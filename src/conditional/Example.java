package conditional;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int i=s.nextInt();
		
		if(i%2==0)
			System.out.println(i+10);
		else
			System.out.println(i+15);

	}

}
