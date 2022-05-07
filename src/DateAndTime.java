import java.time.LocalDate;
import java.util.Scanner;


public class DateAndTime {

    public static String getDate (int month, int day, int year){
        LocalDate dateIn = LocalDate.of(year, month, day);
        return dateIn.getDayOfWeek().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        int year = sc.nextInt();
        System.out.println(getDate(month, day, year));
    }
}