import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListHack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Integer> inList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            inList.add(sc.nextInt());
        }
        sc.nextLine();
        int q = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < q; i++) {
            String que = sc.nextLine();
            if (que.equals("Insert")){
                inList.add(sc.nextInt(), sc.nextInt());
                sc.nextLine();
            }
            else {
                inList.remove(sc.nextInt());
                sc.nextLine();
            }
        }
        sc.close();
        System.out.print(inList.get(0));
        for (int i = 1; i < inList.size(); i++) {
            System.out.print(" " + inList.get(i));
        }
    }
}