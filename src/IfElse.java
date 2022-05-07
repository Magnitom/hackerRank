import java.util.Scanner;

public class IfElse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if ((num<=100) & (num>=1)){
            if (num % 2 != 0){
                System.out.println("Weird");
            }
            if ((num % 2 == 0)&(num>2)&(num<5)){
                System.out.println("Not Weird");
            }
            if ((num % 2 == 0)&(num>6)&(num<=20)){
                System.out.println("Weird");
            }
            if ((num % 2 == 0)&(num>20)){
                System.out.println("Not Weird");
            }
        }
    }
}
