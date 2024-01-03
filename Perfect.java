/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int x = Integer.parseInt(args[0]);
		String y = x + " is a perfect number since " + x + " = " + 1;
		int i = 2;
		int sumi = 0;
		while (i<x) {
			 if(x%i == 0) {
				y = y + "+" + i;
				sumi = sumi + i;
			 }
			i++;
		}
		if(x == sumi + 1){
			System.out.println(y);
		}
		else{
			System.out.println(x + " is not a perfect number");
		}	
		
	}
}

