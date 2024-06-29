public class siftzeroes {
  public static void Shift(int[] array) {
    int j = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] != 0 && array[j] == 0) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
      }
      if (array[j] != 0) {
        j++;
      }
    }
  }

  public static int[] resize(int[] arr, int capacity) {
    int[] temp = new int[capacity];
    for (int i = 0; i < arr.length; i++) {
      temp[i] = arr[i];
    }
    return temp;
  }

  public static void printing(int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
  }

  public static void main(String[] args) {
    int[] array = { 1, 3, 6, 0, 8, 0, 6, 0, 0, 7, 20 };
    Shift(array);
    printing(array);
    int capacity = 2 * array.length;
    array = resize(array, capacity);
    System.out.print("*************************");
    printing(array);
  }
}