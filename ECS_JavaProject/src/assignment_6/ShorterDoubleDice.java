package assignment_6;

import java.util.Random;
import java.util.Scanner;

public class ShorterDoubleDice {
	public static void main( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		Random rng = new Random();
		
		int x,y;
		
		do
		{
			int flip = (rng.nextInt(6)+1);
			x=6+2;
			y=6;
			flip  = flip ++;
		} while (x == y);
		keyboard.close();
	}
}
