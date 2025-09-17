import java.util.Scanner;

public class Main {
    public static double average(int[] marks) {
        int sum = 0;
        for (int m : marks) sum += m;
        return (double) sum / marks.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many subjects? ");
        int n = sc.nextInt();
        int[] marks = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Mark " + (i+1) + ": ");
            marks[i] = sc.nextInt();
        }

        double avg = average(marks);
        System.out.println("Average = " + avg);
        System.out.println(avg >= 50 ? "Pass" : "Fail");
        sc.close();
    }
}