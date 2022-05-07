import java.util.Arrays;
import java.util.Scanner;

public class SubstringComparisons {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inString = in.nextLine();
        int cuting = in.nextInt();
        String[] arrStrCuting = new String[inString.length()-cuting+1];
        int startCut = 0;
        for (int i =0; i < arrStrCuting.length; i++){
            arrStrCuting[i] = inString.substring(startCut,startCut+cuting);
            startCut = startCut+1;
        }
//        for (String i: arrStrCuting){
//            System.out.println(i);
//        }
        Arrays.sort(arrStrCuting);
        System.out.printf("%s\n%s", arrStrCuting[0], arrStrCuting[arrStrCuting.length-1]);
    }
}
