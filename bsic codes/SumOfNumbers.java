import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to sum: ");
        int n = scanner.nextInt();

        long startTime = System.nanoTime();
        int sum = calculateSum(n);
        long endTime = System.nanoTime();
        System.out.println("The sum is: " + sum);
        System.out.println("Time taken by calculateSum: " + (endTime - startTime) + " nanoseconds");

        startTime = System.nanoTime();
        int sum1 = calculateSum1(n);
        endTime = System.nanoTime();
        System.out.println("The sum1 is: " + sum1);
        System.out.println("Time taken by calculateSum1: " + (endTime - startTime) + " nanoseconds");

        scanner.close();
    }

    private static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    private static int calculateSum1(int n) {
        int sum = (n * (n + 1)) / 2;
        return sum;
    }
}
