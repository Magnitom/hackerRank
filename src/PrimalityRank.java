import java.math.BigInteger;
import java.util.Scanner;

public class PrimalityRank {
    public static String inPrim (BigInteger num){
        if (num.isProbablePrime(100)){
            return "prime";
        }
        return "not prime";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger num = sc.nextBigInteger();
        sc.close();
        System.out.println(inPrim(num));
    }
}
