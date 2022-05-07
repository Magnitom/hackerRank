import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTag {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        in.nextLine();
        String[] arrayStrings = new String[num];
        for (int i = 0; i < num; i++) {
            arrayStrings[i] = in.nextLine();
        }
        String regex = "<(.+)>([^<]+)<\\/\\1";
        Pattern pat = Pattern.compile(regex);
        for (String i : arrayStrings) {
            Matcher out = pat.matcher(i);
//            System.out.println(i);
            if (out.find()) {
                out.reset();
                while (out.find()) {
                    System.out.println(out.group(2));
                }
            }
            else System.out.println("None");
        }
    }
}
