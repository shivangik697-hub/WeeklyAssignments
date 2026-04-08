import java.util.Scanner;

public class NumberChecker {

    // Count digits
    public static int countDigits(int num) {
        num = Math.abs(num);
        int count = 0;

        while (num != 0) {
            num /= 10;
            count++;
        }

        return (count == 0) ? 1 : count;
    }

    // Store digits in array
    public static int[] getDigits(int num) {
        num = Math.abs(num);
        int count = countDigits(num);

        int[] digits = new int[count];
        int index = 0;

        while (num != 0) {
            digits[index++] = num % 10;
            num /= 10;
        }

        if (index == 0) {
            digits[0] = 0;
        }

        return digits;
    }

    // Duck number (contains at least one zero)
    public static boolean isDuck(int[] digits) {
        for (int d : digits) {
            if (d == 0) return true;
        }
        return false;
    }

    // Armstrong number
    public static boolean isArmstrong(int num, int[] digits) {
        int power = digits.length;
        int sum = 0;

        for (int d : digits) {
            sum += Math.pow(d, power);
        }

        return sum == Math.abs(num);
    }

    // Largest & second largest
    public static void findLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int d : digits) {
            if (d > largest) {
                second = largest;
                largest = d;
            } else if (d > second && d != largest) {
                second = d;
            }
        }

        System.out.println("Largest = " + largest);
        System.out.println("Second Largest = " + second);
    }

    // Smallest & second smallest
    public static void findSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int d : digits) {
            if (d < smallest) {
                second = smallest;
                smallest = d;
            } else if (d < second && d != smallest) {
                second = d;
            }
        }

        System.out.println("Smallest = " + smallest);
        System.out.println("Second Smallest = " + second);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] digits = getDigits(num);

        System.out.println("Digit Count = " + countDigits(num));
        System.out.println("Duck Number = " + isDuck(digits));
        System.out.println("Armstrong Number = " + isArmstrong(num, digits));

        findLargest(digits);
        findSmallest(digits);

        sc.close();
    }
}