package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import basics.Student1;

public class DeserializationEx {
	
	public static void main(String[] args) {
		
		try {
			FileInputStream fileInputStream=new FileInputStream("F:\\JavaPrograms\\objectFile.txt");
			
			ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
			
			Student1 s=(Student1)objectInputStream.readObject();
			
			System.out.println(s.getName()+" "+s.getRoll()+" "+s.getFees());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
