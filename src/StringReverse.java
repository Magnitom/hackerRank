import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringReverse {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String strIn = in.readLine();
        char[] arr = strIn.toCharArray();
        String reverseOk = "No";
        if (arr[0]==arr[arr.length-1]) {
            reverseOk = "Yes";
            for (int i = 1; i <= arr.length / 2; i++) {
                if (arr[i] == arr[arr.length - i-1]) {
                    reverseOk = "Yes";
                } else {
                    reverseOk = "No";
                    break;
                }
            }
        }
        System.out.println(reverseOk);
    }
}