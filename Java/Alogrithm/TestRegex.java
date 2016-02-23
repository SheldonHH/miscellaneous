
public class TestRegex {  
    public static void main(String[] args) {  
        String text = "This - word ! has \\ /allot # of % special % characters";
        text = text.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(text);
 
    }
}