public class MoreVariablesAndPrinting 
{
	public static void main(String[] args) 
	{
		String myName, myEyes, myTeeth, myHair;
		int myAge, myHeight, myWeight;
		double myHEIGHT, myWEIGHT;
		
		myName = "David L. He";
		myAge = 14;
		myHeight = 64;
		myWeight = 110;
		myEyes = "brown";
		myTeeth = "white";
		myHair = "black";
		myHEIGHT = myHeight * 2.54;
		myWEIGHT = myWeight * 0.454;
		
		System.out.println("Let's talk about "+myName);
		System.out.println("He's "+ myHeight + " inches(or " + myHEIGHT +" cm) inches tall.");
		System.out.println("He's "+ myWeight+ " pounds (or " + myWEIGHT + " kg) heavy.");
		System.out.println("Actually that's not too heavy.");
		System.out.println("He's got "+myEyes+" eyes and "+myHair +" hair.");
		System.out.println("His teeth are usually "+ myTeeth +" depending on the coffee.");
		System.out.println("If I add " + myAge + ", " + myHeight + ", and " +myWeight + " I get " + (myAge+myHeight+myWeight) + ".");
	}
}