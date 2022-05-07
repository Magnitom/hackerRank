import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args){
        int a, b, n;
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        String[] inArr = new String[3*q];
        int c = 0;
        for (int q2 = q; q2 > 0; q2--) {
            for (int m = c; m < (c + 3); m++) {
                inArr[m] = sc.next();
            }
            c = c + 3;
        }
        int l = 0;
        for(int h = q; h > 0; h--){
            a = Integer.parseInt(inArr[l]);
            b = Integer.parseInt(inArr[l+1]);
            n = Integer.parseInt(inArr[l+2]);
            l = l + 3;
            int[] outArr = new int[n];
            outArr[0] = (int) (Math.pow(2, 0) * b);
            int i = 1;
            for (int n2 = n - 1; n2 > 0; n2--) {
                outArr[i] = (int) (Math.pow(2, i) * b) + outArr[i - 1];
                i++;
            }
            for (i = 0; i < n; i++) {
                outArr[i] = a + outArr[i];
            }
            for (int z : outArr) {
                System.out.print(z + " ");
            }
            System.out.println();
        }
    }
}