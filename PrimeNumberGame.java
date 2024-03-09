import java.util.Scanner;

public class PrimeNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of distinct natural numbers (n) and the numbers themselves
        int n = scanner.nextInt();
        long[] numbers = new long[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextLong();
        }
        
        // Find the smallest natural number (q)
        long q = numbers[0];
        for (int i = 1; i < n; i++) {
            if (numbers[i] < q) {
                q = numbers[i];
            }
        }
        
        // Find the smallest prime number that satisfies the conditions
        long p = q + 1; // Start with q + 1
        while (true) {
            if (isPrime(p) && hasRemainder(p, numbers, q)) {
                System.out.println(p);
                break;
            }
            p++;
        }
    }
    
    // Check if a number is prime
    static boolean isPrime(long num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        
        return true;
    }
    
    // Check if the number has the desired remainder when divided by all numbers in the array, except q
    static boolean hasRemainder(long num, long[] numbers, long q) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != q && num % numbers[i] != q) {
                return false;
            }
        }
        return true;
    }
}
