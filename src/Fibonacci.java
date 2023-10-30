public class Fibonacci {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Fibonacci <n>");
            System.exit(1);
        }

        int n = Integer.parseInt(args[0]);

        if (n < 0) {
            System.out.println("Please enter a non-negative integer.");
            System.exit(1);
        }

        System.out.println("Fibonacci series up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    private static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
