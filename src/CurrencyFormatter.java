import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double moneyIn = in.nextDouble();
        String engPay = NumberFormat.getCurrencyInstance(Locale.US).format(moneyIn);
        System.out.println("US: "+engPay);
        Locale indLoc = new Locale("EN", "IN");
        String indPay = NumberFormat.getCurrencyInstance(indLoc).format(moneyIn);
        System.out.println("India: " + indPay);
        String chiPay = NumberFormat.getCurrencyInstance(Locale.CHINA).format(moneyIn);
        System.out.println("China: " + chiPay);
        String francePay = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(moneyIn);
        System.out.println("France: " + francePay);
    }
}