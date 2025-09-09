package lab1;

public class Multiples {
    public static void main(String[] args) {
        final int MAX = 999;

        int numMultiples = 0;

        for (int i = 1; i <= MAX; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                numMultiples++;
            }
        }

        System.out.println("There are " +
                            numMultiples +
                            "multiples of 3 or 5 below 1000");
    }
}
