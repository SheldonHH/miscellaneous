
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.*;
public class DeleteTheSpecialSpace {

	public static void main(String[] args) {

		//BufferedReader br = null;
		String sCurrentLine;
		String message = "";
		try {

		
			String content = new Scanner(new File("/Users/apple/Coding/Java_Tea/ReadingNotes/Java/Fundmental/BufferReader_vs_Scanner/Instance1.java")).useDelimiter("\\Z").next();
			content.replaceAll("　","");
			//System.out.println(content);
			
		PrintWriter out = new PrintWriter( "/Users/apple/Coding/Java_Tea/ReadingNotes/Java/Fundmental/Coding/Instance1.java" );
    		out.println(content);


		} catch (IOException e) {
			e.printStackTrace();
		} 

	}

}