import java.util.Scanner;
import org.apache.commons.lang.StringUtils;

public class HandoverMySQL {
    public static void main(String args[]) {
        String newLine = System.getProperty("line.separator"); //Define new line for the welcome message
        System.out.print("Please enter your SQL code..." + newLine);
        Scanner userinput = new Scanner(System.in);

        String emptyspace = "";
        while (userinput.hasNextLine()) {
            String line = userinput.nextLine();
            if("end".equals(line)) { //Temporary solution to stop application
                break;
            }
            emptyspace += "\n" + userinput.nextLine();

        }
        userinput.close();
        String replaced = StringUtils.replaceOnce (emptyspace, " ", "/*                        updated for v0.06                */");
        System.out.println(replaced);
    }
}