package arrayList;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
public class ArrayListToArray1 {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		FileInputStream fileInputStream;
		try {
			fileInputStream = new FileInputStream("F:\\JavaPrograms\\ArrayList.txt");
			int i;
			while((i=fileInputStream.read())!=-1) {		
				if(i!='-')
					a.add(i);
			}
			Object[] array=a.toArray();
			for (int j = 0; j < array.length; j++) {
			System.out.println(array[j]);	
			}	
			fileInputStream.close();
		} catch(FileNotFoundException e){
			e.printStackTrace();
		} catch(IOException e){
			e.printStackTrace();
		}			
	}
}
