/*
http://stackoverflow.com/questions/8033550/convert-integer-to-array-of-digits
suitable for java SE8
 */
public class IntStream{
		public static void main(String[] args)
		{
		    int num = 1234567;  
		    int[]digits = Integer.toString(num).chars().map(c -> c-='0').toArray(); 
		    for(int d : digits)
		        System.out.print(" "+d);    
		}
}