import java.util.*;
public class ClearTheBuffer{
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        int rounds = 0;
        while (rounds < 1 || rounds > 3) {
            System.out.print("How many rounds? ");
            if (in.hasNextInt()) {
                rounds = in.nextInt();
            } else {
                System.out.println("Invalid input. Please try again.");
                //in.next(); // -->important  Clear buffer
                System.out.println();
            } 
        }
        System.out.print(rounds+" rounds.");

    }
}
