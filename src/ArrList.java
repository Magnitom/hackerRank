import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Integer>> inNumberList = new ArrayList<>();
        for (int i = 0; i < n; i++){
            int numArr = sc.nextInt();
            inNumberList.add(i, new ArrayList<>());
            for (int j = 0; j < numArr; j++) {
                inNumberList.get(i).add(sc.nextInt());
            }
        }

        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            try {
                System.out.println(inNumberList.get(x-1).get(y-1));
            }
            catch (Exception e){
                System.out.println("ERROR!");
            }
        }
    }
}
