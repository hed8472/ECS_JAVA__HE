package assignment_6;

import java.util.Scanner;

public class CollatzSequence 
{
	public static void main( String[] args)
	{
		System.out.println("Let's create a COLLATZ SEQUENCE!");
		System.out.println();
		System.out.println("Rules: ");
		System.out.println("If the number is even, divide by 2. ");
		System.out.println("If the number is odd, multiply by 3 and add 1. ");
		System.out.println("Repeat until you reach 1. ");
		System.out.println();
		
		System.out.print("Starting Number:");
		
		int a;
		Scanner keyboard = new Scanner(System.in);
		a = keyboard.nextInt();
		System.out.print("[ " + a + " - ");
		while (a != 1)
		{
			if (a % 2 == 0)
			{
				a = a/2;
			}
			else
			{
				a = (a*3)+1;
			}
			System.out.print(a+" - ");
		}
		System.out.print("Success! ]");
		keyboard.close();
	}
}
