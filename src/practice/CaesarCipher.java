package practice;

import java.util.Scanner;

public class CaesarCipher {
	
	Scanner s=new Scanner(System.in);
	
	public String inputMsg()
	{
		System.out.println("Enter the message :");
		
		String message=s.next();
		return message;
	}
	
	public int inputKey()
	{
		System.out.println("Enter the key :");
		int k=s.nextInt();
		return k;
	}
	
	public static StringBuilder encryption(String message,int k)
	{
		char[] letters=message.toCharArray();
		StringBuilder encryptedMsg=new StringBuilder();
		for (int i = 0; i < letters.length; i++) {
			encryptedMsg.append((char)(byte)(letters[i]+k));
		}
		System.out.println(encryptedMsg);
		return encryptedMsg;
	}
	
	public static void decryption(StringBuilder encryptedMsg,int k)
	{
		String msg=encryptedMsg.toString();
		char[] letters=msg.toCharArray();
		StringBuilder decryptedMsg=new StringBuilder();
		for (int i = 0; i < letters.length; i++) {
			decryptedMsg.append((char)(byte)(letters[i]-k));
		}
		System.out.println(decryptedMsg);
	}
	
	

	public static void main(String[] args) {
		
		CaesarCipher c= new CaesarCipher();

		decryption(encryption(c.inputMsg(),c.inputKey()),c.inputKey());

	}

}
