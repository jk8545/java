public class secondmax {
  public int findmax(int[] arr) {
    if (arr == null || arr.length == 0) {
      throw new IllegalArgumentException("invalid input");
    }
    int max = arr[0];
    int secmax = arr[0];
    for (int i = 1; i < arr.length; i++) {

      if (arr[i] > max) {
        secmax = max;
        max = arr[i];
      } else if (arr[i] > secmax && arr[i] != max) {
        secmax = arr[i];

      }
    }
    return secmax;
  }

  public static void main(String[] args) {
    System.out.println("This algo is for printing the maixmum number in the array");
    int[] array = { 3, 5, 19, 5, 9, 5 };
    // int[] array1 = {};
    secondmax minObj = new secondmax(); // create an instance of the class
    int max = minObj.findmax(array); // call the method on the instance
    System.out.println("The maximum number in the array is: " + max);
  }
}
