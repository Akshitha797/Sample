package practice;

import java.util.Scanner;

public class TrainSeatingArrangement {
	
	Scanner s=new Scanner(System.in);
	public int input()
	{
		System.out.println("Enter the seat number");
		
		int sn=s.nextInt();
		
		return sn;
	}
	
	
	public static void trainSeatingArrangement(int sn)
	{
		
		int ch=sn%12;
		
		switch(ch)
		{
		
		case 0 : System.out.println(sn-11 +"  WS");
		         break;
		         
		case 1 : System.out.println(sn+11 +"WS");
				break;
		
		case 2 : System.out.println(sn+9 +"  MS");
				break;
		
		case 3 : System.out.println(sn+7 +"  AS");
				break;
		
		case 4 : System.out.println(sn+5 +"  AS");
				break;
			
		case 5 : System.out.println(sn+3 +"  MS");	
				break;
				
		case 6 : System.out.println(sn+1 +"  WS");	
				break;
				
		case 7 : System.out.println(sn-1 +"  WS");
				break;
				
		case 8 : System.out.println(sn-3 +"  MS");		
				break;
				
		case 9 : System.out.println(sn-5 +"  AS");		
				break;
				
		case 10 : System.out.println(sn-7 +"  AS");		
				break;
				
		case 11 : System.out.println(sn-9 +"  MS");		
				break;
				
		case 12 : System.out.println(sn-11 +"  WS");		
				break;

		
		}
		
	}

	public static void main(String[] args) {

		TrainSeatingArrangement t=new TrainSeatingArrangement();
		trainSeatingArrangement(t.input());
	}

}
