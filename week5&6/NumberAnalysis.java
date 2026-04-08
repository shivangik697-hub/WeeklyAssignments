import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];

        // Input
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        // Process each number
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                System.out.print(nums[i] + " is Positive and ");
                if (nums[i] % 2 == 0)
                    System.out.println("Even");
                else
                    System.out.println("Odd");
            } else if (nums[i] < 0) {
                System.out.println(nums[i] + " is Negative");
            } else {
                System.out.println(nums[i] + " is Zero");
            }
        }

        // Compare first and last element
        if (nums[0] == nums[4]) {
            System.out.println("First and last elements are Equal");
        } else if (nums[0] > nums[4]) {
            System.out.println("First element is Greater than last element");
        } else {
            System.out.println("First element is Less than last element");
        }

        sc.close();
    }
}