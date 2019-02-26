package practice;

import java.util.Scanner;

public class StringConcatenation {
	
	Scanner s=new Scanner(System.in);
	
	public String inputString()
	{
		System.out.println("Enter the String :");
		
		String str=s.next();
		
		return str;
	}
	
	public static void stringConcatenation(String str1,String str2)
	{
		
		char[] inp1=str1.toCharArray();
		char[] inp2=str2.toCharArray();
		
		char[] out=new char[inp1.length+inp2.length];
		
		/*int c1=0,c2=0;
		for (int i = 0; i < out.length; i++) {
			
			if(i%2==0)
				out[i]=inp1[c1++];
			else
				out[i]=inp2[c2++];
			
		}
		
	
		
		StringBuilder s1=new StringBuilder();
		
		for (int i = 0; i < out.length; i++) {
			s1.append(out[i]);
		}
	
		
		System.out.println(s1); */
		
		int n=0;
		if(inp1.length>inp2.length)
		  n = inp1.length-inp2.length;
		else 
			n=inp2.length-inp1.length;
		
		char[] temp=new char[n];
		
		for(int i=0;i<n;i++)
		{
			if(inp1.length>inp2.length)
				temp[i]=inp1[inp1.length-i];
			else
				temp[i]=inp2[inp2.length-i];
				
		}
		
		
		int c1=0,c2=0;
		for (int i = 0; i < out.length-n; i++) {
			
			if(i%2==0)
				out[i]=inp1[c1++];
			else
				out[i]=inp2[c2++];
			
		}
		
		
		StringBuilder s1=new StringBuilder();
		
		for (int i = 0; i < out.length; i++) {
			s1.append(out[i]);
		}
		
		StringBuilder s2=new StringBuilder();
		
		for(int i=0;i<n;i++)
		{
			s2.append(temp[i]);
		}
		
		
		
	s1.append(s2);
		
		System.out.println(s1); 
	
		
	}

	public static void main(String[] args) {
		
		StringConcatenation sc=new StringConcatenation();
		
		stringConcatenation(sc.inputString(),sc.inputString());

		
	}

}
