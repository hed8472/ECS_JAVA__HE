
package assignment_5;

import java.util.Random;
import java.util.Scanner;
public class HiLow {
	public static void main ( String[] args )
	{
		int y;
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);
		int x = 1 + r.nextInt(100);
		System.out.println( "I'm thinking of a random number between 1 - 100. Try to guess it. ");
		y = keyboard.nextInt();
		if (x<y)
		{
			System.out.println( "Nope, you're high. ");
		}
		else if (x>y)
		{
			System.out.println( "Nope, you're depressed. ");
		}
		else 
		{
			System.out.println( "Noice.  ");
		}
		keyboard.close();
	}
}
