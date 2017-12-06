package assignment_6;

import java.util.Scanner;

public class CountingWhile 
{
	public static void main( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Type in a message and I'll display it 5 times. ");
		int n = 0;
		System.out.print( "Message: ");
		String message = keyboard.nextLine();
		while (n < 5)
		{
			System.out.println( (n+1) + ". " + message);
			n++;
		}
		keyboard.close();
	}
}
