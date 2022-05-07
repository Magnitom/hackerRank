import java.util.Arrays;
import java.util.Scanner;

public class StdinStdout1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        while (sc.hasNextInt()){
            for(int i = 0; i < arr.length; i++) {
                int num = sc.nextInt();
                arr[i] = num;
           }
            break;
        }
        for(int i : arr) {
            System.out.println(i);
        }
    }
}