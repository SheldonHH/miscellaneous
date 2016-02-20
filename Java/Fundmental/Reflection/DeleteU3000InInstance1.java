// unfinished, completed than expected, cos involved search. Probably can use KMP search
// 
public class DeleteU3000InInstance1{
    public static void main(String []args){
        File file = new File("Instance1.java");  // create File object to read from
        Scanner scanner = new Scanner(file);       // create scanner to read
        Printwriter writer = new PrintWriter("Instance2.java"); // create file to write to

        while(scanner.hasNextLine()){  // while there is a next line
            String line = scanner.nextLine();  // line = that next line

            // do something with that line
            String newLine = "";

            // replace a character
            for (int i = 0; i < line.length(); i++){
                if (line.charAt(i) != "\\u3000") {  // or anything other character you chose
                    newLine += line.charAt(i);
                    System.out.println("Find the \\u3000");
                }
            }

            // print to another file.
            writer.println(newLine);
        }
    }
}