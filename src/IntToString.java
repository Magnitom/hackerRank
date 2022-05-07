import java.util.Scanner;

public class IntToString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        try {

            if ( n < -100 | n > 100 ){
                throw new IllegalArgumentException();
            }
            String st = String.valueOf(n);
            System.out.println("Good job");
        } catch (Exception exIllegal){
            System.out.println("Wrong answer");
        }
    }
}
