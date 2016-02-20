/*http://viralpatel.net/blogs/varargs-in-java-variable-argument-method-in-java-5/
*/
public class HelloWorldVarargs {
 
    public static void main(String args[]) {
        test(215, "India", "Delhi");
        test(147, "United States", "New York", "California");
    }
 
    public static void test(int some, String... args) {
        System.out.print("\n" + some);
        for(String arg: args) {
            System.out.print(", " + arg);
        }
    }
}


//Varargs was added in Java 5 and the syntax includes three dots … (also called ellipses). Following is the syntax of vararg method.


//public void testVar(int count, String... vargs) { }
