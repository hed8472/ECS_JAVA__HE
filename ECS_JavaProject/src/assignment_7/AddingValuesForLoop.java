package assignment_7;
import java.util.Scanner;
public class AddingValuesForLoop {
	public static void main( String[] args )
	{
		int x,y;
		Scanner keyboard = new Scanner (System.in);
		y=0;
		System.out.print( "Count to: ");
		x = keyboard.nextInt();
		for ( int n = 0 ; n <= x ; n++ )
		{
			System.out.print(n + " ");
			y=y+n;
		}
		System.out.println("");
		System.out.println("The sum is "+ y + ".");
		keyboard.close();
	}
}