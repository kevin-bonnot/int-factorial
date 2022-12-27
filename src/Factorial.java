public class Factorial {
    public static int intFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Argument must be positive or null");
        }

        if (n == 0) {
            return 1;
        }

        return n * intFactorial(n - 1);
    }
}
