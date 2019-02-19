package string;

import java.util.Scanner;

public class TimeConversion {
	
	public static String timeConversion(String str)
	{
		int hours=0;
		String ans="";
		String[] str1=str.split(":");
		
		if(str1[2].endsWith("PM"))
		{
			if(str1[0].equals("12"))
			{
				hours=12;

			}
			else
			{
				hours=12+Integer.parseInt(str1[0]);
				
			}
			
			ans=String.valueOf(hours)+":"+str1[1]+":"+str1[2].charAt(0)+str1[2].charAt(1);
		}
		else
		{
			if(str1[0].equals("12"))
			{
				hours=00;

			}
			
			ans=String.valueOf(hours)+":"+str1[1]+":"+str1[2].charAt(0)+str1[2].charAt(1);
		}
		return ans;
		
		
		
		//int str2[]=new int[str1.length];
		
		//for(int i=0;i<str1.length;i++)
		//{
			//str2[i]=Integer.parseInt(str1[i]);
		//}
		
		
	}

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		
		String str=s.next();
		String s1=timeConversion(str);
		
		System.out.println(s1);
		
	}

}
