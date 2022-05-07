import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inString = in.nextLine();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(inString.substring(start, end));
    }
}
