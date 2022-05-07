import java.util.BitSet;
import java.util.Scanner;

public class BitSetHack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeSet = sc.nextInt();
        int countQue = sc.nextInt();
        sc.nextLine();
        BitSet setOne = new BitSet(sizeSet);
        BitSet setTwo = new BitSet(sizeSet);
        //setOne.set(0,sizeSet, true);
        for (int i = 0; i < countQue; i++) {
            String act = sc.next();
            int bitOfSetOne = sc.nextInt();
            int bitOfSetTwo = sc.nextInt();
            switch (act) {
                case ("AND") -> {
                    if (bitOfSetOne == 1) {
                        setOne.and(setTwo);
                    } else {
                        setTwo.and(setOne);
                    }
                    System.out.println(setOne.cardinality() + " " + setTwo.cardinality());
                }
                case ("SET") -> {
                    if (bitOfSetOne == 1) {
                        setOne.set(bitOfSetTwo);
                    } else {
                        setTwo.set(bitOfSetTwo);
                    }
                    System.out.println(setOne.cardinality() + " " + setTwo.cardinality());
                }
                case ("FLIP") -> {
                    if (bitOfSetOne == 1) {
                        setOne.flip(bitOfSetTwo);
                    } else {
                        setTwo.flip(bitOfSetTwo);
                    }
                    System.out.println(setOne.cardinality() + " " + setTwo.cardinality());
                }
                case ("OR") -> {
                    if (bitOfSetOne == 1) {
                        setOne.or(setTwo);
                    } else {
                        setTwo.or(setOne);
                    }
                    System.out.println(setOne.cardinality() + " " + setTwo.cardinality());
                }
                case ("XOR") -> {
                    if (bitOfSetOne == 1) {
                        setOne.xor(setTwo);
                    } else {
                        setTwo.xor(setOne);
                    }
                    System.out.println(setOne.cardinality() + " " + setTwo.cardinality());
                }
            }
        }
    }
}
