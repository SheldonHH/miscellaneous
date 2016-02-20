import java.util.*;
public class EuclideanForGCD{
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Please Key in the first number: ");
        int first = sc.nextInt();
		System.out.print("Please Key in the second number: ");
        int second = sc.nextInt();

        int result = gcd(first,second);
        System.out.println("The Greatest Common Divider is: "+result);
    }

    
    // recursive implementation
    public static int gcd(int p, int q) {
        if (q == 0) return p;
        else return gcd(q, p % q);
    }

    /*for example:
        p = 7, q =4
        gcd(4, 3)
        p = 4, q = 3
        gcd(3, 3 % 4);
        3%4 = 1  !!!! see ReminderEqualToOne.java in the same folder
        =

    */

    // non-recursive implementation
    public static int gcd2(int p, int q) {
        while (q != 0) {
            int temp = q;
            q = p % q;
            p = temp;
        }
        return p;
    }

}
