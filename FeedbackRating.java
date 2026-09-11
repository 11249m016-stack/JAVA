import java.util.Scanner;

public class FeedbackRating {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] ratings = new int[5];
        int sum = 0;

        // Input 5 ratings
        System.out.println("Enter 5 feedback ratings:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Rating " + (i + 1) + ": ");
            ratings[i] = sc.nextInt();
            sum = sum + ratings[i];
        }

        // Calculate average
        double average = (double) sum / 5;

        System.out.println("\nTotal Rating = " + sum);
        System.out.println("Average Rating = " + average);

        sc.close();
    }
}