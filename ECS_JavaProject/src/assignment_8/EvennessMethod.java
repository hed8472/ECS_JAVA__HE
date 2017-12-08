package assignment_8;

public class EvennessMethod {
	public static void main( String [] args )
	{
		for ( int n = 1 ; n <= 100 ; n= n+1 )
		{
			
			System.out.print(n);
			isEven(n);
			isDivBy3(n);
			System.out.println();
		}
		
		
		
	}
	public static void isEven(int c)
	{
		if (c%2 == 0)
		{
			System.out.print(" <");
		}
	}
	public static void isDivBy3(int c)
	{
		if (c%3 == 0)
		{
			System.out.print(" =");
		}
	}
}
