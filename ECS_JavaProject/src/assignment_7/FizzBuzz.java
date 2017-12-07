package assignment_7;
import java.util.Scanner;
public class FizzBuzz {
	public static void main( String[] args )
	{
		int x;
		Scanner keyboard = new Scanner (System.in);

		System.out.println();
		for ( int n = 1 ; n <= 100 ; n++ )
		{
			if (n%15 == 0)
			{
				System.out.println("FizzBuzz");
			}
			else if (n%5 == 0)
			{
				System.out.println("Buzz");
			} 
			else if (n%3 == 0)
			{
				System.out.println("Fizz");
			} 
			else 
			{
				System.out.println(n);
			}
		}
		keyboard.close();
	}
}
