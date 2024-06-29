// import java.util.Scanner;

public class EvenOddNums {
  public static void printNumbers(int[] array) {
    for (int number : array) {
      if (number % 2 != 0) {
        System.out.println(number);
      }
    }
  }

  public static void evenNums(int[] array) {
    System.out.println("even numbers");
    for (int i = 0; i < array.length; i++) {
      if (array[i] % 2 == 0) {
        System.out.println(array[i]);
      }
    }
  }

  public static void reverse(int[] array, int start, int end) {
    System.out.println("reverse of an array");
    while (start <= end) {
      int temp = array[start];
      array[start] = array[end];
      array[end] = temp;
      start++;
      end--;
    }

  }

  public static void main(String[] args) {
    // Scanner scanner = new Scanner(System.in);
    int[] myArrays = { 1, 3, 5, 6, 7, 2, 15, 23 };

    // Corrected the typo in the print statement
    System.out.println("Odd numbers in the array:");
    printNumbers(myArrays);
    evenNums(myArrays);
    reverse(myArrays, 0, myArrays.length - 1);
    // print reversed array
    System.out.println("reversed arrays");
    for (int num : myArrays) {
      System.out.print(num + " ");
    }
  }
}
