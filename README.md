# Recursive Countdown
This is a [simple countdown method](src/countdown/RecursiveCountdown.java) written using recursion. The method calls itself, over and over again, until we reach zero.

Note that the recursive method is strcutred with a **base case** (i.e. when we know to stop) and a **recursive case** (i.e. calling itself, with a subset of parameters).


```java
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
```