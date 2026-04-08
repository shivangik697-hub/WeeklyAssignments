import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] table = new int[10];

        // Store multiplication results
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = num * i;
        }

        // Display table
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + table[i - 1]);
        }

        sc.close();
    }
}