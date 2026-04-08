import java.util.Scanner;

public class LargestSecondLargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Input
        System.out.print("Enter a number: ");
        number = sc.nextInt();

        number = Math.abs(number); // handle negative numbers

        // Store digits in array
        while (number != 0) {
            if (index == maxDigit) {
                break; // stop if array is full
            }

            digits[index] = number % 10; // get last digit
            number = number / 10;        // remove last digit
            index++;
        }

        int largest = 0;
        int secondLargest = 0;

        // Find largest and second largest
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Output
        System.out.println("\nDigits stored in array:");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }

        System.out.println("\nLargest Digit = " + largest);
        System.out.println("Second Largest Digit = " + secondLargest);

        sc.close();
    }
}