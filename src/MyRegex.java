import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyRegex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String in = sc.nextLine();
            if (Pattern.matches("(\\b25[0-5]|\\b2[0-4][0-9]|\\b[01]?[0-9][0-9]?)(\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)){3}", in)) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }
    }
}
