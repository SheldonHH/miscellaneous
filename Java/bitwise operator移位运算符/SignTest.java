// http://blog.csdn.net/vebasan/article/details/6193916
// http://www.tutorialspoint.com/java/java_basic_operators.htm
public class SignTest{
	public static void main(String []args){

 		int s = 10 ;
 		System.out.println(Integer.toBinaryString(s));
 		System.out.println("Real Num:"+s);
 		//s >>>= 3;
 		s>>=1;
 		System.out.println(Integer.toBinaryString(s));
 		System.out.println("Real Num:"+s);


 		System.out.println(129 ^ 128);

	}
}
