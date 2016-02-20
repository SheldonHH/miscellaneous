import java.util.*;
public class ReminderEqualToOne{
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Please Key in first number: ");
        int firstNum = sc.nextInt();

        System.out.print("Please Key in second number: ");
        int secondNum = sc.nextInt();

		
        System.out.println("The Reminder of the firstNum divide the SecondNum equals: "+firstNum%secondNum);

    }
}
