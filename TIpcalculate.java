import java.util.Scanner;
public class Main {
    public static int calculateTip(int doublebill, int doublepercent) {
        return doublebill + (doublebill * doublepercent/100);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input your total bill amount please:");
        int doublebill = scanner.nextInt();
        System.out.println("input the percentage of tip you wanna give:");
        int doublepercent = scanner.nextInt();
        int totalamount = calculateTip(doublebill, doublepercent);
        System.out.println("total bill amount will be " + totalamount);
        scanner.close();
    }
}