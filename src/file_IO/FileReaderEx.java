package file_IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReaderEx {

	public static void main(String[] args) {

		FileInputStream fileInputStream;
		try {
			fileInputStream = new FileInputStream("F:\\JavaPrograms\\Demo.txt");

			System.out.println(fileInputStream.read());
			fileInputStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
