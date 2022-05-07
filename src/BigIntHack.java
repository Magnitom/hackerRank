import java.math.BigInteger;
import java.util.Scanner;

public class BigIntHack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        BigInteger sum;
        BigInteger multi;
        System.out.println(sum = a.add(b));
        System.out.println(multi = a.multiply(b));
    }
}
