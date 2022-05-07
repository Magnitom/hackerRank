import java.util.Scanner;

public class StdinStdout2 {
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        //sc.useDelimiter("\\n");
        int lineInt = sc.nextInt();
        double lineDouble = sc.nextDouble();
        //sc.nextLine();
        String lineString = sc2.nextLine();
        System.out.println("String: " + lineString);
        System.out.println("Double: " + lineDouble);
        System.out.println("Int: " + lineInt);
    }
}