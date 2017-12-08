package assignment_8;
import java.util.Scanner;
public class AreaCalculatorRepeat {
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Shape Area Calculator (c) 2017 David He ECS");
		int a = 0;
		while (a < 5){
			System.out.println("-------------------------------------------");
			System.out.println("");
			System.out.println("1) Triangle");
			System.out.println("2) Rectangle");
			System.out.println("3) Square");
			System.out.println("4) Circle");
			System.out.println("5) Quit");
			System.out.print("Which Shape: ");
			a = keyboard.nextInt();
			if (a == 1) {
				System.out.println("Base: ");
				int b = keyboard.nextInt();
				System.out.println("Height: ");
				int h = keyboard.nextInt();
				triangle(b,h);
			}
			else if (a == 2) {
				System.out.println("Base: ");
				int b = keyboard.nextInt();
				System.out.println("Height: ");
				int h = keyboard.nextInt();
				rectangle(b,h);
			}
			else if (a == 3) {
				System.out.println("Side: ");
				int s = keyboard.nextInt();
				square(s);
			}
			else if (a == 4 ) {
				System.out.println("Radius: ");
				int r = keyboard.nextInt();
				circle(r);
			}
			else if (a >= 5)
			{
				System.out.println("");
				System.out.println("Goodbye!");
				keyboard.close();
			}
			
		}
		
	}
	public static void triangle ( int base, int height )
	{
		double area = base * height / 2;
		System.out.println("The area is: " + area);
		
	}
	public static void rectangle ( int base, int height )
	{
		double area = base * height;
		System.out.println("The area is: " + area);
		
	}
	public static void square ( int side )
	{
		double area = side * side;
		System.out.println("The area is: " + area);
	}
	public static void circle ( int radius )
	{
		double area = radius * radius * Math.PI;
		System.out.println("The area is: " + area);
	}
}
