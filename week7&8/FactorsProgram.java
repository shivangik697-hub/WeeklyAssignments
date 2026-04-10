import java.util.Scanner;
//aa
public class FactorsProgram {

    // Method to find factors and return array
    public static int[] getFactors(int num) {
        int count = 0;

        // Count factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;

        // Store factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Sum of factors
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        return sum;
    }

    // Product of factors
    public static long getProduct(int[] arr) {
        long product = 1;
        for (int x : arr) {
            product *= x;
        }
        return product;
    }

    // Sum of squares of factors
    public static double getSumOfSquares(int[] arr) {
        double sum = 0;
        for (int x : arr) {
            sum += Math.pow(x, 2);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] factors = getFactors(num);

        System.out.println("\nFactors:");
        for (int x : factors) {
            System.out.print(x + " ");
        }

        System.out.println("\nSum = " + getSum(factors));
        System.out.println("Product = " + getProduct(factors));
        System.out.println("Sum of Squares = " + getSumOfSquares(factors));

        sc.close();
    }
}