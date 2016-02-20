import java.util.*;
public class UseArrayList{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		// use ArrayList can ignore the the index of the digits in the number
		int number= sc.nextInt();

		
		ArrayList<Integer> intList = new ArrayList<>();
		do{
			intList.add(number % 10); 
			number /=10;
			//number = number / 10;
		}while(number != 0);

		for(int i: intList){
			System.out.print(" "+i);
		}
	}
}