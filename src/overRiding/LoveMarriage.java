package overRiding;

class LoveMarriage extends ArrangedMarriage
{
	public void marriage()
	{
		System.out.println("Merry");
	}
	public static void main(String args[])
	{
		LoveMarriage s = new LoveMarriage();
		s.marriage();
	}
	
}