import java.io.*;
import java.util.*;
import java.lang.reflect.*;

import static java.lang.System.in;

class Prime {
    public String checkPrime(int... nums) {
        List<Integer> numList = new ArrayList(nums.length);
        boolean prime = true;
        for (int n : nums) {
            System.out.println("Анализ числа " + n);
            if (n == 2 || n == 3 || n == 5 || n == 7) {
                System.out.println("Число равно 2 или 3 " + n);
                numList.add(n);
                continue;
            }
            if (n <= 1 || n % 2 == 0 || n % 3 == 0) {
                System.out.println("Число не простое " + n);
                continue;
            }
            for (int j = 5; j * j <= n; j += 6) {
                System.out.println("j = " + j);
                if (n % j == 0 || n % (j + 2) == 0) {
                    System.out.println("Выход из цикла с не простым числом " + n);
                    break;
                }
                else {
                    numList.add(n);
                    break;
                }
            }
        }
        return Arrays.toString(numList.toArray());
    }
}


public class CheckerHack {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            int n1 = Integer.parseInt(br.readLine());
            int n2 = Integer.parseInt(br.readLine());
            int n3 = Integer.parseInt(br.readLine());
            int n4 = Integer.parseInt(br.readLine());
            int n5 = Integer.parseInt(br.readLine());
            Prime ob = new Prime();
            System.out.println(ob.checkPrime(n1).toString().replace("[", "").replace("]", "").replace(",", ""));
            System.out.println(ob.checkPrime(n1, n2).toString().replace("[", "").replace("]", "").replace(",", ""));
            System.out.println(ob.checkPrime(n1, n2, n3).toString().replace("[", "").replace("]", "").replace(",", ""));
            //System.out.println(ob.checkPrime(n1, n2, n3, n4));
            System.out.println(ob.checkPrime(n1, n2, n3, n4, n5).toString().replace("[", "").replace("]", "").replace(",", ""));
            Method[] methods = Prime.class.getDeclaredMethods();
            Set<String> set = new HashSet<>();
            boolean overload = false;
            for (int i = 0; i < methods.length; i++) {
                if (set.contains(methods[i].getName())) {
                    overload = true;
                    break;
                }
                set.add(methods[i].getName());

            }
            if (overload) {
                throw new Exception("Overloading not allowed");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

