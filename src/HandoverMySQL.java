import java.util.Scanner;

public class HandoverMySQL {
    public static void main(String args[]) {
        String newLine = System.getProperty("line.separator"); //Define new line for the welcome message
        System.out.print("Please enter your SQL code..." + newLine);
        Scanner userinput = new Scanner(System.in);
        while (userinput.hasNextLine()) {
            String tokens = userinput.nextLine();
            String nolockremove = tokens.replaceFirst ("with \\(nolock\\)|(nolock)|\\(NOLOCK\\)|(NOLOCK)","");
            String commentblockadd = nolockremove.replaceFirst(" ", System.lineSeparator() + "                        updated for v0.06                " + System.lineSeparator());
            System.out.println(newLine + commentblockadd);
        }
        userinput.close();
    }
}