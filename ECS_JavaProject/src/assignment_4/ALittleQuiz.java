package assignment_4;
import java.util.Scanner;
public class ALittleQuiz 

{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		int ans, c;
		c=0;
		System.out.println("What is the capital of Alaska?");
		System.out.println("    1) Melbourne");
		System.out.println("    2) Anchorage");
		System.out.println("    3) Juneau");
		ans = keyboard.nextInt();
		if (ans == 1) 
		{
			System.out.println("I can tell someone didn't pass geography. ");
		}
		if (ans == 2) 
		{
			System.out.println("I can tell someone didn't pass geography. ");
		}
		if (ans == 3) 
		{
			System.out.println("<o/ <o/ <o/");
			c=c+1;
		}
		System.out.println("What's 9 + 10?");
		System.out.println("    1) 21");
		System.out.println("    2) 19");
		System.out.println("    3) Cabbage");
		ans = keyboard.nextInt();
		if (ans == 1) 
		{
			System.out.println("YEEE!");
		}
		if (ans == 2) 
		{
			System.out.println("Nerd. Correct, i guess... ");
			c=c+1;
		}
		if (ans == 3) 
		{
			System.out.println("I don't know where to begin with this one...");
		}
		System.out.println("Which of these is a move that Salamence can use? ");
		System.out.println("    1) Hydro Pump");
		System.out.println("    2) Close Combat");
		System.out.println("    3) Splash");
		ans = keyboard.nextInt();
		if (ans == 1) 
		{
			System.out.println("Special salamence FTW! Correct!");
			c=c+1;
		}
		if (ans == 2) 
		{
			System.out.println(".........");
		}
		if (ans == 3) 
		{
			System.out.println("What are you doing, Mantine Surf? ");
		}
		
		System.out.println("Overall, you got " + c + " question(s) correct. Thanks for playing! [I guess] ");
		keyboard.close();
	}
	
}