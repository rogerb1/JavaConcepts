/*
   
  Exercise two:  Parameters
   
  Create a program that takes two parameters
  that prints out desired number, and desired
  amount of times. For example, if you 
  wanted to print 14 three times.
  
  Example output:
  
  141414
  
  Expected output:
  
  12121212
  444444444
  55555555555
  
*/

// Prints out a specific number
// a desired amount of times.

public class MultipleParameters {
   public static void main(String [] args) {
      printNumber(12, 5);
      printNumber(4, 9);
      printNumber(5, 11);
   }
   
   // Takes number and count as parameters
   // Prints numbers
   public static void printNumber(int number, int count) {
      for (int i = 1; i <= count; i++) {
         System.out.print(number);
      }
      System.out.println();
   }
}