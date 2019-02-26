package file_IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputByte {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		try
		{
		FileOutputStream fileOutputStream = new FileOutputStream("F:\\JavaPrograms\\Demo.txt");
		System.out.println("Enter Name :");
		
		String n=s.next();
		
		byte[] b=n.getBytes();
		
		fileOutputStream.write(b);
		fileOutputStream.close();
		
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
