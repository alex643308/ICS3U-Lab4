import java.util.Scanner;

public class Main {

    public static boolean isStrongPassword(String password) {
        if (password == null || password.length() < 8) return false;
        boolean hasDigit = false;
        boolean hasUpper = false;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) hasDigit = true;
            if (Character.isUpperCase(c)) hasUpper = true;
            if (hasDigit && hasUpper) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a password to check: ");
        String pwd = scanner.nextLine();

        boolean strong = isStrongPassword(pwd);
        if (strong) {
            System.out.println("Password is strong ✅");
        } else {
            System.out.println("Password is weak ❌");
            System.out.println("Requirements: length >= 8, at least one digit, at least one uppercase letter.");
        }
        scanner.close();
    }
}