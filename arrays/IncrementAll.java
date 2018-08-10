/*
  Create a program
  that increments all
  the values in an
  array of length 7.

*/

public class IncrementAll {
   public static void main(String[] args) {
      int[] number = new int[7];
      for (int i = 0; i <= number.length - 1; i++) {
          number[i]++;
          System.out.println(number[i]);
      }
   }
}
