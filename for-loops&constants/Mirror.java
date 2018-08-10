/*
   
 Create the following figure and modify it to
 be resizable. 


 #============#
 |    <><>    |
 |  <>....<>  |
 |<>........<>|
 |<>........<>|
 |  <>....<>  |
 |    <><>    |
 #============#



*/


// Creates an ASCII art pattern mirror.
// This version includes a constant for drawing mirrors of diffrent sizes.

public class Mirror {
   public static final int SIZE = 4; // Change size to scale mirror
   public static void main(String [] args) {
      drawLine();
      drawTopHalf();
      drawBottomHalf();
      drawLine();
   }
   
   // Draws a solid line pattern
   public static void drawLine() {
      System.out.print("#");
      for (int i = 1; i <= 4 * SIZE; i++) {
         System.out.print("=");
      }
      System.out.println("#");
   }
   
   // Draws the top side of the mirror
   public static void drawTopHalf() {
      for (int line = 1; line <= SIZE; line++) {
         System.out.print("|");
         for (int spaces = 1; spaces <= (-2 * line + 2 * SIZE); spaces++) {
            System.out.print(" ");
         }
         System.out.print("<>");
         for (int dots = 1; dots <= 4 * line -4; dots++) {
            System.out.print(".");
         }
         System.out.print("<>");
         for (int spaces = 1; spaces <= (-2 * line + 2 * SIZE); spaces++) {
            System.out.print(" ");
         }
         System.out.println("|");
      }
   }
   
   // Draws the bottom side of the mirror
   public static void drawBottomHalf() {
        for (int line = SIZE; line >= 1; line--) {
            System.out.print("|");
            for (int spaces = 1; spaces <= (-2 * line + 2 * SIZE); spaces++) {
                System.out.print(" ");
            }
            System.out.print("<>");
            for (int dots = 1; dots <= 4 * line - 4; dots++) {
                System.out.print(".");
            }
            System.out.print("<>");
            for (int spaces = 1; spaces <= (-2 * line + 2 * SIZE); spaces++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
}