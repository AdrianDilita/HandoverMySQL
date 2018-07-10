import java.io.FileNotFoundException;
import java.util.Scanner;

public class HandoverMySQL {
    public static void main(String args[]) {
        String newLine = System.getProperty("line.separator"); //Define new line for the welcome message
        System.out.print("Please enter your SQL code..." + newLine);
        Scanner userinput = new Scanner(System.in);
        String newstring = userinput.nextLine();
        String nolockremove = newstring.replaceAll("with \\(nolock\\)|(nolock)}", "");
        String commentblockadd = nolockremove.replaceFirst(" ", System.lineSeparator() + " /*                                           updated for v0.06               */ " + System.lineSeparator());
        while (userinput.hasNextLine()) {
            System.out.println(userinput.nextLine());
        }
        System.out.println(commentblockadd);
    }
}

