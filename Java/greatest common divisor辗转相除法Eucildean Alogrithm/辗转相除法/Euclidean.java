public class Euclidean{
	public static void main(String []args){
		System.out.println("FUCK");
		System.out.println(gcd(123,123));
	}

	public static int gcd(int m, int n){
		while(true){
			if(m%n==0){
				return n;
			}
			if(n%m==0){
				return m;
			}
		}
	}
}
