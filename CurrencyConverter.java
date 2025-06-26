import java.util.Scanner;

public class CurrencyConverter {

    static String[] currencies = {"USD", "EUR", "INR", "GBP", "JPY", "NPR"};
    static double[] rates = {1.0, 0.92, 83.14, 0.78, 157.25, 132.50};

    public static double convert(int fromIndex, int toIndex, double amount) {
        double fromRate = rates[fromIndex];
        double toRate = rates[toIndex];
        return (amount / fromRate) * toRate;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Currency Converter ===");
        System.out.println("Supported currencies:");
        for (int i = 0; i < currencies.length; i++) {
            System.out.println((i + 1) + ". " + currencies[i]);
        }

        System.out.print("Choose source currency (1-" + currencies.length + "): ");
        int fromChoice = scanner.nextInt() - 1;

        System.out.print("Choose target currency (1-" + currencies.length + "): ");
        int toChoice = scanner.nextInt() - 1;

        System.out.print("Enter amount to convert: ");
        double amount = scanner.nextDouble();

        if (fromChoice < 0 || fromChoice >= currencies.length || toChoice < 0 || toChoice >= currencies.length) {
            System.out.println("Invalid choice(s).");
        } else {
            double result = convert(fromChoice, toChoice, amount);
            System.out.println(amount + " " + currencies[fromChoice] + " = " + result + " " + currencies[toChoice]);
        }

        scanner.close();
    }
}