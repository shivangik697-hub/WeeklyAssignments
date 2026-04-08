import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] arr = new double[10]; // array of size 10
        double total = 0.0;            // sum variable
        int index = 0;                // index tracker

        System.out.println("Enter numbers (0 or negative number to stop):");

        // Infinite loop
        while (true) {
            double num = sc.nextDouble();

            // Stop if number is 0 or negative
            if (num <= 0) {
                break;
            }

            // Stop if array is full
            if (index == 10) {
                break;
            }

            // Store number in array
            arr[index] = num;
            index++;
        }

        // Display numbers and calculate sum
        System.out.println("\nEntered numbers:");
        for (int i = 0; i < index; i++) {
            System.out.println(arr[i]);
            total += arr[i];
        }

        // Display total
        System.out.println("\nTotal sum = " + total);

        sc.close();
    }
}