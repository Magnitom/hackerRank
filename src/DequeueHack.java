import java.util.*;

public class DequeueHack {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> deque = new ArrayList<>();
        Set<Object> hashSet = new HashSet<>();
        int n = in.nextInt();
        int m = in.nextInt();
        int max = 0;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
        }
        while (deque.size() >= m) {
            hashSet.add(deque.get(0));
            deque.remove(0);
            hashSet.addAll(deque.subList(0,m-1));
            if (max < hashSet.size()) {
                max = hashSet.size();
            }
            hashSet.clear();
        }
        System.out.println(max);
    }
}