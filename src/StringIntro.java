import java.util.Arrays;
import java.util.Scanner;

public class StringIntro {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String st1 = in.nextLine();
        String st2 = in.nextLine();
        System.out.println(st1.length() + st2.length());
        String[] st12 = new String[2];
        st12[0] = st1;
        st12[1] = st2;
        Arrays.sort(st12);
        if (st12[0].equals(st1)){
            System.out.println("No");
        }
        else System.out.println("Yes");
        System.out.println(st1.toUpperCase().substring(0, 1)+st1.substring(1)+" "+st2.toUpperCase().substring(0, 1)+st2.substring(1));

    }
}