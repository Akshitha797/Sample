package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import basics.Student1;

public class SerializationEx {

	public static void main(String[] args) {

		Student1 s=new Student1();
		s.setName("Akshitha");
		s.setRoll(123);
		s.setFees(35000);
		
		FileOutputStream fileOutputStream;
		try {
			fileOutputStream = new FileOutputStream("F:\\JavaPrograms\\objectFile.txt");
			ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(s);


		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
