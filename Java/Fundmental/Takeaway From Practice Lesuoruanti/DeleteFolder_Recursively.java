//The java.io.File.delete() method deletes the file or directory defined by the abstract path name. To delete a directory, the directory must be empty.
//two methods under File class which are:
//listFiles(); isDirectory 
//http://stackoverflow.com/questions/779519/delete-directories-recursively-in-java
import java.io.*;
public class DeleteFolder_Recursively{
	public static void main(String []args){
		deleteRecursive(new File("/Users/apple/Desktop/shit"));
	}

	public static void deleteRecursive(File file){
		if(file.isDirectory()){
			for(File f: file.listFiles()){
				deleteRecursive(f);			
			}	
		}else{
			file.delete();
		}

	}
}