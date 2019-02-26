package practice;

import java.util.Scanner;

public class ProfilePicture {
	
	Scanner s=new Scanner(System.in);
	public int input()
	{
		System.out.println("Enter the size :");
		int n=s.nextInt();
		return n;
	}

	public static void profilePicture(int l,int w,int h)
	{
		if(l>w || l>h)
			System.out.println("UPLOAD ANOTHER");
		else
		{
			if(w==h)
				System.out.println("ACCEPTED");
			else
				System.out.println("CROP IT");
		}
	}
	public static void main(String[] args) {
		
		ProfilePicture p=new ProfilePicture();
		profilePicture(45, p.input(), p.input());

	}

}
