import java.util.Scanner;

/**
 * Created by DJP4830 on 2/24/2017.
 */
public class UtilityClasses {

    public static double input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        double number = scanner.nextDouble();
        return number;
    }

    public static int integerInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();
        return number;
    }

    public static long longInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        long number = scanner.nextLong();
        return number;
    }

    public static String stringInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String string = scanner.nextLine();
        return string;
    }
}
