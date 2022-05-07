import java.util.Scanner;

public class d1Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeArr = sc.nextInt();
        Integer[] arrIn = new Integer[sizeArr];
        for (int i = 0; i < arrIn.length; i++) {
            arrIn[i] = sc.nextInt();
        }
        sc.close();
        for (int i:
             arrIn) {
            System.out.println(i);
        }
    }
}
