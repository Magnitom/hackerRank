import java.util.Scanner;

public class TryCatchHack {
    public static void main(String[] args) {
        int x, y, z;
        Scanner sc = new Scanner(System.in);
        try {
            x = sc.nextInt();
            y = sc.nextInt();
            System.out.println(x/y);
        }
        catch (java.util.InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
