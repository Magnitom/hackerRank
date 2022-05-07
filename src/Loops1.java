import java.util.Scanner;

public class Loops1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num>=2&num<=20){
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d x %d = %d\n", num, i, (i * num));
            }
        }
    }
}
