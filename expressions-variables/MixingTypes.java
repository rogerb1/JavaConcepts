/*
   Create a program called MixingTypes
   
   Expected output: 
   
   Hello I am 55 years old!
   My age divided by 11 is 5
   My age multiplied by 2 is 110
   My age subtracted by 30 is 25
   I once was 12


*/

public class MixingTypes {
   public static void main(String[] args) {
      System.out.println("Hello I am " + 55 + " years old!");
      int ageDivided = 55 / 11;
      System.out.println("My age divided by 11 is " + ageDivided);
      int ageMultplied = 55  * 2;
      System.out.println("My age multiplied by 2 is " + ageMultplied);
      int ageSubtracted = 55 - 30;
      System.out.println("My age subtracted by 30 is " + ageSubtracted);
      int ageMixed = 55 * 2 / 10 + 2 - 1;
      System.out.println("I once was " + ageMixed);
   }
}