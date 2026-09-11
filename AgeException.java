import java.util.Scanner;

public class AgeException {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        String input = sc.nextLine();

        try {
            // Convert String to integer
            int age = Integer.parseInt(input);

            System.out.println("Age entered: " + age);

            // Demonstrate ArithmeticException
            int result = 100 / (age - age);

            System.out.println("Result: " + result);
        }

        catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Please enter numbers only.");
        }

        catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Cannot divide by zero.");
        }

        System.out.println("Program completed.");
        sc.close();
    }
}