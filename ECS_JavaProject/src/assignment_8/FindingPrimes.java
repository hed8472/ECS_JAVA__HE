package assignment_8;

import java.util.Scanner;

public class FindingPrimes {
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		boolean j;
		System.out.println("We are going to find some primes!");
		System.out.println("What range would you like them in?");
		System.out.println("Only positive integers 2 or greater. ");
		System.out.println("");
		System.out.print("Low end: ");
		int x = keyboard.nextInt();
		System.out.println("");
		System.out.print("High end: ");
		int y = keyboard.nextInt();
		System.out.println("");
		for (int z = x; z <= y; z++)
		{
			System.out.print(z+" ");
			j = (prime(z)); 
			if (j==true)
			{
				System.out.println("<");
			}
			else 
			{
				System.out.println();
			}
		}
		keyboard.close();
	}
	public static boolean prime (int a)
	{
		boolean ans = true;
		for (int n = a - 1; n>1 ;n = n-1)
		{
			if (a%n == 0)
			{
				ans = false;
			}
		}
		return ans;
	}
}
