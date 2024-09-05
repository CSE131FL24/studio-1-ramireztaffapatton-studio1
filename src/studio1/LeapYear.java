package studio1;
import java.util.*;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int leapyear = in.nextInt();
		
		boolean LeBron = (leapyear % 4 == 0 && leapyear % 100 != 0 || leapyear % 400 == 0);
		
		System.out.print(LeBron);


	}

}
