public class minimum {
  public int findMinimum(int[] arr) {
    if (arr == null || arr.length == 0) {
      throw new IllegalArgumentException("invalid input");
    }
    int min = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    return min;
  }

  public static void main(String[] args) {
    System.out.println("This algo is for printing the minimum number in the array");
    int[] array = { 3, 6, 9, 5, 0, 34 };
    // int[] array1 = {};
    minimum minObj = new minimum(); // create an instance of the class
    int min = minObj.findMinimum(array); // call the method on the instance
    System.out.println("The minimum number in the array is: " + min);
  }
}
