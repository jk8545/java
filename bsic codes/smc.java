public class smc {

  public static void missingnum(int[] arr, int n) {
    int sum = 0;
    int numsum = (n * (n + 1)) / 2;
    for (int i = 0; i < arr.length; i++) {
      sum = sum + arr[i];
    }
    int missnum = numsum - sum;
    System.out.println(missnum);
  }

  public static boolean charpalindrome(String word) {
    char[] charArray = word.toCharArray();
    int start = 0;
    int end = word.length() - 1;
    while (start < end) {
      if (charArray[start] != charArray[end]) {
        return false;
      }
      start++;
      end--;
    }
    return true;
  }

  public static void main(String[] args) {
    int[] array = { 3, 2, 1, 9, 7, 8, 4, 6 };
    missingnum(array, 9);
    String word = "muam";
    System.out.println(charpalindrome(word));
  }

}
