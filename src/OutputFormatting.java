import java.util.Scanner;

public class OutputFormatting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++){
            String lineStr = sc.next();
            int lineInt = sc.nextInt();
            System.out.printf("%-15s%03d\n", lineStr, lineInt);
        }
        System.out.println("================================");
    }
}