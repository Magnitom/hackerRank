import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Anagrams {

    static String isAnagram (String stA, String stB){
        if (stA.length() == stB.length()) {
            List<Character> arrStrA = new ArrayList<>(stA.length());
            List<Character> arrStrB = new ArrayList<>(stB.length());
            for (int i = 0; i < stA.length(); i++) {
                arrStrA.add(stA.toLowerCase(Locale.ROOT).charAt(i));
                arrStrB.add(stB.toLowerCase(Locale.ROOT).charAt(i));
            }
            arrStrA.sort(Comparator.naturalOrder());
            arrStrB.sort(Comparator.naturalOrder());
            if (arrStrA.equals(arrStrB)){
                return "Anagrams";
            }
            else return "Not Anagrams";
        }
        else return "Not Anagrams";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader inputUser = new BufferedReader(new InputStreamReader(System.in));
        String stringA = inputUser.readLine();
        String stringB = inputUser.readLine();
        System.out.println(isAnagram(stringA, stringB));
    }
}
