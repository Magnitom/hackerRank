import java.util.Scanner;

public class Endoffile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numLine = 1;
        while (in.hasNext()){
            System.out.println(numLine + " " + in.nextLine());
            numLine++;
        }
    }
}