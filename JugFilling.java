import java.util.*;

public class JugFilling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt(); // Number of cups
        int[] cups = new int[n];   // Cup capacities
        for (int i = 0; i < n; i++) {
            cups[i] = scanner.nextInt();
        }
        
        int jugCapacity = scanner.nextInt(); // Jug capacity
        
        // Sort the cups in ascending order
        Arrays.sort(cups);
        
        // Initialize variables for optimal solution
        int[] cupFrequency = new int[n];
        int remainingCapacity = jugCapacity;
        int index = n - 1; // Start with the largest cup
        
        // Find the optimal solution
        while (remainingCapacity > 0 && index >= 0) {
            if (cups[index] <= remainingCapacity) {
                int numCupsUsed = remainingCapacity / cups[index];
                cupFrequency[index] = numCupsUsed;
                remainingCapacity %= cups[index];
            }
            index--;
        }
        
        // Output the cup sizes and frequencies
        for (int i = 0; i < n; i++) {
            if (cupFrequency[i] > 0) {
                System.out.print(cups[i] + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            if (cupFrequency[i] > 0) {
                System.out.print(cupFrequency[i] + " ");
            }
        }
    }
}
