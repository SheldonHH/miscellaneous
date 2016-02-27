//The java.io.File.delete() method deletes the file or directory defined by the abstract path name. To delete a directory, the directory must be empty.
//two methods under File class which are:
//listFiles(); isDirectory 
//http://stackoverflow.com/questions/779519/delete-directories-recursively-in-java
import org.apache.commons.io.*;
import java.io.*;
public class ClearDirectory{
	public static void main(String []args){
		FileUtils.deleteDirectory(new File("directory"));
	}

	
}