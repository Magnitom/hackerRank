import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class d2Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] stringInput = new String[6];
        for (int i = 0; i < 6; i++) {
            stringInput[i] = sc.nextLine();
        }
        Integer[][] arr2d = new Integer[6][6];
        String[] arrTemp = new String[6];
        int z = 0;
        for (int i = 0; i < 6; i++) {
            arrTemp = Arrays.copyOf(stringInput[i].split("\\s"), 6);
            for (int j = 0; j < 6; j++) {
                arr2d[z][j] = Integer.parseInt(arrTemp[j]);
            }
            z++;
        }
        int sum = 0;
        ArrayList<Integer> arrSum = new ArrayList();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sum = arr2d[i][j] + arr2d[i][j+1] + arr2d[i][j+2] + arr2d[i+1][j+1] + arr2d[i+2][j] + arr2d[i+2][j+1] + arr2d[i+2][j+2];
                arrSum.add(sum);
            }
        }
        System.out.println(Collections.max(arrSum));
    }
}