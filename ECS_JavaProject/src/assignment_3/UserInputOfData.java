package assignment_3;
import java.util.Scanner;
public class UserInputOfData 

{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		String FirstN,LastN,Login;
		int grade, ID;
		double GPA;
		
		System.out.println("Please enter the following information so I can sell it for a profit!");
		System.out.println();
		
		System.out.println("First Name:");
		FirstN = keyboard.next();
		
		System.out.println("Last Name:");
		LastN = keyboard.next();
		
		System.out.println("Grade (9-12):");
		grade = keyboard.nextInt();
		
		System.out.println("ID: ");
		ID = keyboard.nextInt();
		
		System.out.println("Login: ");
		Login = keyboard.next();
		
		System.out.println("GPA: ");
		GPA = keyboard.nextDouble();
		
		System.out.println("Your information:");
		System.out.println("Login: " + Login);
		System.out.println("ID:    " + ID);
		System.out.println("Name:  " + LastN + ", " + FirstN);
		System.out.println("GPA    " + GPA);
		System.out.println("Grade: " + grade);
		keyboard.close();

	}
	
}
