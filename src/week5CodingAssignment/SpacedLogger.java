package week5CodingAssignment;

/*
 * 3.	Create two classes that implement the Logger interface
 *		a.	AsteriskLogger
 *		b.	SpacedLogger
 */

public class SpacedLogger implements Logger{
	
/*
 * 6.	The SpacedLogger should add spaces between each character
 *  of the String argument passed into its methods.
 *  
 *  7.	If the log method received “Hello” as an argument, it should
 *   print H e l l o.
 */
	
@Override

	public void log(String string) {
		
		StringBuilder space = new StringBuilder();
		
		for(int i = 0; i < string.length(); i++) {
			
			space.append(string.charAt(i) + " ");
			
		}
		
		System.out.println(space);
		
	}
	
	/*
	 * 8.	The error method should do the same, but with “ERROR:” 
	 * preceding the spaced out input (i.e. ERROR: H e l l o)
	 */
	
@Override

	public void error(String string) {
		
		System.out.print("ERROR: ");
		
		log(string);
		
	}
	
}
