import java.util.*;
public class SplitIntNumToDigit{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please key in the number: ");
		int number = sc.nextInt();
// this will split the number in a reverse way
// Let's say 1234   --->	4321
		while (number > 0) {
		    System.out.print( number % 10);
		    number = number / 10;
		}


		// second way
		new StringBuilder("The String you want to put in").reverse().toString();
	}
}