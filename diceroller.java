import java.util.Scanner;

public class Main {
    public static int rollDie(int sides) {
        return (int)(Math.random() * sides) + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sides (6 default): ");
        String input = sc.nextLine();
        int sides = input.isEmpty() ? 6 : Integer.parseInt(input);

        int d1 = rollDie(sides);
        int d2 = rollDie(sides);

        System.out.println("Rolled: " + d1 + " and " + d2);
        sc.close();
    }
}