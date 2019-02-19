package exceptionn;

public class App1 {

	public static void main(String[] args) {
	
		try
		{
			throw new MyCustomException();
		}
		
		catch(MyCustomException e)
		{
			//System.out.println(e);
		}
		
		//catch(Exception e)
		//{
			//System.out.println(e);
		//}

	}

}
