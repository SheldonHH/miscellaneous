import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hanoi2 {
    public static int counter = 0;
    public static void main(String[] args) throws IOException{
        int n;
        BufferedReader buf;
        buf = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Please input the number of disk: ");
        n = Integer.parseInt(buf.readLine());
        
        System.out.print("Total Numbers of movement:"+move(n,'A','B','C'));
    }
    
    public static int move(int n, char a, char b, char c){
        if(n == 1){
            System.out.println("Disk " + n + " From " + a + " To " + c);
          counter++;
        }
        else{
            move(n-1,a,c,b);
            System.out.println("Disk " + n + " From " + a + " To " + c+"   @@@@@@");
            counter++;
            move(n-1,b,a,c);
        }
        return counter;
    }
}