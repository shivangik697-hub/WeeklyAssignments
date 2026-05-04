import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and status
    public static String[] findBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        double bmi = weight / (heightM * heightM);

        String status;

        if (bmi <= 18.4)
            status = "Underweight";
        else if (bmi <= 24.9)
            status = "Normal";
        else if (bmi <= 39.9)
            status = "Overweight";
        else
            status = "Obese";

        String[] result = new String[4];
        result[0] = String.valueOf(heightCm);
        result[1] = String.valueOf(weight);
        result[2] = String.format("%.2f", bmi);
        result[3] = status;

        return result;
    }

    // Method to process all members
    public static String[][] processBMI(double[][] data) {
        String[][] result = new String[10][4];

        for (int i = 0; i < 10; i++) {
            result[i] = findBMI(data[i][0], data[i][1]);
        }

        return result;
    }

    // Display in table format
    public static void display(String[][] result) {
        System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\tStatus");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(result[i][j] + "\t\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];

        System.out.println("Enter Weight (kg) and Height (cm) for 10 members:");

        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1));

            System.out.print("Weight: ");
            data[i][0] = sc.nextDouble();

            System.out.print("Height: ");
            data[i][1] = sc.nextDouble();
        }

        String[][] result = processBMI(data);
        display(result);

        sc.close();
    }
}