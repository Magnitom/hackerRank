import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        in.nextLine();
        String[] arrayStrings = new String[num];
        for (int i = 0; i < num; i++) {
            arrayStrings[i] = in.nextLine();
        }
        String regex = "(?i)(\\b\\w+)\\s\\1\\b";
        Pattern pat = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        for (String i : arrayStrings) {
            Matcher matcher = pat.matcher(i);
            while (matcher.find()) {
                i = i.replaceFirst(regex, matcher.group(1));
                matcher = pat.matcher(i);
            }
            System.out.println(i);
        }
    }
}