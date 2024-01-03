/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int n = Integer.parseInt(args[0]);
		int sumbg = 0;
		int twoChildren = 0;
		int threeChildren = 0;
		int fourChildren = 0;
		for( int i = 0; i<n; i++){
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
			System.out.println();
			sumbg = sumbg + (g+b);
			if(g+b == 2){
				twoChildren++;
			}
			if(g+b == 3){
				threeChildren++;
			}
			 if(g+b == 4){
				fourChildren++;
			 }
		}
		System.out.println("Average: " + ((double)sumbg)/n +  " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + twoChildren);
		System.out.println("Number of families with 3 children: " + threeChildren);
		System.out.println("Number of families with 4 or more children: " + fourChildren);
		//The most common number of children is 2.
		int commonNumber = Math.max(twoChildren,Math.max(threeChildren,fourChildren));
		if(commonNumber == twoChildren){
			System.out.println("The most common number of children is 2");
		}
		if(commonNumber == threeChildren){
	    	System.out.println("The most common number of children is 3");
		}
		if (commonNumber == fourChildren) {
			System.out.println("The most common number of children is 4");
		}
			
				
			
		
        

	}
}
