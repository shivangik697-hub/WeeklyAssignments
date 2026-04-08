import java.util.Random;

public class FootballHeights {

    // Method to find sum
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        return sum;
    }

    // Method to find mean
    public static double getMean(int[] arr) {
        return (double) getSum(arr) / arr.length;
    }

    // Method to find shortest
    public static int getShortest(int[] arr) {
        int min = arr[0];
        for (int x : arr) {
            if (x < min) {
                min = x;
            }
        }
        return min;
    }

    // Method to find tallest
    public static int getTallest(int[] arr) {
        int max = arr[0];
        for (int x : arr) {
            if (x > max) {
                max = x;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] heights = new int[11];
        Random rand = new Random();

        // Generate random heights (150–250 cm)
        for (int i = 0; i < heights.length; i++) {
            heights[i] = rand.nextInt(101) + 150;
        }

        // Display heights
        System.out.println("Player Heights:");
        for (int h : heights) {
            System.out.print(h + " ");
        }

        // Results
        System.out.println("\n\nShortest Height = " + getShortest(heights));
        System.out.println("Tallest Height = " + getTallest(heights));
        System.out.println("Mean Height = " + getMean(heights));
    }
}