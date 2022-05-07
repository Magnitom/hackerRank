import java.util.*;

public class DeqHackVer2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        Set<Integer> hashSet = new HashSet<>();
        int n = in.nextInt();
        int m = in.nextInt();
        int max = 0;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.addLast(num);
            hashSet.add(num);
            if (deque.size() == m) {
                System.out.println("deq= " + deque);
                System.out.println("hash= " + hashSet);
                if (max < Math.min(hashSet.size(), m)) {
                    max = Math.min(hashSet.size(), m);
                }
                int queFirst = deque.removeFirst();
                if (!deque.contains(queFirst)) {
                    hashSet.remove(queFirst);
                }
            }
        }
        System.out.println(max);
    }
}