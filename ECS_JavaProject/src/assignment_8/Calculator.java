package assignment_8;
import java.util.Scanner;
public class Calculator {
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Give me a math procedure: ");
		double num1 = keyboard.nextDouble();
		String opp = keyboard.next();
		double num2 = keyboard.nextDouble();
		System.out.println();
		double o = operation(num1, opp, num2);
		System.out.println(o);
		keyboard.close();
	}
	public static double operation (double a, String b,double c)
	{
		double ans = a;
		if (b.equals("+")) {
			ans = a + c;
		}
		if (b.equals("-")) {
			ans = a - c;
		}
		if (b.equals("*")) {
			ans = a * c;
		}
		if (b.equals("/")) {
			ans = a / c;
		}
		if (b.equals("^")) {
			ans = 1;
			for ( int n = 0 ; n < c ; n++ )
			{
				ans = ans*a;
			}	
		}
		return ans;
	}
}
