import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUserName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        in.nextLine();
        String[] arrayStrings = new String[num];
        for (int i = 0; i < num; i++) {
            arrayStrings[i] = in.nextLine();
        }
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
        Pattern pat = Pattern.compile(regex);
        for (String i : arrayStrings) {
            Matcher matcher = pat.matcher(i);
            if (matcher.find()) {
                System.out.println("Valid");
            }
            else {
                System.out.println("Invalid");
            }
        }
    }
}