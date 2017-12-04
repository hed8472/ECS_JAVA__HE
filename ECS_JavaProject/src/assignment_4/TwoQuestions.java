package assignment_4;
import java.util.Scanner;
public class TwoQuestions 

{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		String Q1, Q2;
		
		System.out.println("TWO QUESTIONS!");
		System.out.println("Think of an object, and Ill try to guess what it is!");
		System.out.println("Is it an animal, vegetable, or mineral?");
		Q1 = keyboard.next();
		System.out.println("Is it bigger than a breadbox?");
		Q2 = keyboard.next();
		if (Q1.equals("animal") && Q2.equals("no"))
		{
			System.out.println("Is it a SQUIRREL?");
		}
		else if (Q1.equals("animal") && Q2.equals("yes"))
		{
			System.out.println("Is it a MOOSE?");
		}
		else if (Q1.equals("vegetable") && Q2.equals("no"))
		{
			System.out.println("Is it a CARROT?");
		}
		else if (Q1.equals("vegetable") && Q2.equals("yes"))
		{
			System.out.println("Is it a WATERMELON?");
		}
		else if (Q1.equals("mineral") && Q2.equals("no"))
		{
			System.out.println("Is it a PAPER CLIP?");
		}
		else if (Q1.equals("mineral") && Q2.equals("yes"))
		{
			System.out.println("Is it a CAMARO?");
		}
		else
		{
			System.out.println("YOU JUST GOT BANNED, BUDDY!");
		}
		keyboard.close();
	}
	
}
