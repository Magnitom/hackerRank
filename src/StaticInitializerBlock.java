import java.util.Scanner;

public class StaticInitializerBlock {
        static byte h,b;
        static int arrea;
        static {
            Scanner in = new Scanner(System.in);
            h = in.nextByte();
            b = in.nextByte();
            arrea = h*b;
        }

    public static void main(String[] args) {
        StaticInitializerBlock AreaSolution = new StaticInitializerBlock();
        if ((h <0 & b <0) | (h <0 | b <0) | (h ==0 | b ==0)){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        else {
            System.out.println(arrea);
        }
    }
}
