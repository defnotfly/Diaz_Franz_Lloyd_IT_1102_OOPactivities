import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the size of the multiplication table
        System.out.print("Enter the size of the multiplication table: ");
        int size = scanner.nextInt();

        // Create a 2D array to store the multiplication table
        int[][] table = new int[size][size];

        // Create multiplication table results
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table[i][j] = (i + 1) * (j + 1); // Multiplying (i+1) and (j+1) to avoid 0-based index issue
            }
        }

        // Print the multiplication table
        System.out.println("Multiplication Table:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("%4d", table[i][j]); // Format each number to be 4 characters wide
            }
            System.out.println(); // Move to the next line after printing each row
        }

        scanner.close();
    }
}
