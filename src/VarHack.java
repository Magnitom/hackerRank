import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Add {
    public void sum(int... nums) {
        int sum;
        System.out.println(nums[0] + "+" + nums[1] + "=" + (nums[0] + nums[1]));
        System.out.println(nums[0] + "+" + nums[1] + "+" + nums[2] + "=" + (nums[0] + nums[1] + nums[2]));
        System.out.println(nums[0] + "+" + nums[1] + "+" + nums[2] + "+" + +nums[3] + "+" + +nums[4] + "=" + (nums[0] + nums[1] + nums[2] + nums[3] + nums[4]));
        System.out.println(nums[0] + "+" + nums[1] + "+" + nums[2] + "+" + +nums[3] + "+" + +nums[4] + "+" + +nums[5] + "=" + (nums[0] + nums[1] + nums[2] + nums[3] + nums[4] + nums[5]));
    }
}

public class VarHack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] arrIn = new Integer[6];
        for (int i = 0; i < arrIn.length; i++) {
            arrIn[i] = sc.nextInt();
        }
        Add sumNum = new Add();
        sumNum.sum(arrIn[0], arrIn[1], arrIn[2], arrIn[3], arrIn[4], arrIn[5]);
    }
}
