package file_IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReaderByte {

	public static void main(String[] args) {

		FileInputStream fileInputStream;
		try {
			fileInputStream = new FileInputStream("F:\\JavaPrograms\\Demo.txt");

			int i;
			while((i=fileInputStream.read())!=-1) {
				System.out.print((char) i);
			}
			
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
