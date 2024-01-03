
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		int g = 0;
		int b = 0;
		do{
			double x = Math.random();
		 	if (0<= x && x < 0.5) {
				System.out.print("g "+ " ");
				g++;
			 }else {
				System.out.print("b " + " ");
				b++;
			 }
		}while ( g==0 || b==0 );
			
		System.out.println("You made it... and you now have " + (g+b) + " children");
		}
		
	}

