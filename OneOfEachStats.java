import java.util.Random;
/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get two command-line arguments: an int value
 * 	that determines how many families to simulate, and an int value
 *  that serves as the seed of the random numbers generated by the program.
 *  Example usage: % java OneOfEachStats 1000 1
 */
public class OneOfEachStats {
	public static void main (String[] args) {
		// Gets the two command-line arguments
		int n = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
		// Initailizes a random numbers generator with the given seed value
        Random generator = new Random(seed);
		int sumbg = 0;
		int twoChildren = 0;
		int threeChildren = 0;
		int fourChildren = 0;
		for( int i = 0; i<n; i++){
			int g = 0;
			int b = 0;
			
			do{
				double x = generator.nextDouble();
		 		if (0<= x && x < 0.5) {
				//System.out.print("g "+ " ");
					g++;
			 	}else {
				//System.out.print("b " + " ");
					b++;
			 	}
			}while ( g==0 || b==0 );
			sumbg = sumbg + (g+b);
			if(g+b == 2){
				twoChildren++;
			}
			if(g+b == 3){
				threeChildren++;
			}
			 if(g+b >= 4){
				fourChildren++;
			 }
		}
		System.out.println("Average: " + ((double)sumbg)/n +  " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + twoChildren);
		System.out.println("Number of families with 3 children: " + threeChildren);
		System.out.println("Number of families with 4 or more children: " + fourChildren);
		int commonNumber = Math.max(twoChildren,Math.max(threeChildren,fourChildren));
		if(commonNumber == twoChildren){
			System.out.println("The most common number of children is 2.");
		}
		if(commonNumber == threeChildren){
	    	System.out.println("The most common number of children is 3.");
		}
		if (commonNumber == fourChildren) {
			System.out.println("The most common number of children is 4.");
		}
		
		//// In the previous version of this program, you used a statement like:
		//// double rnd = Math.random();
		//// Where "rnd" is the variable that stores the generated random value.
		//// In this version of the program, replace this statement with:
		//// double rnd = generator.nextDouble();
		//// This statement will generate a random value in the range [0,1),
		//// just like you had in the previous version, except that the 
		//// randomization will be based on the given seed.
		//// This is the only change that you have to do in the program.
		    
	}
}
