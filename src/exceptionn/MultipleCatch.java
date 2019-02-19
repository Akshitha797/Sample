package exceptionn;

public class MultipleCatch {

	public static void main(String[] args) {

		int arr[]= {1,2,3};
		
		System.out.println("start");
		try
		{
			System.out.println(arr[7]);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		try
		{
			System.out.println(2/0);
		}
		
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println("Mother Exception");
		}
		
		System.out.println("End");
	}

}
