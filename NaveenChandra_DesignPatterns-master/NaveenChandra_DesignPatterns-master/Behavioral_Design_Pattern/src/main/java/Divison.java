
public class Divison implements Calculator{
	public void Calculation(int a,int b)
	{
		try
		{
int d=a/b;
		System.out.println(d);
		
	}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}

}
}
