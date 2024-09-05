package studio1;

import java.util.Scanner;

/**
 * From Sedgewick and Wayne, COS 126 course at Princeton
 * 
 */
public class HiFour {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Hi what are your names? ");
		String name1 = in.nextLine();
		String name2 = in.nextLine();
		String name3 = in.nextLine();
		String name4 = in.nextLine();
		
		System.out.print("Greetings "+name1+ ", " + name2 + ", " + name3 + ", and " + name4 + ".");
		//
		// Say hello to the names in s0 through s3.
		//

	}
}
