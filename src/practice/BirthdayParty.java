package practice;

import java.util.Scanner;

public class BirthdayParty {
	
	Scanner s=new Scanner(System.in);
	
	public int input()
	{
		int n=s.nextInt();
		return n;
	}
	
	public static void birthdayParty(int n1,int n2)
	{
		if(n2%n1==0)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

	public static void main(String[] args) {

		BirthdayParty b=new BirthdayParty();
		
		birthdayParty(b.input(), b.input());
		
	}

}
