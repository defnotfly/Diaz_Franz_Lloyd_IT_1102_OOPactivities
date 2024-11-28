import java.util.Scanner;

public class GetArrayMean {
    
    // Function to calculate the mean of an integer array
    public static double getArrayMean(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length; // Cast sum to double for accurate division
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the number of elements
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Create an array to store the elements
        int[] array = new int[n];

        // Create loop for array elements
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number: ");
            array[i] = scanner.nextInt();
        }

        // Calculate the mean using the function and print the result
        double mean = getArrayMean(array);
        System.out.printf("Mean of array: %.2f%n", mean); // Format to 2 decimal places

        scanner.close();
    }
}
