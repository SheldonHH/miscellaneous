import java.util.*;
public class ScannerProblem{
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Please Key in your number");
        long start = System.nanoTime();
		String str = sc.nextLine();
		System.out.println("Your number is "+str);
		long t = System.nanoTime()-start;
		//Convert nanosecond to millisecond
        float milli=(float)(t*Math.pow(10,-6));

		
        System.out.println("Time taken:"+milli+" milliseconds");

    }
}
