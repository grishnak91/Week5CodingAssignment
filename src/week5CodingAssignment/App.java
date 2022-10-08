package week5CodingAssignment;

/*
 * 9.	Create a class named App that has a main method.
 */

public class App {
	
	
		
/*
 * 10.	In this class instantiate an instance of each of
 *  your logger classes that implement the Logger interface.
 */

	public static void main(String[] args) {

		Logger asterisk = new AsteriskLogger();
		
		Logger space = new SpacedLogger();
		
/*
 * 11.	Test both methods on both instances, passing in Strings
 *  of your choice.
 */	
	
		asterisk.log("Three asterisks can only mean somthing important.");
		
		System.out.println();
		
		asterisk.error("This is an error message.");
		
		System.out.println();
		
		space.log("This method logs things with spaces so it's harder to read.");
		
		System.out.println();
		
		space.error("This method is an error message.");
		
	}

}
