import java.util.*;

public class SubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nArr = sc.nextInt();
        sc.nextLine();
        String inStr = sc.nextLine();
        String[] arrStr = Arrays.copyOf(inStr.split("\\s"), nArr);
        List<Integer> arrInt = new ArrayList<>();
        for (int i = 0; i < nArr; i++) {
            arrInt.add(Integer.parseInt(arrStr[i]));
        }
        int sum = 0;
        int countNeg = 0;
        Iterator iter = arrInt.iterator();
        List<Integer> arrSub = new ArrayList<>();
        for (int i = 0; i < arrInt.size(); i++) {
            for (int j = arrInt.size(); j > 0; j--) {
                if (i<j) {
                    arrSub = arrInt.subList(i, j);
                }
                else continue;
                for (Integer k : arrSub) {
                    sum = sum + k;
                }
                if (sum < 0){
                    countNeg++;
                }
                sum = 0;
            }
        }
        System.out.println(countNeg);
    }
}
