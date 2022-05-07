import java.util.*;

class Comp {
    public boolean compChar(char a, char b) {
        boolean sol = false;
        switch (a) {
            case '(' -> {
                if (b == ')') {
                    sol = true;
                }
            }
            case '{' -> {
                if (b == '}') {
                    sol = true;
                }
            }
            case '[' -> {
                if (b == ']') {
                    sol = true;
                }
            }
            default -> {
                sol = false;
            }
        }
        return sol;
    }
}

class StackHack_2 {

    public static <T> void main(String[] args) {
        Comp commSk = new Comp();
        List<Character> ListIn = new ArrayList<>();
        boolean solution = true;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input = sc.next();
            char[] ChArr = input.toCharArray();
            for (char i : ChArr) {
                ListIn.add(i);
            }
            boolean done = false;
            if ((ListIn.size() % 2) == 0) {
                while (!ListIn.isEmpty()) {
                    if (solution) {
                        done = false;
                        for (int i = 0; i < ListIn.size() - 1; i++) {
                            char a = ListIn.get(i);
                            char b = ListIn.get(i + 1);
                            if (commSk.compChar(a, b)) {
                                ListIn.remove(i + 0);
                                ListIn.remove(i + 0);
                                i--;
                                done = true;
                            }
                            if (!done & (i == (ListIn.size() - 2))) {
                                solution = false;
                                break;
                            }
                        }
                    } else break;
                }
            } else solution = false;
            System.out.println(solution);
            solution = true;
            ListIn.clear();
        }
    }
}




