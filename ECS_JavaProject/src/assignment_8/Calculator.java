package assignment_8;
import java.util.Scanner;
public class Calculator {
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Give me a math procedure: ");
		int num1 = keyboard.nextInt();
		String opp = keyboard.next();
		int num2 = keyboard.nextInt();
		System.out.println();
		
		
		keyboard.close();
	}
	public static double operation (int a, String b,int c)
	{
		if (b == "+") {
			int ans = a + c;
		}
		if (b == "-") {
			int ans = a - c;
		}
		if (b == "*") {
			int ans = a * c;
		}
		if (b == "/") {
			int ans = a / c;
		}
		if (b == "^") {
			for ()
			int ans = a + c;
		}
	}
}
