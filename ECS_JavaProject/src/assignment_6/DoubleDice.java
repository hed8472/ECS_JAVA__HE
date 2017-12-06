package assignment_6;

import java.util.Random;
import java.util.Scanner;

public class DoubleDice 
{
	public static void main( String[] args)
	{
		System.out.println("HERE COMES THE DICE!!!");
		int a, b;
		a=1;
		b=0;
		Scanner keyboard = new Scanner(System.in);
		Random rng = new Random();
		while (a != b)
		{
			a = (rng.nextInt(6)+1);
			b = (rng.nextInt(6)+1);
			System.out.println();
			System.out.println("Roll # 1: " + a);
			System.out.println("Roll # 2: " + b);
			System.out.println("The total is: " + (a+b)+"!");
		}
		keyboard.close();
	}
}
