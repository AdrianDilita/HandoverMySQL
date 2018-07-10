import java.util.Arrays;
import java.util.Scanner;

public class HandoverMySQL {
    public static void main(String args[]) {
        String newLine = System.getProperty("line.separator"); //Define new line for the welcome message
        System.out.print("Please enter your SQL code..." + newLine);
        Scanner userinput = new Scanner(System.in);
        while (userinput.hasNextLine()) {
            String[] tokens = userinput.nextLine().split("\\s");
            String arrays = Arrays.toString(tokens);
                    String bracketremove = arrays.replaceAll("\\[", "").replaceAll("\\]",""); //Replace brackets from array
                    String commaremove = bracketremove.replaceAll ("\\,", "");  //Replace commas from array
                    String nolockremove = commaremove.replaceFirst ("with \\(nolock\\)|(nolock)|\\(NOLOCK\\)|(NOLOCK)","");
                    String commentblockadd = nolockremove.replaceFirst(" ", System.lineSeparator() + "                        updated for v0.06                " + System.lineSeparator());
            System.out.println(newLine + commentblockadd);
        }
        userinput.close();
    }
}
