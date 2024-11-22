package countdown;

public class RecursiveCountdown {
    public static void main(String[] args) {
        int startingNumber = 10; // Set the starting number here
        countdown(startingNumber);
    }

    public static void countdown(int n) {
        if (n == 0) {
            // Base case: Stop when we've reached 0
            System.out.println("Countdown complete!");
        } else {
            // Recursive case: Print the current number and call the method again with (n-1)
            System.out.println(n);
            countdown(n - 1);
        }
    }
}