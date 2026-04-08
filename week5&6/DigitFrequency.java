import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;

        // Input
        System.out.print("Enter a number: ");
        number = sc.nextInt();

        number = Math.abs(number); // handle negative numbers

        int temp = number;
        int count = 0;

        // Count digits
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }

        // Handle case when number is 0
        if (count == 0) {
            count = 1;
        }

        int[] digits = new int[count];
        int index = 0;

        // Store digits in array
        while (number != 0) {
            digits[index] = number % 10;
            number = number / 10;
            index++;
        }

        // Special case when number is 0
        if (index == 0) {
            digits[index] = 0;
            index++;
        }

        // Frequency array (0–9 digits)
        int[] freq = new int[10];

        // Count frequency
        for (int i = 0; i < index; i++) {
            int digit = digits[i];
            freq[digit]++;
        }

        // Display result
        System.out.println("\nDigit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " → " + freq[i] + " times");
            }
        }

        sc.close();
    }
}