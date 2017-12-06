package assignment_6;

import java.util.Random;
import java.util.Scanner;

public class DoWhileGuessingCounter {
	public static void main( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		Random rng = new Random();
		int a, b, c;
		c=0;
		a = rng.nextInt(10)+1;
		b=0;
		System.out.println("I have chosen a number between 1 and 10. Try to guess it. ");
		do
		{
			System.out.print("Your guess:");
			b = keyboard.nextInt();
			if (a != b)
			{
				System.out.println("That is incorrect. Guess again. ");
				c = c+1;
			}
		}while (a !=b );
		
	System.out.println("That is correct. You are an okay guesser I guess.");
	System.out.println("It ONLY took you "+(c+1)+" tries.");
	keyboard.close();
	}
}
