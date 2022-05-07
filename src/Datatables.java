import java.util.Scanner;

public class Datatables {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arrSize = in.nextInt();
        in.nextLine();
        String[] arrNum = new String[arrSize];
        for (int i = 0; i < arrSize; i++) {
            arrNum[i] = in.next();
        }
        in.close();
        for (String i : arrNum) {
            boolean numByte = false, numShort = false, numInt = false, numLong = false, numAny = false;
            try {
                byte num = Byte.parseByte(i);
                numByte = true;
            }
                catch (Exception ignore) {}
            try {
                short num = Short.parseShort(i);
                numShort = true;
            }
                catch (Exception ignore) {}
            try {
                int num = Integer.parseInt(i);
                numInt = true;
            }
               catch (Exception ignore) {}
            try {
                long num = Long.parseLong(i);
                numLong = true;
            }
            catch (Exception ex) {
                numAny = true;
            }
            if (numAny){
                System.out.println(i + " can't be fitted anywhere.");
            }
            else {
                    System.out.println(i + " can be fitted in:");
                    if (numByte) {
                        System.out.println("* byte");
                    }
                    if (numShort){
                        System.out.println("* short");
                    }
                    if (numInt){
                        System.out.println("* int");
                    }
                    if (numLong){
                        System.out.println("* long");
                    }
            }
        }
    }
}