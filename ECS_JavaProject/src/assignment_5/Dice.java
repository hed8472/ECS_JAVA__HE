
package assignment_5;

import java.util.Random;
import java.util.Scanner;
public class Dice {
	public static void main ( String[] args )
	{
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);
		int x = 1 + r.nextInt(6);
		System.out.println( "HERE COMES THE DICE!");
		int y = 1 + r.nextInt(6);
		
		
		System.out.println( "Roll #1: "+x);
		System.out.println( "Roll #2: "+y);
		System.out.println( "The total is " + (x+y) +"!");
		keyboard.close();
	}
}
