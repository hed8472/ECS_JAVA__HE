
package assignment_6;

import java.util.Random;
import java.util.Scanner;
public class HiLowLimited {
	public static void main ( String[] args )
	{
		
		int a,y;
		y=-1;
		Random r = new Random();
		a=1;
		Scanner keyboard = new Scanner(System.in);
		int x = 1 + r.nextInt(100);
		System.out.println( "I'm thinking of a random number between 1 - 100. Try to guess it. ");
		while (a<8)
		{
			System.out.print ("Guess #"+a+": ");
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
				a = 10;
			}
			a++;
		}
		if (x != y)
		{
			System.out.println("LOL U SUK");
		}
		else
		{
			System.out.println("U R A HAXSER");
		}
		keyboard.close();
		
	}
	
}
