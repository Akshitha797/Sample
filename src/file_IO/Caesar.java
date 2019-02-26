package file_IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Caesar {
	
	Scanner s=new Scanner(System.in);
	
	public StringBuilder inputMsg()
	{
		FileInputStream fileInputStream;
		StringBuilder sb=new StringBuilder();
		
		try {
			fileInputStream = new FileInputStream("F:\\\\JavaPrograms\\\\Message.txt");			
			int i;
			while((i=fileInputStream.read())!=-1) {
				sb.append((char) i);
			}
			
			fileInputStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		return sb;
	}
	
	public int inputKey()
	{
		FileInputStream fileInputStream;
		int k=0;
		try {
			fileInputStream = new FileInputStream("F:\\\\JavaPrograms\\\\Key.txt");

			k=fileInputStream.read();
			fileInputStream.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return k;
	}
	
		
	public static StringBuilder encryption(StringBuilder message,int k)
	{
		String msg=message.toString();
		char[] letters=msg.toCharArray();
		StringBuilder encryptedMsg=new StringBuilder();
		for (int i = 0; i < letters.length; i++) {
			encryptedMsg.append((char)(byte)(letters[i]+k));
		}
		System.out.println(encryptedMsg);
		return encryptedMsg;
	}
	
	
	public static void encryptedFile(StringBuilder encryptedmsg)
	{
		

	    String n=encryptedmsg.toString();
	    byte[] b=n.getBytes();
		
		try
		{
		FileOutputStream fileOutputStream = new FileOutputStream("F:\\JavaPrograms\\EncryptedMsg.txt");
		
		fileOutputStream.write(b);
		fileOutputStream.close();
		
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public StringBuilder inputEncryptedMsg()
	{
		FileInputStream fileInputStream;
		StringBuilder sb=new StringBuilder();
		
		try {
			fileInputStream = new FileInputStream("F:\\\\JavaPrograms\\\\EncryptedMsg.txt");			
			int i;
			while((i=fileInputStream.read())!=-1) {
				sb.append((char) i);
			}
			
			fileInputStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		return sb;
	}
	

	
	
	public static void decryption(StringBuilder b,int k)
	{
		
		String msg=b.toString();
		char[] letters=msg.toCharArray();
		StringBuilder decryptedMsg=new StringBuilder();
		for (int i = 0; i < letters.length; i++) {
			decryptedMsg.append((char)(byte)(letters[i]-k));
		}
		System.out.println(decryptedMsg);
	}
	
	

	public static void main(String[] args) {
		
		Caesar c= new Caesar();		
		StringBuilder x=new StringBuilder();
		x=encryption(c.inputMsg(), c.inputKey());
		decryption(c.inputEncryptedMsg(),c.inputKey());

	}

}

