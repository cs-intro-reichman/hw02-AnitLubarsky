/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		 int x = (int)(Math.random()*10);
		 int xPrev = x;
		 
		do{
			System.out.print(" " + x);
			xPrev = x;
			x = (int)(Math.random()*10);
		 } while( x >= xPrev);
		 
	}
}
