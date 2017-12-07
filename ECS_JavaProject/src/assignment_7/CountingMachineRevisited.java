package assignment_7;
import java.util.Scanner;
public class CountingMachineRevisited {
	public static void main( String[] args )
	{
		int from, to, by;
		Scanner keyboard = new Scanner (System.in);
		
		System.out.print( "Count From: ");
		from= keyboard.nextInt();
		System.out.print( "Count To: ");
		to= keyboard.nextInt();
		System.out.print( "Count By: ");
		by= keyboard.nextInt();
		for ( int n = from ; n <= to ; n = n + by )
		{
			System.out.print( n + " ");
		}
		keyboard.close();
	}
}
