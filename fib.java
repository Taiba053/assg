public class fib {
    public static void generateSeries(int n) {
        int a = 0, b = 1;

        System.out.println("Fibonacci series for " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }

    public static void main(String[] args) {
        int n = 10; // Example: Generate Fibonacci series for 10 terms
        generateSeries(n);
    }
}