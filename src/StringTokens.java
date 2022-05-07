import java.util.Scanner;

public class StringTokens {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        String itString = userIn.nextLine();
        for(int i =0; i < itString.length(); i++){
            if ((itString.codePointAt(i) < 65 & itString.codePointAt(i) != 32) | (itString.codePointAt(i) >= 90 & itString.codePointAt(i) < 97) | (itString.codePointAt(i) >= 122)){
//                System.out.println(itString.codePointAt(i) + " = " + itString.charAt(i) + " end");
                itString = itString.replace(itString.charAt(i), ' ');
            }
        }
        String[] tokenString = itString.split(" ");
        int numberTokens = 0;
        for (String i: tokenString){
            if (!i.isEmpty()){
                numberTokens++;
            }
        }
        System.out.println(numberTokens);
        for(int i = 0; i < tokenString.length; i++){
            for (int k = 0; k < tokenString[i].length(); k++){
                if ((tokenString[i].codePointAt(k) >= 65 & tokenString[i].codePointAt(k) <= 90) | (tokenString[i].codePointAt(k) >= 97 & tokenString[i].codePointAt(k) <= 122)){
                    System.out.print(tokenString[i].charAt(k));
                }
            }
            if (!tokenString[i].isEmpty()){
                System.out.println();
            }
        }
    }
}