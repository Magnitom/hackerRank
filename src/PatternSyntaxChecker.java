import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternSyntaxChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        in.nextLine();
        String[] arrayStrings = new String[num];
        for (int i = 0; i < num; i++){
            arrayStrings[i] = in.nextLine();
        }
        for (String i: arrayStrings) {
            try {
                Pattern pat = Pattern.compile(i);
                System.out.println("Valid");
            } catch (Exception a) {
                System.out.println("Invalid");
            }
        }
    }
}