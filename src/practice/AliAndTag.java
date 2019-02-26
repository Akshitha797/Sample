package practice;

import java.util.Scanner;

public class AliAndTag {
	Scanner s=new Scanner(System.in);
	public String input()
	{
		System.out.println("Enter the tag :");	
		String str=s.next();
		return str;
	}	
	public static void aliAndTag(String str)
	{		
	if(str.charAt(2)=='A'||str.charAt(2)=='E'||str.charAt(2)=='I'||str.charAt(2)=='O'||str.charAt(2)=='U'||str.charAt(2)=='Y')
		System.out.println("invalid");
	else
	{
		if((str.charAt(0)+str.charAt(1))%2==0 && (str.charAt(3)+str.charAt(4))%2==0 && (str.charAt(4)+str.charAt(5))%2==0 && (str.charAt(7)+str.charAt(8))%2==0)
		     System.out.println("Valid");			
		else		
			System.out.println("Invalid");
	}	
	}
	public static void main(String[] args) {
		AliAndTag a=new AliAndTag();
		aliAndTag(a.input());
	}

}
