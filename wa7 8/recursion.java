import java.util.Scanner;

public class recursion {

    // Method using recursion
    static int sumRecursive(int n) {
        if (n == 1)
            return 1;
        return n + sumRecursive(n - 1);
    }

    // Method using formula
    static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        // Check if number is natural
        if (n <= 0) {
            System.out.println("Please enter a valid natural number (positive integer).");
        } else {
            int recursiveSum = sumRecursive(n);
            int formulaSum = sumFormula(n);

            System.out.println("Sum using recursion = " + recursiveSum);
            System.out.println("Sum using formula = " + formulaSum);

            // Compare results
            if (recursiveSum == formulaSum) {
                System.out.println("Both results are equal. Computation is correct.");
            } else {
                System.out.println("Results are not equal. There is an error.");
            }
        }

        sc.close();
    }
}