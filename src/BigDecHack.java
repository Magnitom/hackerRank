import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BigDecHack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeArr = sc.nextInt();
        sc.nextLine();
        String[] arrStr = new String[sizeArr];
        for (int i = 0; i < arrStr.length; i++){
            arrStr[i] = sc.nextLine();
        }
        sc.close();
        BigDecimal[] arrBig = new BigDecimal[arrStr.length];
        for (int i = 0; i < arrStr.length; i++){
            BigDecimal bigDec = new BigDecimal(arrStr[i]);
            arrBig[i] = bigDec;
        }
        BigDecimal[] arrBigCopy = Arrays.copyOf(arrBig, arrStr.length);
        Arrays.sort(arrBig, Collections.reverseOrder());
        Integer[] countArr = new Integer[arrStr.length];
        int k = 0;
        for (int i = 0; i < arrStr.length; i++) {
            for (int j = 0; j < arrStr.length; j++) {
                if (arrBig[i] == arrBigCopy[j]){
                    countArr[k] = j;
                    k++;
                }
            }
        }
        String[] arrOut = new String[arrStr.length];
        int j = 0;
        for (int i = 0; i < arrStr.length; i++) {
            arrOut[i] = arrStr[countArr[j]];
            j++;
        }
        for (String i : arrOut) {
            System.out.println(i);
        }
    }
}