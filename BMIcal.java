import java.util.Scanner;

public class Main {
    public static double calculateBMI(double w, double h) {
        return w / (h * h);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Weight (kg): ");
        double w = sc.nextDouble();
        System.out.print("Height (m): ");
        double h = sc.nextDouble();

        double bmi = calculateBMI(w, h);
        System.out.println("BMI = " + bmi);
        if (bmi < 18.5) System.out.println("Underweight");
        else if (bmi < 25) System.out.println("Normal");
        else if (bmi < 30) System.out.println("Overweight");
        else System.out.println("Obese");
        sc.close();
    }
}