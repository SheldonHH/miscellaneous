
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;
import java.util.*;
public class BufferReadAFile {

	public static void main(String[] args) {

		//BufferedReader br = null;
		String sCurrentLine;
		String message = "";
		try {

			/*br = new BufferedReader(new FileReader("/Users/apple/Coding/Java_Tea/ReadingNotes/Java/Fundmental/BufferReader vs Scanner/Instance1.java"));
		   
			while ((sCurrentLine = br.readLine()) != null) {
				message += sCurrentLine;
			}
			*/
			String content = new Scanner(new File("/Users/apple/Coding/Java_Tea/ReadingNotes/Java/Fundmental/BufferReader vs Scanner/Instance1.java")).useDelimiter("\\Z").next();
			//System.out.println(content);
			searchSubString(content.toCharArray(),"\\u3000".toCharArray());

		} catch (IOException e) {
			e.printStackTrace();
		} 

	}


    public static void searchSubString(char[] text, char[] ptrn) {
        int i = 0, j = 0;
        // pattern and text lengths
        int ptrnLen = ptrn.length;
        int txtLen = text.length;
 
        // initialize new array and preprocess the pattern
        int[] b = preProcessPattern(ptrn);
 
        while (i < txtLen) {
            while (j >= 0 && text[i] != ptrn[j]) {
                j = b[j];
            }
            i++;
            j++;
 
            // a match is found
            if (j == ptrnLen) {
                System.out.println("found substring at index:" + (i - ptrnLen));
                j = b[j];
            }
        }
    }


	public static int[] preProcessPattern(char[] ptrn) {
	    int i = 0, j = -1;
	    int ptrnLen = ptrn.length;
	    int[] b = new int[ptrnLen + 1];
	 
	    b[i] = j;
	    while (i < ptrnLen) {            
	            while (j >= 0 && ptrn[i] != ptrn[j]) {
	            // if there is mismatch consider the next widest border
	            // The borders to be examined are obtained in decreasing order from 
	            //  the values b[i], b[b[i]] etc.
	            j = b[j];
	        }
	        i++;
	        j++;
	        b[i] = j;
	    }
    return b;
	}


}