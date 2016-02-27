import java.util.*;
import java.io.*;
public class CheckEmpty{
    public static void main(String []args){
        try{
            String content = new Scanner(new File("/Users/apple/Coding/Java_Tea/ReadingNotes/Java/Fundmental/BufferReader_vs_Scanner/CJKTest.java")).useDelimiter("\\Z").next();
            if(content.contains(" ")){
                System.out.println("English Space");
            }
            if(content.contains("\u3000")){
                System.out.println("Backslash 3000");
            }
            
            if(content.contains("　")){
                System.out.println("C J K　ｆｕｌｌｗｉｄｔｈ");
                //Chinese Japanese Korean white space
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }

    }
}