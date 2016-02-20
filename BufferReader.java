import java.io.*;
public class BufferReader {


	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//读取一行字符串
		
		System.out.print("Please Key in your number");
		//Read the starting clock
		long start = System.nanoTime();
		String str = br.readLine();
		//将字符转化为整型
		//int a = Integer.parseInt(str);
		System.out.println("Your number is "+str);
		long t = System.nanoTime()-start;
		//Convert nanosecond to millisecond
        float milli=(float)(t*Math.pow(10,-6));
		

        System.out.println("Time taken:"+milli+" milliseconds");
		
	}
}