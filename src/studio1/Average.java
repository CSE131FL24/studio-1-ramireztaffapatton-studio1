package studio1;
import java.util.*;
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);	
		System.out.println("Hi, please enter two intergers. ");

		int n2 = in.nextInt();
		int n1 = in.nextInt();
		int average= (n1+n2)/ 2;
		
		System.out.println("Here is your average: "+ average);				
	}

}
