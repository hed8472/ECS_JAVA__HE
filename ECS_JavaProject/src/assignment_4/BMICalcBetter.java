package assignment_4;
import java.util.Scanner;
public class BMICalcBetter 

{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		int feet, inches, pounds;
		double BMI, kg, meters;
		
		System.out.println("BMI(Body Mass Index) is a way of representing your size.");
		System.out.println("");
		
		System.out.println("How many feet tall are you?");
		feet = keyboard.nextInt();
		
		System.out.println("How many inches?");
		inches = keyboard.nextInt();
		
		System.out.println("How many pounds do you weigh?");
		pounds = keyboard.nextInt();

		meters = ((feet + (inches/12))*0.3048);
		kg = (pounds*0.4536);
		BMI = (kg/(meters*meters));
		System.out.println("Your BMI is: "+ BMI);

		
		
		
		
		
		keyboard.close();
	}
	
}
