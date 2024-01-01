/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String s = args[0];
		int n = s.length();
		for( int i=n-1; i >= 0; i-- ){
			char c = s.charAt(i);
			System.out.print(c);
			
		}
		if ( n%2 != 0 )  {
        	int m = n/2;
			System.out.println();
			System.out.println("The middle character is " + s.charAt(m));
	    } else {	
			int m = n/2-1;	
        	System.out.println();
			System.out.println("The middle character is " + s.charAt(m)); 
		}
  }
 } 

