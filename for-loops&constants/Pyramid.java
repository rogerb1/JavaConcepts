/*
  Exercise five: for-loops/constants
  Write a program that produces the
  following output.
  
 Height 4
   
   !!!!!!!!!!!!!!
   \\!!!!!!!!!!//
   \\\\!!!!!!////
   \\\\\\!!//////
   
 Height 6
 
 !!!!!!!!!!!!!!!!!!!!!!!
 \\!!!!!!!!!!!!!!!!!!!//
 \\\\!!!!!!!!!!!!!!!////
 \\\\\\!!!!!!!!!!!//////
 \\\\\\\\!!!!!!!////////
 \\\\\\\\\\!!!//////////
  
 Height 8
 
 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 \\!!!!!!!!!!!!!!!!!!!!!!!!!!!!//
 \\\\!!!!!!!!!!!!!!!!!!!!!!!!////
 \\\\\\!!!!!!!!!!!!!!!!!!!!//////
 \\\\\\\\!!!!!!!!!!!!!!!!////////
 \\\\\\\\\\!!!!!!!!!!!!//////////
 \\\\\\\\\\\\!!!!!!!!////////////
 \\\\\\\\\\\\\\!!!!//////////////


*/

public class Pyramid {
   public static final int SIZE = 6;
   public static void main(String[] args) {
      figure();
   }
   
   public static void figure() {
      for (int i = 1; i <= SIZE; i++) {
         for (int j = 1; j <= 2 * i - 2; j++) {
            System.out.print("\\");
         }
         for (int k = 1; k <= -4 * i + (4.5 * SIZE); k++) {
            System.out.print("!");
         } 
         for (int j = 1; j <= 2 * i - 2; j++) {
            System.out.print("/");
         } 
         System.out.println();
      }
   }
}