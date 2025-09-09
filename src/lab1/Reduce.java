package lab1;

public class Reduce {
    public static void main(String[] args) {
        int n = 100;
        int iterations = 0;

        while (n > 0) {
            if (n % 2 == 0) {
                n /= 2;
            }
            else {  // elif (n % 2 == 1)
                n--;
            }

            iterations++;
        }

        System.out.println("Iterations: " + iterations);
    }
}
