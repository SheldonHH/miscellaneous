 import java.io.*;
 public class BufferedReaderDelete{
	 public static void main(String []args) throws IOException 
	 {
	   File inputFile = new File("/Users/apple/Coding/Java_Tea/ReadingNotes/Java/Fundmental/Reflection/Instance1.java");
	   File tempFile = new File("/Users/apple/Coding/Java_Tea/ReadingNotes/Java/Fundmental/Reflection/Instance12.java");

	   BufferedReader reader = new BufferedReader(new FileReader(inputFile));
   	   BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
	   String lineToRemove = "";
	   String currentLine;
	    while((currentLine = reader.readLine()) != null){
		   String trimmedLine = currentLine.trim();
		   if(trimmedLine.equals(lineToRemove)) continue;
		   writer.write(currentLine);
 		}

		 writer.close();
		 reader.close();

	}

}