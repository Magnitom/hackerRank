import java.util.*;
import java.util.LinkedList;

class CompStack{
    public boolean cmpChar (char a, char b){
        switch (a) {
            case '(' -> {
                if (b == ')') {
                    return true;
                }
            }
            case '{' -> {
                if (b == '}') {
                    return true;
                }
            }
            case '[' -> {
                if (b == ']') {
                    return true;
                }
            }
            default -> {
                return false;
            }
        }
        return false;
    }
}

class StackHack{

    public static <T> void main(String []argh) {
        CompStack compare = new CompStack();
        LinkedList<Character> ListIn = new LinkedList<>();
        boolean solution1 = false;
        boolean solution2 = false;
        boolean solution = false;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input = sc.next();
            char[] ChArr = input.toCharArray();
            for (char i: ChArr) {
                ListIn.add(i);
            }
            LinkedList<Character> CopyList = new LinkedList<>(ListIn);
            LinkedList<Character> CopyList2 = new LinkedList<>(ListIn);
            if (ListIn.size() % 2 == 0) {
                while (!CopyList.isEmpty()){
                    char a2 = CopyList.removeFirst();
                    char b2 = CopyList.removeFirst();
                    solution1 = compare.cmpChar(a2,b2);
                }
                while (!ListIn.isEmpty()) {
                    char a = ListIn.removeFirst();
                    char b = ListIn.removeLast();
                    solution2 = compare.cmpChar(a,b);
                }
                while (!CopyList2.isEmpty()){

                }
            }
            solution = solution1 | solution2;
            System.out.println(solution);
            solution1 = false;
            solution2 = false;
            solution  = false;
            ListIn.clear();
            CopyList.clear();
        }
    }
}



