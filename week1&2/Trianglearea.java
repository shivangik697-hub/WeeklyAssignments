import java.util.Scanner;

public class Trianglearea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double base = sc.nextDouble();
        double height = sc.nextDouble();

        double area_cm = 0.5 * base * height;
        double area_in = area_cm / (2.54 * 2.54);

        System.out.println("The Area of the triangle in sq in is " + area_in + " and sq cm is " + area_cm);
        sc.close();
    }  
}